package com.algamoney.api.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Endereco {

    public String logradouro;
    public String numero;
    public String complemento;
    public String bairro;
    public String cep;
    public String cidade;
    public String estado;
}
