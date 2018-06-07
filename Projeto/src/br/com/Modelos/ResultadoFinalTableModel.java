package br.com.Modelos;

import br.com.DAO.ResultadoFinalDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class ResultadoFinalTableModel extends AbstractTableModel {

    private List<ResultadoFinal> resultados = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Classificação", "Nota Final"};
    ResultadoFinal result = new ResultadoFinal();
    ResultadoFinalDAO resultDAO = new ResultadoFinalDAO();
    
    public ResultadoFinalTableModel(List<ResultadoFinal> resultados) {
        this.resultados = resultados;
    }

    @Override
    public int getRowCount() {
        return resultados.size();

    }

    @Override
    public int getColumnCount() {
        return colunas.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ResultadoFinal resultado = resultados.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return resultado.getIdResultadoFinal();
            case 1:
                return resultado.getNomeParticipante();
            case 2:
                return resultado.getClassificacao();
            case 3:
                return resultado.getNotaFinal();
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        if( valor == null) return;
         
        switch(coluna){
            case 2:  resultados.get(linha).setClassificacao((String) valor);break;
        } 
        this.fireTableRowsUpdated(linha, coluna);
    }

    @Override
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
        }
        return null;
    }
}
