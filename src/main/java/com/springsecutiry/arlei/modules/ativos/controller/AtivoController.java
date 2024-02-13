package com.springsecutiry.arlei.modules.ativos.controller;

import java.util.List;

import com.springsecutiry.arlei.modules.ativos.entity.Ativo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecutiry.arlei.modules.ativos.service.AtivosService;

@RestController
@RequestMapping("/ativos")
public class AtivoController {

    @Autowired
    AtivosService _ativosService;

    @GetMapping("/buscarTodos")
    public List<Ativo> list() {
        return _ativosService.listAll();
    }

    @GetMapping("/ordenar-por-pl")
    public List<Ativo> getAtivosOrderedByPlDesc() {
        return _ativosService.getAtivosOrderedByPlDesc();
    }

}
