package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample2 implements ActionListener {
    JFrame frame;
    JMenuBar menuBar;

    JMenu file, edit, help;

    JMenuItem cut, copy, paste, selectAll;

    JTextArea textArea;

    MenuExample2() {
        frame = new JFrame();
        frame.setTitle("Menu Example 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        textArea = new JTextArea();
        textArea.setBounds(5, 5, 360, 320);
        frame.add(menuBar);
        frame.add(textArea);
        frame.setJMenuBar(menuBar);
        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            textArea.cut();
        if (e.getSource() == paste)
            textArea.paste();
        if (e.getSource() == copy)
            textArea.copy();
        if (e.getSource() == selectAll)
            textArea.selectAll();
    }

    public static void main(String[] args) {
        new MenuExample2();
    }
}