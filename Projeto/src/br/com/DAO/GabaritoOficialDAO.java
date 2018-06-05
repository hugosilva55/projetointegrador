package br.com.DAO;

import br.com.Modelos.GabaritoOficial;
import br.com.Util.GenericDAO;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vinni
 */
public class GabaritoOficialDAO extends GenericDAO<GabaritoOficial> {

    public GabaritoOficialDAO() {
        super(GabaritoOficial.class);
    }

    public void salvarGabaritoOficial(GabaritoOficial gabaritoOfic) {

        if (gabaritoOfic.getIdGabarito() == 0) {
            if (adicionar(gabaritoOfic)) {
                JOptionPane.showMessageDialog(null, " Gabarito Adicionado Com Sucesso!!! ");
            }

        } else {
            if (atualizar(gabaritoOfic)) {
                JOptionPane.showMessageDialog(null, " Gabarito Editado Com Sucesso!!! ");
            }
        }
    }

    public void excluirGabaritoOficial(GabaritoOficial gabaritoOfic) {
        if (remover(gabaritoOfic)) {
            JOptionPane.showMessageDialog(null, " Gabarito Excluido Com Sucesso !!!");

        }
    }

    public List<GabaritoOficial> listarGabaritoOficial(){
        return listar();
        
    }
    public GabaritoOficial pesquisarGabaritoOficId(String campo, int valor){
        return consultarObjetoId(campo, valor);
        
    }
    
   
    
}
