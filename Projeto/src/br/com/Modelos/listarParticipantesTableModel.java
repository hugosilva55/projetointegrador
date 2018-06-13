package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class listarParticipantesTableModel extends AbstractTableModel {

    private List<Participante> participantes = new ArrayList<>();
    private String[] colunas = {"Id", "Participantes"};

    public listarParticipantesTableModel(List<Participante> participantes) {
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
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
        }
        return null;
    }

}
