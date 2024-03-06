
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Venda {
    
    private Integer id;
    private Float valor;
    private Calendar data;
    private String observacoes;
    private Collection<Bovino> bovinos;
    private Cliente cliente;
    private Funcionario funcionario;

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
