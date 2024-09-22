package org.example.swingtutorial;

import javax.swing.*;

public class SeparatorExample {
    JMenu menu, submenu;
    JMenuItem i1, i2;

    SeparatorExample() {
        JFrame frame = new JFrame("Separator Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");

        menu.add(i1);
        menu.addSeparator();
        menu.add(i2);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SeparatorExample();
    }
}
