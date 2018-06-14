package br.com.DAO;

import br.com.Modelos.GabaritoOficial;
import br.com.Modelos.Participante;
import br.com.Util.GenericDAO;
import br.com.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vinni
 */
public class GabaritoOficialDAO extends GenericDAO<GabaritoOficial> {

    GabaritoOficial gabaritoOficial = new GabaritoOficial();
    //public Session sessao;
    public Transaction transacao;
    private Class classe;

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
            JOptionPane.showMessageDialog(null, " Gabarito Excluído Com Sucesso !!!");

        }
    }

    public List<GabaritoOficial> listarGabaritoOficial() {
        return listar();

    }

    public GabaritoOficial pesquisarGabaritoOficId(String campo, int valor) {
        return consultarObjetoId(campo, valor);

    }

   public boolean listarGabaritoPorCursoAno(String ano, String curso) {

        this.setSessao(HibernateUtil.getSessionFactory().openSession());
        setTransacao(getSessao().beginTransaction());

        GabaritoOficial gabarito = (GabaritoOficial) sessao.createCriteria(GabaritoOficial.class).add(Restrictions.eq("ProcessoSeletivo", ano)).
                add(Restrictions.eq("curso", curso)).uniqueResult();
        sessao.close();
        
        if (gabarito != null) {
            return false;
        }else{    
            return true;
        
        }
    }
   
   public GabaritoOficial pesquisarGabaritoPorCursoAno(String ano, String curso) {

        this.setSessao(HibernateUtil.getSessionFactory().openSession());
        setTransacao(getSessao().beginTransaction());

        GabaritoOficial gabarito = (GabaritoOficial) sessao.createCriteria(GabaritoOficial.class).add(Restrictions.eq("ProcessoSeletivo", ano)).
                add(Restrictions.eq("curso", curso)).uniqueResult();
        sessao.close();
        
       return gabarito;
    }
}
