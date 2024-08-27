package com.application.domain.product;

import jakarta.validation.constraints.NotNull;

public record RequestProduct(

        String id,
        @NotNull
        //@Pattern(regexp = "^[a-zA-Z]+$", message = "O campo deve conter apenas letras")
        String nome,
        //@Pattern(regexp = "^[a-zA-Z]+$", message = "O campo deve conter apenas letras")
        String descricao,
        //@Pattern(regexp = "^[a-zA-Z]+$", message = "O campo deve conter apenas letras")
        String categoria,
        //@Pattern(regexp = "\\d+", message = "O campo deve conter um numero")
        double preco,
        //@Pattern(regexp = "\\d+", message = "O campo deve conter um numero")
        int estoque,
        //@Pattern(regexp = "^[a-zA-Z]+$", message = "O campo deve conter apenas letras")
        String venda_id) {
}
