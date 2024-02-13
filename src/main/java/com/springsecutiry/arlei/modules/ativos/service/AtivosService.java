package com.springsecutiry.arlei.modules.ativos.service;

import java.util.List;

import com.springsecutiry.arlei.modules.ativos.entity.Ativo;
import com.springsecutiry.arlei.modules.ativos.respository.AtivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtivosService {

    @Autowired
    AtivoRepository _ativoRepository;

    public List<Ativo> listAll() {
        return _ativoRepository.findAll();
    }

    public List<Ativo> getAtivosOrderedByPlDesc() {
        return _ativoRepository.findAllByOrderByPlDesc();
    }
}
