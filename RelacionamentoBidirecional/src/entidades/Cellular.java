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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author rudan
 */
@Entity
public class Cellular implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private int number;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cellular")
    private Person person;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cellular")
    private List<Cal> calls;

    public Cellular() {
    }

    public Cellular(int number) {
        this.number = number;
        this.calls = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Cal> getCalls() {
        return calls;
    }

    public void setCalls(List<Cal> calls) {
        this.calls = calls;
    }
    
    public void addCall(Cal cal){
        calls.add(cal);
    }
    
        
}
