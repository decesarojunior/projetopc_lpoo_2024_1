
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_raca")
@NamedQueries({@NamedQuery(name="Raca.orderbyid", query="select r from Raca r order by r.id asc")})
public class Raca implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_raca", sequenceName = "seq_raca_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_raca", strategy = GenerationType.SEQUENCE)   
    private Integer id;
    
    @Column(nullable = false, length = 200)
    private String nome;

    public Raca() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
