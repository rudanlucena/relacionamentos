/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entidades.Dog;
import entidades.Person;
import entidades.PersonDog;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rudan
 */
public class Loader {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TableIntermediariaComAtributosPU");
        EntityManager entityManager = emf.createEntityManager();
        
        Person person = new Person("Rudan lucena");
        Dog dog = new Dog("Spike");
        Date adoptionDate = new Date("12/12/2017");
        
        
        List<Person> persons = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        
        dog.setPersons(persons);
        person.setDogs(dogs);
        
        PersonDog personDog = new PersonDog(dog, person, adoptionDate);
        
        entityManager.getTransaction().begin();
        entityManager.persist(personDog);
        entityManager.getTransaction().commit();

    }
}
