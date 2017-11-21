package br.com.everton.aula.Service;

import br.com.everton.aula.model.Nota;
import br.com.everton.aula.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NotaComponent {

    @Autowired
    NotaRepository notaRepository;

    public void salva(Nota nota){
        List<Nota> notas = notaRepository.findByTitulo(nota.getTitulo());
        nota.
    }
}
