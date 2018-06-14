package br.com.DAO;

import br.com.Modelos.Participante;
import br.com.Modelos.ResultadoFinal;
import br.com.Util.GenericDAO;
import br.com.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
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
                JOptionPane.showMessageDialog(null, "Gabarito Corrigido com Sucesso!!!");
            }
        } else {
            atualizar(result);
        }
    }

    public void atualizarResultadoFinalPorID(ResultadoFinal result, int id) {

        if (result.getIdResultadoFinal() == id) {
            if (adicionar(result)) {
                JOptionPane.showMessageDialog(null, "Gabarito Editado com Sucesso!!!");
            }
        }
    }

    public void excluirResultadoFinal(ResultadoFinal result) {
        if (remover(result)) {
            JOptionPane.showMessageDialog(null, "Gabarito Excluído com Sucesso!!");
        }
    }

    public List<ResultadoFinal> listarResultadoFinal() {
        return listarParticipantePorMaiorNota();
    }

    public ResultadoFinal pesquisarResultadoFinalId(String campo, int valor) {
         this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
         sessao.close();
            return consultarObjetoId(campo, valor);     
    }

    public void atualizarResultadoFinal(ResultadoFinal result) {
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
            atualizar(result); 
            sessao.close();
        

    }

    public List<ResultadoFinal> listarResultadoPorCurso(String ano, String curso){
        
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
        
        List<ResultadoFinal> resultadoFinal = sessao.createCriteria(ResultadoFinal.class).add(Restrictions.eq("ano", ano)).
                add(Restrictions.eq("curso", curso)).addOrder(Order.asc("classificacao")).addOrder(Order.desc("notaFinal")).list();
        sessao.close();
        
        if (resultadoFinal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem dados Cadastrados!!!");
        }else{
            return resultadoFinal;
        }
        return resultadoFinal;
    }
    
       public List<ResultadoFinal> listarAprovadosClassificadosPorCursoAno(String ano, String curso){
        
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
        
        List<ResultadoFinal> resultadoFinal = sessao.createCriteria(ResultadoFinal.class)
                .add(Restrictions.eq("ano", ano))
                .add(Restrictions.eq("curso", curso))
                .add(Restrictions.disjunction()
                .add(Restrictions.eq("classificacao", "Aprovado"))
                .add(Restrictions.eq("classificacao", "Classificado")))
                .addOrder(Order.asc("classificacao").desc("notaFinal")).list();
        sessao.close();
        
        if (resultadoFinal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem dados Cadastrados!!!");
        }else{
            return resultadoFinal;
        }
        return resultadoFinal;
    }
    
     public List<ResultadoFinal> listar40Melhores(String ano, String curso){
        
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
        
        List<ResultadoFinal> resultadoFinal = sessao.createCriteria(ResultadoFinal.class).add(Restrictions.eq("ano", ano)).
                add(Restrictions.eq("curso", curso))
                .add(Restrictions.eq("classificacao", "Classificado"))
                .addOrder(Order.asc("classificacao").desc("notaFinal")).setMaxResults(40).list();
        sessao.close();
        
        if (resultadoFinal.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem dados Cadastrados!!!");
        }else{
            return resultadoFinal;
        }
        return resultadoFinal;
    }
     
     public int contarResultadoPorCurso(String ano, String curso){
        
        this.setSessao(HibernateUtil.getSessionFactory().openSession());
            setTransacao(getSessao().beginTransaction());
        
        return ((Number) sessao.createCriteria(ResultadoFinal.class).add(Restrictions.eq("ano", ano)).
                add(Restrictions.eq("curso", curso)).setProjection(Projections.rowCount()).uniqueResult()).intValue();
    
    }

}
