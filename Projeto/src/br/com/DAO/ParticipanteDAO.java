package br.com.DAO;

import br.com.Modelos.GabaritoOficial;
import br.com.Modelos.Participante;
import br.com.Util.GenericDAO;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Thiago Alencar
 */
public class ParticipanteDAO extends GenericDAO<Participante> {

    public ParticipanteDAO() {
        super(Participante.class);
    }

    public void salvarParticipante(Participante part) {

        if (part.getIdUsuario() == 0) {
            if (adicionar(part)) {
                JOptionPane.showMessageDialog(null, "Adicionado com sucesso. Boa sorte!!");
            }
        } else {
            if (atualizar(part)) {
                JOptionPane.showMessageDialog(null, "Participante editado com sucesso!!");
            }
        }
    }

    public void excluirParticipante(Participante part) {
        if (remover(part)) {
            JOptionPane.showMessageDialog(null, "Participante excluido com sucesso!!");
        }
    }

    public List<Participante> listarParticipante() {
        return listar();
    }

    public Participante pesquisarParticipanteId(String campo, int valor) {
        return consultarObjetoId(campo, valor);
    }
    
    public List<Participante> listarParticipantesPorCurso(String curso){
        
        List<Participante> participante = sessao.createCriteria(Participante.class).add(Restrictions.eq("curso", curso)).list();
        return  participante;
    }

}
