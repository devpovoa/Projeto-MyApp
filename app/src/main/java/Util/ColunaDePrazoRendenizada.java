package Util;

import Model.Tarefa;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author devpovoa
 */
public class ColunaDePrazoRendenizada extends DefaultTableCellRenderer {

    /**
     *
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {

        JLabel label = (JLabel) super.getTableCellRendererComponent(table,
                value, isSelected,
                hasFocus,
                row,
                column);

        label.setHorizontalAlignment(CENTER);

        TabelaTarefaModelo tarefaModelo = (TabelaTarefaModelo) table.getModel();

        Tarefa tarefa = tarefaModelo.getTarefa().get(row);

        if (tarefa.getPrazo().after(new Date())) {
            label.setBackground(Color.GREEN);
        } else {
            label.setBackground(Color.red);
        }

        return label;
    }
}
