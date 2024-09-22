package org.example.swingtutorial;

import javax.swing.*;

public class ListExample {
    ListExample(){
        JFrame frame= new JFrame();
        frame.setTitle("ListExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        defaultListModel.addElement("Item1");
        defaultListModel.addElement("Item2");
        defaultListModel.addElement("Item3");
        defaultListModel.addElement("Item4");
        JList<String> list = new JList<>(defaultListModel);
        list.setBounds(100,100, 75,75);
        frame.add(list);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new ListExample();
    }}