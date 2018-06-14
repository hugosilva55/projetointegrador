package br.com.DAO;

import br.com.Modelos.Funcionario;
import br.com.Util.GenericDAO;
import br.com.Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Restrictions;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Eugênio
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

    public FuncionarioDAO() {
        super(Funcionario.class);
    }

    public void salvarFuncionario(Funcionario func) {

        if (func.getIdFuncionario() == 0) {
            if (adicionar(func)) {
                JOptionPane.showMessageDialog(null, "Funcionario Adicionado com Sucesso!!!");
            }
        } else {
            if (atualizar(func)) {
                JOptionPane.showMessageDialog(null, "Funcionario Editado com sucesso!!!");
            }
        }
    }

    public void excluirFuncionario(Funcionario func) {
        if (remover(func)) {
            JOptionPane.showMessageDialog(null, "Funcionario Excluído com sucesso!!");
        }
    }

    public List<Funcionario> listarFuncionario() {
        return listar();
    }

    public Funcionario pesquisarFuncionarioId(String campo, int valor) {
        return consultarObjetoId(campo, valor);
    }

    public Funcionario verificarUsuario(String login, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Funcionario func = (Funcionario) sessao.createCriteria(Funcionario.class).add(Restrictions.eq("senhaFunc", senha)).add(Restrictions.eq("loginFunc", login)).uniqueResult();
        if (func == null) {
            JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!");
        } else {
            sessao.close();
            return func;
        }
        return func;
    }

    public boolean chequeCPF(String campo, String valor) {
        return consultarValorRepetido(campo, valor);
    }
    public boolean chequeLogin(String campo, String valor) {
        return consultarValorRepetido(campo, valor);
    }

    public static String criptografia(String original) throws UnsupportedEncodingException {
        String senha = null;
        MessageDigest algoritmo;
        byte messageDigest[];
        StringBuilder hexString;
        try {

            algoritmo = MessageDigest.getInstance("MD5");  // 32 letras 
            messageDigest = algoritmo.digest(original.getBytes("UTF-8"));
            hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            senha = hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return senha;
    }

}
