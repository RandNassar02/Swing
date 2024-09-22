package org.example.swingtutorial;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableExample2 {
    public static void main(String[] a) {
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[][] data ={ {"101","Rand","670000"},
                {"102","Ahmad","780000"},
                {"101","Nassar","700000"}};
        String[] column ={"ID","NAME","SALARY"};
        final JTable jt=new JTable(data,column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select= jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;
                int[] row = jt.getSelectedRows();
                int[] columns = jt.getSelectedColumns();
                for (int i = 0; i < row.length; i++) {
                    for (int j = 0; j < columns.length; j++) {
                        Data = (String) jt.getValueAt(row[i], columns[j]);
                    } }
                System.out.println("Table element selected is: " + Data);
            }
        });
        JScrollPane sp=new JScrollPane(jt);
        frame.add(sp);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}