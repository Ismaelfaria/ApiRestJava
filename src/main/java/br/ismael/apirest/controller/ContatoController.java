package br.ismael.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ismael.apirest.model.Contato;
import br.ismael.apirest.repository.ContatoRepositorio;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/Contato")
public class ContatoController {

    @Autowired
    private ContatoRepositorio repositorio;

    @GetMapping
    public List<Contato> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public Contato adicionar(@RequestBody Contato contato){
       return repositorio.save(contato);
    }

    @PutMapping
    public Contato atualizar(@RequestBody Contato contato){

        if(contato.getId() > 0){
            return repositorio.save(contato);
        }else{
            return null;
        }
    }

    @DeleteMapping
    public String deletar(@RequestBody Contato contato){
        if(contato.getId() > 0){
            repositorio.delete(contato);
            return "Removido com sucesso";
        }else{
            return "Erro ao remover contato";
        }
    }

}
