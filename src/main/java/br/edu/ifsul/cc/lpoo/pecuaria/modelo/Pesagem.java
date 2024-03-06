
package br.edu.ifsul.cc.lpoo.pecuaria.modelo;

/**
 *
 * @author telmo
 */
public class Pesagem {
    
    private Integer id;
    private String nome;
    private Bovino bovino;

    public Pesagem() {
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

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
    
    
    
}
