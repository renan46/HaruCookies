CREATE TABLE product (
    id VARCHAR(36) PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    categoria VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    estoque INT NOT NULL,
    venda_id VARCHAR(36)
    -- created_at DATETIME,
    -- updated_at DATETIME
);

CREATE TABLE client (
    id VARCHAR(36) PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    sexoM BOOLEAN,
    telefone VARCHAR(11),
    torre VARCHAR(50),
    apto VARCHAR(50),
    endereco VARCHAR(255),
    observacao VARCHAR(255)
    -- created_at DATETIME,
    -- updated_at DATETIME
);
