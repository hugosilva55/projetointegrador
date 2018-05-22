package br.com.DAO;

import br.com.Modelos.Participante;
import br.com.Util.GenericDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Alencar
 */
public class ParticipanteDAO extends GenericDAO<Participante> {

    public ParticipanteDAO() {
        super(Participante.class);
    }
    
    public void salvarParticipante(Participante part){
        
        if(adicionar(part)){
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso. Boa sorte!!");
        }
        
        
    }

}
