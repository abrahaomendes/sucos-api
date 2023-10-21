package br.com.unigoias.sucos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unigoias.sucos.model.Suco;
import br.com.unigoias.sucos.service.SucoService;

@RestController
@RequestMapping("/sucos")
public class SucoController {

    @Autowired
    private SucoService sucoService;

    @GetMapping("/{id}")
    public ResponseEntity<Suco> findById(@PathVariable Long id) {
        Optional<Suco> suco = sucoService.findById(id);
        if(suco.isPresent()){
           return ResponseEntity.ok().body(suco.get());
        }else{
           return ResponseEntity.noContent().build();
        }
    }
    @GetMapping
    public List<Suco> findAll(){
        return sucoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Suco> create(@RequestBody Suco suco){
        Suco s = sucoService.create(suco);
        return ResponseEntity.created(null).body(s);
    }
}
