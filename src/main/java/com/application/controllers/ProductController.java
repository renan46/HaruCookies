package com.application.controllers;

import com.application.domain.product.Product;
import com.application.domain.product.ProductRepository;
import com.application.domain.product.RequestProduct;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductRepository repository;
    @GetMapping
    public ResponseEntity getAllProduct(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);

    }
    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        Product newProduct = new Product(data);
        System.out.println(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data){
        Optional<Product> optionalProduct = repository.findById(data.id());
        if(optionalProduct.isPresent()){
           // Product product = repository.getReferenceById(data.id());
            Product product = optionalProduct.get();
            product.setNome(data.name());
            product.setDescricao(data.descricao());
            product.setCategoria(data.categoria());
            product.setPreco(data.preco());
            product.setEstoque(data.estoque());
            product.setVenda_id(data.venda_id());
            return  ResponseEntity.ok(product);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable String id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();


    }



}
