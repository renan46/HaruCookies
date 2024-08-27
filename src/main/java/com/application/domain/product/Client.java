package com.application.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "client")
@Entity(name="client")
@EqualsAndHashCode(of="id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private boolean sexoM;

    private String telefone;

    private String torre;

    private String apto;

    private String endereco;

    private String observacao;


    public Client(RequestClient requestClient ) {
        this.nome = requestClient.nome();
        this.sexoM = requestClient.sexoM();
        this.telefone = requestClient.telefone();
        this.torre = requestClient.torre();
        this.apto = requestClient.apto();
        this.endereco = requestClient.endereco();
        this.observacao = requestClient.observacao();
    }
}
