package com.nunes.locadora.service;

import com.nunes.locadora.document.LocadoraDoc;
import com.nunes.locadora.repositories.LocadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocadoraService {

    @Autowired
    LocadoraRepository repository;

    public ResponseEntity<List<LocadoraDoc>> pesquisa(){
        List<LocadoraDoc> locacao = repository.findAll();
        if(!locacao.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<List<LocadoraDoc>>(locacao, HttpStatus.OK);
        }
    }

    public ResponseEntity<LocadoraDoc> salvar(LocadoraDoc locadoraDoc){
        return new ResponseEntity<LocadoraDoc>(repository.save(locadoraDoc), HttpStatus.CREATED);
    }
}
