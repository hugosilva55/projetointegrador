package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ParticipanteTableModel extends AbstractTableModel {

    private List<Participante> participantes = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "E-Mail", "Curso", "Ano"};

    public ParticipanteTableModel(List<Participante> participantes) {
        this.participantes = participantes;
    }

    @Override
    public int getRowCount() {
        return participantes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Participante participante = participantes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return participante.getIdUsuario();
            case 1:
                return participante.getNome();
            case 2:
                return participante.getEmail();
            case 3:
                return participante.getCurso();
            case 4:
                return participante.getAno();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
            case 4:
                return colunas[4];
        }
        return null;
    }

}
