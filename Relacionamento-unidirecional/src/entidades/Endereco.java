/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author rudan
 */
@Entity
public class Endereco implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String rua;
    private String estado;
    

    public Endereco() {
    }

    public Endereco(String rua, String estado) {
        this.rua = rua;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
