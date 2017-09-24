/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author rudan
 */
@Entity
public class Cal implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cellular")
    private Cellular cellular;
    private long duration;

    public Cal() {
    }

    public Cal(Cellular cellular, long duration) {
        this.cellular = cellular;
        this.duration = duration;
    }

    public Cellular getCellular() {
        return cellular;
    }

    public void setCellular(Cellular cellular) {
        this.cellular = cellular;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
  
}
