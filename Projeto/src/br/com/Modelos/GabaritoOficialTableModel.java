package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class GabaritoOficialTableModel extends AbstractTableModel {

    private List<GabaritoOficial> gabaritos = new ArrayList<>();
    private String[] colunas = {"Id", "Questão 01", "Questão 02", "Questão 03", "Questão 04", "Questão 05",
        "Questão 06", "Questão 07", "Questão 08", "Questão 09", "Questão 10", "Questão 11", "Questão 12", "Questão 13",
        "Questão 14", "Questão 15", "Questão 16", "Questão 17", "Questão 18", "Questão 19", "Questão 20"};

    public GabaritoOficialTableModel(List<GabaritoOficial> gabaritos) {
        this.gabaritos = gabaritos;
    }

    @Override
    public int getRowCount() {
        return gabaritos.size();

    }

    @Override
    public int getColumnCount() {
        return colunas.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GabaritoOficial gabarito = gabaritos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return gabarito.getIdGabarito();
            case 1:
                return gabarito.getResposta1();
            case 2:
                return gabarito.getResposta2();
            case 3:
                return gabarito.getResposta3();
            case 4:
                return gabarito.getResposta4();
            case 5:
                return gabarito.getResposta5();
            case 6:
                return gabarito.getResposta6();
            case 7:
                return gabarito.getResposta7();
            case 8:
                return gabarito.getResposta8();
            case 9:
                return gabarito.getResposta9();
            case 10:
                return gabarito.getResposta10();
            case 11:
                return gabarito.getResposta11();
            case 12:
                return gabarito.getResposta12();
            case 13:
                return gabarito.getResposta13();
            case 14:
                return gabarito.getResposta14();
            case 15:
                return gabarito.getResposta15();
            case 16:
                return gabarito.getResposta16();
            case 17:
                return gabarito.getResposta17();
            case 18:
                return gabarito.getResposta18();
            case 19:
                return gabarito.getResposta19();
            case 20:
                return gabarito.getResposta20();
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
            case 11:
                return colunas[11];
            case 12:
                return colunas[12];
            case 13:
                return colunas[13];
            case 14:
                return colunas[14];
            case 15:
                return colunas[15];
            case 16:
                return colunas[16];
            case 17:
                return colunas[17];
            case 18:
                return colunas[18];
            case 19:
                return colunas[19];
            case 20:
                return colunas[20];
        }
        return null;
    }

}
