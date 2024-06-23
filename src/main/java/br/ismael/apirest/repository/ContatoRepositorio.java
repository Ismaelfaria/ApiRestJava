package br.ismael.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ismael.apirest.model.Contato;

public interface ContatoRepositorio extends JpaRepository<Contato, Long>{

}
