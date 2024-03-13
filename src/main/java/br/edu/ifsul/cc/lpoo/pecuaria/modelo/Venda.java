
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "tb_venda")
public class Venda implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_venda", sequenceName = "seq_venda_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_venda", strategy = GenerationType.SEQUENCE)   
    private Integer id;
    
    @Column(nullable = false, precision = 2)
    private Float valor;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data;
    
    @Column(nullable = true, length = 200)
    private String observacoes;
    
    @ManyToMany
    @JoinTable(name = "tb_venda_bovino", 
            joinColumns = {@JoinColumn(name = "venda_id")}, //agregacao, vai gerar uma tabela associativa.
            inverseJoinColumns = {@JoinColumn(name = "bovino_id")})       
    private Collection<Bovino> bovinos;//agregação.
    
    @ManyToOne
    @JoinColumn(name = "cliente_cpf", nullable = false)
    private Cliente cliente;//associação.

    @ManyToOne
    @JoinColumn(name = "funcionario_cpf", nullable = false)    
    private Funcionario funcionario;//associação.

    public Venda() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Collection<Bovino> getBovinos() {
        return bovinos;
    }

    public void setBovinos(Collection<Bovino> bovinos) {
        this.bovinos = bovinos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
