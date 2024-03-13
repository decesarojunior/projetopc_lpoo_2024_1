
package br.edu.ifsul.cc.lpoo.pecuaria.test;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao.PersistenciaJPA;
import java.util.Collection;
import org.junit.Test;

/**
 *
 * @author telmo
 */
public class TestPersistenciaJPA {
    
    @Test
    public void testConexaoJPA(){
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
    //criar um novo teste para gerar um registro de Raca.
    //@Test
    public void testInsercaoRacaJPA() throws Exception {
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("testInsercaoRacaJPA: conectou no BD via jpa ...");
            
            Raca r = new Raca();
            r.setNome("Raca de teste !!!");
            
            jpa.persist(r);
            System.out.println("Raca id: "+r.getId());
            
            jpa.fecharConexao();
        }else{
            System.out.println("testInsercaoRacaJPA: nao conectou no BD ...");
                        
        }
    }
    //criar um novo teste para alterar um registro de Raca.
    //@Test
    public void testAlteracaoRacaJPA() throws Exception {
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("testAlteracaoRacaJPA: conectou no BD via jpa ...");
            
            Raca r = (Raca) jpa.find(Raca.class, Integer.valueOf(1));
            if(r != null){
                r.setNome("Nome alterado !!!");
                jpa.persist(r);//update no registro
                System.out.println("Raca alterada id:"+r.getId());
            }else{
                System.out.println("Nao encontrou a raca id=1");
            }
            
            jpa.fecharConexao();
        }else{
            System.out.println("testAlteracaoRacaJPA: nao conectou no BD ...");
                        
        }
    }
    
    //crar um novo teste para remover um registro de Raca.
    
    //@Test
    public void testRemocaoRacaJPA() throws Exception{
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("testAlteracaoRacaJPA: conectou no BD via jpa ...");
            
            Raca r = (Raca) jpa.find(Raca.class, Integer.valueOf(1));
            if(r != null){
               
                jpa.remover(r);//update no registro
                System.out.println("Raca removida id:"+r.getId());
            }else{
                System.out.println("Nao encontrou a raca id=1");
            }
            
            jpa.fecharConexao();
        }else{
            System.out.println("testAlteracaoRacaJPA: nao conectou no BD ...");
                        
        }
    }
    
     //criar um novo teste para gerar um registro de Raca.
    //@Test
    public void testPersistenciaRacaJPA() throws Exception {
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            Collection<Raca> cltRaca = jpa.listRacas();
            if(!cltRaca.isEmpty()){
                for(Raca r : cltRaca){
                    System.out.println("Raca encontrada - id:"+r.getId());
                    r.setNome("Nome alterado");
                    jpa.persist(r);//update
                    System.out.println("Raca alterada - "+r.getNome());
                    jpa.remover(r);//delete
                    System.out.println("Raca removida - "+r.getId());
                }
            }else{
                Raca r = new Raca();
                r.setNome("teste 1");
                jpa.persist(r);//insert
                System.out.println("Cadastrou a raca id:"+r.getId());
                r = new Raca();
                r.setNome("teste 2");
                jpa.persist(r);
                System.out.println("Cadastrou a raca id:"+r.getId());
            }
            
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }        
        
        
    }
    
}
