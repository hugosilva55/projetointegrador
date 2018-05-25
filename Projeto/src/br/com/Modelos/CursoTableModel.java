package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CursoTableModel extends AbstractTableModel {

    private List<Curso> cursos = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Carga Horaria", "Turno", "Vagas", "Coordenador"};

    public CursoTableModel(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public int getRowCount() {
        return cursos.size();

    }

    @Override
    public int getColumnCount() {
        return colunas.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Curso curso1 = cursos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return curso1.getIdCurso();
            case 1:
                return curso1.getCurso();
            case 2:
                return curso1.getCargaHoraria();
            case 3:
                return curso1.getTurno();
            case 4:
                return curso1.getQuantVagas();
            case 5:
                return curso1.getCoordenador();

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
        }
return null;
    }

}
