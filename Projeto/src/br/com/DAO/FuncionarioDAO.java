package br.com.DAO;

import br.com.Modelos.Funcionario;
import br.com.Util.GenericDAO;
import java.util.List;
import javax.swing.JOptionPane;

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
                JOptionPane.showMessageDialog(null, "Adicionado com sucesso. Boa sorte!!");
            }
        } else {
            if (atualizar(func)) {
                JOptionPane.showMessageDialog(null, "Participante editado com sucesso!!");
            }
        }
    }

    public void excluirParticipante(Funcionario func) {
        if (remover(func)) {
            JOptionPane.showMessageDialog(null, "Participante excluido com sucesso!!");
        }
    }

    public List<Funcionario> listarFuncionario() {
        return listar();
    }

    public Funcionario pesquisarFuncionarioId(String campo, int valor) {
        return consultarObjetoId(campo, valor);
    }

}
