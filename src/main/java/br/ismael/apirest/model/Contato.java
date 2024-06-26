package br.ismael.apirest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Contato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    private String ulrAvatar;

    public Contato(Long id, String nome, String telefone, String email, String ulrAvatar) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.ulrAvatar = ulrAvatar;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUlrAvatar() {
        return ulrAvatar;
    }

    public void setUlrAvatar(String ulrAvatar) {
        this.ulrAvatar = ulrAvatar;
    }

    
}
