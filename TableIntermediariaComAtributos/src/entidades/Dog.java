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
public class Dog implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    
    private String nome;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dogs")
    private List<Person> persons;

    public Dog() {
    }

    public Dog(String nome) {
        this.nome = nome;
        this.persons = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    
    
            
}
