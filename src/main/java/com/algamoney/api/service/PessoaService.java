package com.algamoney.api.service;

import com.algamoney.api.model.Pessoa;
import com.algamoney.api.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizar(Long codigo, Pessoa pessoa){
        Optional<Pessoa> pessoaSalva = pessoaRepository.findById(codigo);
        if(pessoaSalva.isEmpty()){
            throw new EmptyResultDataAccessException(1);
        }
        BeanUtils.copyProperties(pessoa, pessoaSalva.get(), "codigo");
        pessoaRepository.save(pessoaSalva.get());
        return pessoaSalva.get();
    }
}
