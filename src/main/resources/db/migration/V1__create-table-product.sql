

CREATE TABLE product (
    id VARCHAR(36) PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    categoria VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    estoque INT NOT NULL,
    venda_id VARCHAR(36)
--    created_at DATETIME,
--    updated_at DATETIME

);
