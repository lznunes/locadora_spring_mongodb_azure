package com.nunes.locadora.controller;

import com.nunes.locadora.document.LocadoraDoc;
import com.nunes.locadora.service.LocadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class LocadoraController {


    @Autowired
    LocadoraService service;

    @GetMapping("/locacao")
    public ResponseEntity<List<LocadoraDoc>> getAll()
    {
        return service.pesquisa();
    }

    @PostMapping("/locacao")
    public ResponseEntity<LocadoraDoc> salva(@RequestBody @Valid LocadoraDoc locadoraDoc)
    {
        return service.salvar(locadoraDoc);
    }


}
