
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo")
public abstract class Pessoa implements Serializable {
    
    @Id
    @Column(length = 11)
    private String cpf;
    
    @Column(nullable = false, length = 50)
    private String rg;
    
    @Column(nullable = false, length = 200)
    private String nome;
    
    @Column(nullable = false, length = 6)
    private String senha;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_nascimento;
    
    @Column(nullable = true, length = 8)
    private String cep;
    
    @Column(nullable = true, length = 50)
    private String numero;
    
    @Column(nullable = true, length = 200)
    private String complemento;
    
    @Column(nullable = false)
    private Boolean status;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    
}
