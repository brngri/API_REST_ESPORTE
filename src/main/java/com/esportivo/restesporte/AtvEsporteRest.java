package com.esportivo.restesporte;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.esportivo.restesporte.database.RepositorioEsporte;
import com.esportivo.restesporte.entidade.AtvEsporte;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")

public class AtvEsporteRest {
    @Autowired
    private RepositorioEsporte repositorio;

    @GetMapping
    public List<AtvEsporte> listar() {
        return repositorio.findAll();
    }

    @GetMapping("/{atvId}")
    public AtvEsporte listarPorId(@PathVariable Long atvId) {
        return repositorio.findById(atvId).orElseThrow();
    }

    @PostMapping
    public void cadastrar(@RequestBody AtvEsporte esporte) {
        repositorio.save(esporte);
    }

    @DeleteMapping
    public void deletar(@RequestBody AtvEsporte esporte) {
        repositorio.delete(esporte);
    }

}
