package com.application.controllers;

import com.application.domain.product.Client;
import com.application.domain.product.ClientRepository;
import com.application.domain.product.RequestClient;
import com.application.domain.product.RequestProduct;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository repository;
    @GetMapping
    public ResponseEntity getAllClient(){
        var allClient = repository.findAll();
        return ResponseEntity.ok(allClient);
    }
    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestClient data){
        Client newClient = new Client(data);
        System.out.println(data);
        repository.save(newClient);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    @Transactional
    public ResponseEntity updateClient(@RequestBody @Valid RequestClient data){
        Optional<Client> optionalClient = repository.findById(data.id());
        if(optionalClient.isPresent()){
            Client cliente = optionalClient.get();
            cliente.setNome(data.nome());
            cliente.setSexoM(data.sexoM());
            cliente.setTelefone(data.telefone());
            cliente.setApto(data.apto());
            cliente.setEndereco(data.endereco());
            cliente.setObservacao(data.observacao());
            return  ResponseEntity.ok(cliente);

        }else{
            return ResponseEntity.notFound().build();
        }


    }
    @DeleteMapping("/{id}")
    public ResponseEntity deteleClient(@PathVariable String id){
        repository.deleteById(id);
        return ResponseEntity.noContent().build();



    }


}
