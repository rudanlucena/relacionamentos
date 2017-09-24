/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entidades.Endereco;
import entidades.Faculdade;
import entidades.Hobby;
import entidades.Pessoa;
import entidades.Telefone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rudan
 */
public class Loader {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoUnidirecionalPU");
                                                                            
        EntityManager entityManager = emf.createEntityManager();
        
        Endereco end = new Endereco("canao", "SP");
        
        Telefone t1 = new Telefone("4002-8922", "residencial");
        Set<Telefone> phones = new HashSet();
        phones.add(t1);
        
        Faculdade faculdade = new Faculdade("IFPB", end);
        
        Hobby hobby = new Hobby("jogar futebol");
        Collection<Hobby> hobbies = new ArrayList<>();
        hobbies.add(hobby);
        
        Pessoa p = new Pessoa("Rudan lucena", 19, end);
        p.setTelefones(phones);
        p.setFaculdade(faculdade);
        p.setHobbies(hobbies);
        
        
        
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
    }
}
