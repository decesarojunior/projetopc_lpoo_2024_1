
package br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import java.util.Collection;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author telmo
 */
public class PersistenciaJPA implements InterfacePersistencia {
    
    public EntityManagerFactory factory;    //fabrica de gerenciadores de entidades
    public EntityManager entity;            //gerenciador de entidades JPA

    public PersistenciaJPA() {
   
        //parametro: é o nome da unidade de persistencia (Persistence Unit)
        factory = Persistence.createEntityManagerFactory("pu_pecuaria");
        //conecta no bd e executa a estratégia de geração.
        entity = factory.createEntityManager(); 
    }
   
    @Override
    public Boolean conexaoAberta() {        
        return entity.isOpen();   
    }

    @Override
    public void fecharConexao() {
        entity.close(); 
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        
        return entity.find(c, id);//encontra um determinado registro 
    }

    @Override
    public void persist(Object o) throws Exception {
        
        entity.getTransaction().begin();// abrir a transacao.
        entity.persist(o); //realiza o insert ou update.
        entity.getTransaction().commit(); //comita a transacao (comando sql)   
    }

    @Override
    public void remover(Object o) throws Exception {
        
        entity.getTransaction().begin();// abrir a transacao.
        entity.remove(o); //realiza o delete
        entity.getTransaction().commit(); //comita a transacao (comando sql)   
    }

    @Override
    public Collection<Raca> listRacas() throws Exception {
        
        return entity.createNamedQuery("Raca.orderbyid").getResultList();
    }
    
    
    
}
