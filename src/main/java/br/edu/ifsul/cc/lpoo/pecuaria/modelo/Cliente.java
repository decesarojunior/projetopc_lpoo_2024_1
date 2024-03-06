package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class Cliente extends Pessoa{
    
    private String cnpj;
    private Calendar data_ultima_compra;
    private Float valor_compras;

    public Cliente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }

    public Float getValor_compras() {
        return valor_compras;
    }

    public void setValor_compras(Float valor_compras) {
        this.valor_compras = valor_compras;
    }
    
    
}
