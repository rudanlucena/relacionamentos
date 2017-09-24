/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rudan
 */
@Entity
@IdClass(PersnoDogId.class)
public class PersonDog implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Dog dog;
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Person person;
    @Temporal(TemporalType.DATE)
    private Date adoptionDate;

    public PersonDog() {
    }

    public PersonDog(Dog dog, Person person, Date adoptionDate) {
        this.dog = dog;
        this.person = person;
        this.adoptionDate = adoptionDate;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(Date adoptionDate) {
        this.adoptionDate = adoptionDate;
    }
    
    
}
