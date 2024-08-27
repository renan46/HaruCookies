package com.application.domain.product;

import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record RequestClient(


        String id,

        @NotNull
        String nome,
        boolean sexoM,

        String telefone,

        String torre,

        String apto,

        String endereco,

        String observacao

//        Date created_at,
//
//        Date updated_at



        ) {









}
