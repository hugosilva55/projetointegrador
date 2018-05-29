/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinni
 */
public class GabaritoOficialTableModel {
    
    private List<GabaritoOficial> gabaritosOfic = new ArrayList<>();
    private String[] colunas = {"Id", "Processo Seletivo"};

    public GabaritoOficialTableModel(List<GabaritoOficial> gabaritoOfic) {
        this.gabaritosOfic = gabaritoOfic;
    }

    public int getRowCount() {
        return gabaritosOfic.size();

    }

    public int getColumnCount() {
        return gabaritosOfic.length();

    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        GabaritoOficial gabaritoOfic1 = gabaritosOfic.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return gabaritoOfic1.getIdGabarito();
            case 1:
                return gabaritoOfic1.getProcessoSeletivo();
            
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
