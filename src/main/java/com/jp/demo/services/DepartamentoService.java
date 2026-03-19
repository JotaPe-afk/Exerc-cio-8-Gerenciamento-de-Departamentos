package com.jp.demo.services;

import com.jp.demo.models.DepartamentoModel;
import com.jp.demo.repositories.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    private DepartamentoRepository departamentoRepository;

    public DepartamentoModel cadastrar(DepartamentoModel cliente){
        return departamentoRepository.save(cliente);
    }

    public List<DepartamentoModel> findAll(){
        return departamentoRepository.findAll();
    }

    public DepartamentoModel buscar(Long id){
        return departamentoRepository.findById(id).get();
    }

    public void delete(Long id){
        departamentoRepository.deleteById(id);
    }
}
