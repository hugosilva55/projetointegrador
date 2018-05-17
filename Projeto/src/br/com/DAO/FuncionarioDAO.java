package br.com.DAO;

import br.com.Modelos.Funcionario;
import br.com.Util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> {

    public FuncionarioDAO() {
        super(Funcionario.class);
    }

    public void salvar(Funcionario func) {
        if (adicionar(func)) {
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
        }
    }

}
