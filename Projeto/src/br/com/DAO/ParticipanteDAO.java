package br.com.DAO;

import br.com.Modelos.GabaritoOficial;
import br.com.Modelos.Participante;
import br.com.Util.GenericDAO;
import br.com.Util.HibernateUtil;
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
                JOptionPane.showMessageDialog(null, "Participante Adicionado com Sucesso!!!");
            }
        } else {
            if (atualizar(part)) {
                JOptionPane.showMessageDialog(null, "Participante Editado com Sucesso!!!");
            }
        }
    }

    public void excluirParticipante(Participante part) {
        if (remover(part)) {
            JOptionPane.showMessageDialog(null, "Participante Excluído com Sucesso!!!");
        }
    }

    public List<Participante> listarParticipante() {
        return listar();
    }

    public Participante pesquisarParticipanteId(String campo, int valor) {
        return consultarObjetoId(campo, valor);
    }
    
    public List<Participante> listarParticipantesPorCurso(String ano, String curso){
        
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
        
        List<Participante> participante = sessao.createCriteria(Participante.class).add(Restrictions.eq("ano", ano)).
                add(Restrictions.eq("curso", curso)).list();
        
        if (participante.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem dados Cadastrados!!!");
        }else{
            return participante;
        }
        return participante;
    }
}
