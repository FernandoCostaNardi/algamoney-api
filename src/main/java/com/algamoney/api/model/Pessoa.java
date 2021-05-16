package com.algamoney.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long codigo;

    @NotNull
    public String nome;

    @NotNull
    public boolean ativo;

    @Embedded
    public Endereco endereco;

    @JsonIgnore
    @Transient
    public boolean isInativo() {
        return !this.ativo;
    }

}
