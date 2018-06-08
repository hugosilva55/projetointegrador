package br.com.DAO;

import br.com.Modelos.Participante;
import br.com.Modelos.ResultadoFinal;
import br.com.Util.GenericDAO;
import br.com.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Eugênio
 */
public class ResultadoFinalDAO extends GenericDAO<ResultadoFinal> {

    public ResultadoFinalDAO() {
        super(ResultadoFinal.class);
    }

    public void salvarResultadoFinal(ResultadoFinal result) {

        if (result.getIdResultadoFinal() == 0) {
            if (adicionar(result)) {
                JOptionPane.showMessageDialog(null, "Adicionado com sucesso. Boa sorte!!");
            }
        } else {
            if (atualizar(result)) {
                JOptionPane.showMessageDialog(null, "Resultado Final editado com sucesso!!");
            }
        }
    }

    public void atualizarResultadoFinalPorID(ResultadoFinal result, int id) {

        if (result.getIdResultadoFinal() == id) {
            if (adicionar(result)) {
                JOptionPane.showMessageDialog(null, "Adicionado com sucesso. Boa sorte!!");
            }
        }
    }

    public void excluirResultadoFinal(ResultadoFinal result) {
        if (remover(result)) {
            JOptionPane.showMessageDialog(null, "Resultado Final excluido com sucesso!!");
        }
    }

    public List<ResultadoFinal> listarResultadoFinal() {
        return listarParticipantePorMaiorNota();
    }

    public ResultadoFinal pesquisarResultadoFinalId(String campo, int valor) {
        return consultarObjetoId(campo, valor);
    }

    public void atualizarResultadoFinal(ResultadoFinal result) {
        if (atualizar(result)) {
            JOptionPane.showMessageDialog(null, "Resultado Final editado com sucesso!!");
        }

    }

    public List<ResultadoFinal> listarResultadoPorCurso(String ano, String curso){
        
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
        
        List<ResultadoFinal> resultadoFinal = sessao.createCriteria(ResultadoFinal.class).add(Restrictions.eq("ano", ano)).
                add(Restrictions.eq("curso", curso)).list();
        
        if (resultadoFinal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem dados Cadastrados!!!");
        }else{
            return resultadoFinal;
        }
        return resultadoFinal;
    }

}
