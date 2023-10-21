package br.com.unigoias.sucos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unigoias.sucos.Repository.SucoRepository;
import br.com.unigoias.sucos.model.Suco;

@Service
public class SucoService {

    @Autowired
    private SucoRepository sucoRepository;

    public Suco create(Suco suco){
        Suco newSuco = sucoRepository.save(suco);
        return newSuco;
    }

    public Optional<Suco> findById(Long id){
        return sucoRepository.findById(id);
    }
    public List<Suco> findAll(){
        return sucoRepository.findAll();
    }

}
