/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entidades.Cal;
import entidades.Cellular;
import entidades.Dog;
import entidades.Person;
import java.util.ArrayList;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoBidirecionalPU");
        EntityManager entityManager = emf.createEntityManager();
        
        List<Person> persons = new ArrayList<>();
        Person person = new Person("Rudan lucena");
        persons.add(person);
        
        Cellular cellular = new Cellular(123456789);
        List<Cal> calls = new ArrayList<>();
        Cal cal = new Cal(cellular, 105);
        calls.add(cal);
        List<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("marramed");
        dogs.add(dog);
        
        person.setCellular(cellular);
        cellular.setPerson(person);
        cal.setCellular(cellular);
        cellular.setCalls(calls);
        person.setDogs(dogs);
        dog.setPersons(persons);
                
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
    }
}
