/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author rudan
 */
@Entity
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private int idade;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Endereco")
    private Endereco endereco;
    
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telefone> telefones = new HashSet<>();
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Faculdade")
    private Faculdade faculdade;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private Collection<Hobby> hobbies;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.hobbies = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public Collection<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Collection<Hobby> hobbies) {
        this.hobbies = hobbies;
    }    
    
}
