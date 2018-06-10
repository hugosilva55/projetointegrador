package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class GabaritoOficialTableModel extends AbstractTableModel {

    private List<GabaritoOficial> gabaritos = new ArrayList<>();
    private String[] colunas = {"Id","Ano Letivo", "Curso"};

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
                return gabarito.getProcessoSeletivo();
            case 2:
                return gabarito.getCurso();
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

        }
        return null;
    }

}
