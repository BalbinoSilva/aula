package br.com.everton.aula.controller;

import br.com.everton.aula.Service.NotaComponent;
import br.com.everton.aula.model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/nota")
public class NotaController {
    @Autowired
    private NotaComponent notaComponent;

    @GetMapping
    private List<Nota> findAll() {
        return notaComponent.findAll();
    }

    @GetMapping(value = "/titulo/{titulo}")
    private Nota findAll(@PathVariable(value = "titulo") String titulo) {
        return notaComponent.buscarNota(titulo);
    }

    @PostMapping
    private void save(@RequestBody Nota nota) {
        notaComponent.salvar(nota);
    }

    @DeleteMapping
    private void deleteAll() {
        notaComponent.deleteAll();
    }
}
