
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.util.Date;

/**
 *
 * @author telmo
 */
public class Funcionario extends Pessoa {
    
    private String numero_ctps;
    private Date data_admissao;
    private Date data_demissao;

    public Funcionario() {
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Date getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Date getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }
    
    
    
}
