/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author rudan
 */
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persons")
    private List<Dog> dogs;

    public Person() {
    }

    public Person(String nome) {
        this.nome = nome;
        this.dogs = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }   
    
}
