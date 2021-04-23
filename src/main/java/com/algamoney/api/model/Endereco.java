package com.algamoney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    public String logradouro;
    public String numero;
    public String complemento;
    public String bairro;
    public String cep;
    public String cidade;
    public String estado;
}
