package br.com.DAO;

import br.com.Modelos.Curso;
import br.com.Util.GenericDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Alencar
 */
public class CursoDAO extends GenericDAO<Curso> {

    public CursoDAO() {
        super(Curso.class);
    }

    public void salvarCurso(Curso curs) {

        if (curs.getIdCurso() == 0) {
            if (adicionar(curs)) {
                JOptionPane.showMessageDialog(null, " Curso Adicionado Com Sucesso!!! ");
            }

        } else {
            if (atualizar(curs)) {
                JOptionPane.showMessageDialog(null, " Curso Editado Com Sucesso!!! ");
            }
        }
    }

    public void excluirCurso(Curso curs) {
        if (remover(curs)) {
            JOptionPane.showMessageDialog(null, "Curso Excluido Com Sucesso !!!");

        }
    }

    public List<Curso> listarCurso(){
        return listar();
        
    }
    public Curso pesquisarCursoId(String campo, int valor){
        return consultarObjetoId(campo, valor);
        
    }
    
}
