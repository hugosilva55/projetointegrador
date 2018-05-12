package projeto.usuario;

import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
import projeto.util.GenericDAO;
import projeto.util.HibernateUtil;

/**
 *
 * @author Eugênio
 */
public class UsuarioDAO extends GenericDAO<Usuario> {

    public UsuarioDAO() {
        super(Usuario.class);
    }

    public Usuario verificarUsuario(String login, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("senhaUsuario", senha)).add(Restrictions.eq("loginUsuario", login)).uniqueResult();
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!");
        } else {
            sessao.close();
            return usuario;
        }
        return usuario;
    }

}
