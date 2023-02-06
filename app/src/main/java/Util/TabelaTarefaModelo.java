package Util;

import Model.Tarefa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author devpovoa
 */
public class TabelaTarefaModelo extends AbstractTableModel {
    
    String[] colunas = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Tarefa> tarefa = new ArrayList();
    
    @Override
    public int getRowCount() {
        return tarefa.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linhas, int colunas) {
        
        switch (colunas) {
            case 0 -> {
                return tarefa.get(linhas).getNome();
            }
            case 1 -> {
                return tarefa.get(linhas).getDescricao();
            }
            case 2 -> {
                SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyy");
                return dataFormatada.format(tarefa.get(linhas).getPrazo());
            }
            case 3 -> {
                return tarefa.get(linhas).getSituacao();
            }
            case 4 -> {
                return "";
            }
            case 5 -> {
                return "";
            }
            default -> {
                return "Dados não encontrados";
            }
        }
        
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        tarefa.get(rowIndex).setSituacao((boolean) aValue);
    }
    
    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }
    
    @Override
    public boolean isCellEditable(int linhas, int colunas) {
        return colunas == 3;
    }
    
    @Override
    public Class<?> getColumnClass(int coluna) {
        
        if (tarefa.isEmpty()) {
            return Object.class;
        }
        
        return this.getValueAt(0, coluna).getClass();
    }
    
    public String[] getColunas() {
        return colunas;
    }
    
    public List<Tarefa> getTarefa() {
        return tarefa;
    }
    
    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefa = tarefa;
    }
    
}
