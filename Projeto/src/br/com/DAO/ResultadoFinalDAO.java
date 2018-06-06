package br.com.DAO;

import br.com.Modelos.ResultadoFinal;
import br.com.Util.GenericDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Eugênio
 */
public class ResultadoFinalDAO extends GenericDAO<ResultadoFinal> {

    public ResultadoFinalDAO() {
        super(ResultadoFinal.class);
    }

    public void salvarResultadoFinal(ResultadoFinal result) {

        if (result.getIdResultadoFinal()== 0) {
            if (adicionar(result)) {
                JOptionPane.showMessageDialog(null, "Adicionado com sucesso. Boa sorte!!");
            }
        } else {
            if (atualizar(result)) {
                JOptionPane.showMessageDialog(null, "Resultado Final editado com sucesso!!");
            }
        }
    }

    public void excluirResultadoFinal(ResultadoFinal result) {
        if (remover(result)) {
            JOptionPane.showMessageDialog(null, "Resultado Final excluido com sucesso!!");
        }
    }

    public List<ResultadoFinal> listarResultadoFinal() {
        return listar();
    }

    public ResultadoFinal pesquisarResultadoFinalId(String campo, int valor) {
        return consultarObjetoId(campo, valor);
    }

}
