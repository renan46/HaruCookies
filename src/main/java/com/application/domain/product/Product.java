package com.application.domain.product;
import jakarta.persistence.*;
import lombok.*;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String descricao;

    private String categoria;

    private double preco;

    private int estoque;

    private String venda_id;

//    private Date created_at;
//
//    private Date updated_at;

    public Product(RequestProduct requestProduct){
        this.nome = requestProduct.nome();
        this.descricao = requestProduct.descricao();
        this.categoria = requestProduct.categoria();
        this.preco = requestProduct.preco();
        this. estoque = requestProduct.estoque();
        this.venda_id = requestProduct.venda_id();
//        this.created_at = requestProduct.created_at();
//        this.updated_at = requestProduct.updated_at;

    }


}
