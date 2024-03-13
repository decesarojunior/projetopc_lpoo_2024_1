
package br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public interface InterfacePersistencia {
    
    public Boolean conexaoAberta();
    public void fecharConexao();
    public Object find(Class c, Object id) throws Exception;
    public void persist(Object o) throws Exception;
    public void remover(Object o) throws Exception;
    
    public Collection<Raca> listRacas() throws Exception;
}
