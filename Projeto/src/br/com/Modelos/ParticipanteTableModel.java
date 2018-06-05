package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ParticipanteTableModel extends AbstractTableModel {

    private List<Participante> participantes = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "CPF", "E-Mail", "Data de Nascimento", "Estado Civil", "Curso", "Nacionalidade", "RG", "Sexo, Ano"};

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
                return participante.getCPF();
            case 3:
                return participante.getEmail();
            case 4:
                return participante.getDataNascimento();
            case 5:
                return participante.getEstadoCivil();
            case 6:
                return participante.getNacionalidade();
            case 7:
                return participante.getRG();
            case 8:
                return participante.getSexo();
            case 9:
                return participante.getCurso();
            case 10:
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
            case 5:
                return colunas[5];
            case 6:
                return colunas[6];
            case 7:
                return colunas[7];
            case 8:
                return colunas[8];
            case 9:
                return colunas[9];
            case 10:
                return colunas[10];

        }
        return null;
    }

}
