package com.jp.demo.controllers;

import com.jp.demo.models.DepartamentoModel;
import com.jp.demo.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public DepartamentoModel cadastrar(DepartamentoModel cliente){
        return departamentoService.cadastrar(cliente);
    }

    @GetMapping
    public List<DepartamentoModel> findAll(){
        return departamentoService.findAll();
    }

    @GetMapping("/{id}")
    public DepartamentoModel buscar(Long id){
        return departamentoService.buscar(id);
    }

    @DeleteMapping
    public void delete(Long id){
        departamentoService.delete(id);
    }
}
