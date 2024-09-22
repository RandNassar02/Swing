package org.example.swingtutorial;

import javax.swing.*;

public class TableExample {
    JFrame frame;
    TableExample(){
        frame =new JFrame();
        frame.setTitle("TableExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[][] data ={ {"101","Rand","670000"},
                {"102","Ahmad","780000"},
                {"101","Nassar","700000"}};
        String[] column ={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        frame.add(sp);
        frame.setSize(300,400);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new TableExample();
    }
}
