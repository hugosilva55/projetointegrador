package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTableModel extends AbstractTableModel {

    private List<Funcionario> funcionarios = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Login", "Nivel de Acesso"};

    public FuncionarioTableModel(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public int getRowCount() {
        return funcionarios.size();

    }

    @Override
    public int getColumnCount() {
        return colunas.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario funcionario = funcionarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return funcionario.getIdFuncionario();
            case 1:
                return funcionario.getNomeFuncionario();
            case 2:
                return funcionario.getLoginFunc();
            case 3:
                return funcionario.getNivelDeAcesso();    
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
        }
        return null;
    }

}
