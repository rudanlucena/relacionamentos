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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

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
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "culular")
    private Cellular cellular;
    
    @ManyToMany(cascade = CascadeType.ALL)
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

    public Cellular getCellular() {
        return cellular;
    }

    public void setCellular(Cellular cellular) {
        this.cellular = cellular;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }   
    
}
