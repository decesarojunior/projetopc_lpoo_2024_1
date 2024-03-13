
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author telmo
 */

@Entity
@Table(name = "tb_pesagem")
public class Pesagem implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_pesagem", sequenceName = "seq_pesagem_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pesagem", strategy = GenerationType.SEQUENCE)   
    private Integer id;
    
    @Column(nullable = false, precision = 2)
    private Float peso;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data;//obrigatorio
    
    @ManyToOne
    @JoinColumn(name = "bovino_id", nullable = false)
    private Bovino bovino;

    public Pesagem() {
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    
    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
    
    
    
}
