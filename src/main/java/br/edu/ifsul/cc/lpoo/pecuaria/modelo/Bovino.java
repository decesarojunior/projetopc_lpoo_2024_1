
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_bovino")
public class Bovino implements Serializable {
    
    @Id
    @SequenceGenerator(name = "seq_bovino", sequenceName = "seq_bovino_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_bovino", strategy = GenerationType.SEQUENCE)   
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_inicio;//obrigatorio
    
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
    private Calendar data_fim;//opcional
    
    @Column(nullable = false, precision = 2)
    private Float peso_chegada;//obrigatorio
    
    @Column(nullable = true, precision = 2)
    private Float peso_atual;//não obrigatorio
    
    @Column(nullable = false, precision = 2)
    private Float valor_kg_compra;//obrigatorio
    
    @Column(nullable = true, precision = 2)
    private Float valor_kg_venda;//não obrigatorio
    
    @Column(nullable = false, precision = 2)
    private Float custo_diario;//obrigatorio
    
    @Column(nullable = true, precision = 2)
    private Float valor_liquido;//opcional
    
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Situacao situacao;//associação
    
    @ManyToOne
    @JoinColumn(name = "raca_id", nullable = false)
    private Raca raca;//associação
    
    //mappedBy deve apontar para a referencia de bovino dentro de Pesagem.
    @OneToMany(mappedBy = "bovino")
    private Collection<Pesagem> pesagens;//agregação por composição.

    
    public Bovino() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public Float getPeso_chegada() {
        return peso_chegada;
    }

    public void setPeso_chegada(Float peso_chegada) {
        this.peso_chegada = peso_chegada;
    }

    public Float getPeso_atual() {
        return peso_atual;
    }

    public void setPeso_atual(Float peso_atual) {
        this.peso_atual = peso_atual;
    }

    public Float getValor_kg_compra() {
        return valor_kg_compra;
    }

    public void setValor_kg_compra(Float valor_kg_compra) {
        this.valor_kg_compra = valor_kg_compra;
    }

    public Float getValor_kg_venda() {
        return valor_kg_venda;
    }

    public void setValor_kg_venda(Float valor_kg_venda) {
        this.valor_kg_venda = valor_kg_venda;
    }

    public Float getCusto_diario() {
        return custo_diario;
    }

    public void setCusto_diario(Float custo_diario) {
        this.custo_diario = custo_diario;
    }

    public Float getValor_liquido() {
        return valor_liquido;
    }

    public void setValor_liquido(Float valor_liquido) {
        this.valor_liquido = valor_liquido;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Collection<Pesagem> getPesagens() {
        return pesagens;
    }

    public void setPesagens(Collection<Pesagem> pesagens) {
        this.pesagens = pesagens;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    
    
    
}
