package org.example.swingtutorial;

import javax.swing.*;

public class TabbedPaneExample {
    JFrame frame;

    TabbedPaneExample() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea(200, 200);
        JPanel panel1 = new JPanel();
        panel1.add(textArea);
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("main", panel1);
        tp.add("visit", panel2);
        tp.add("help", panel3);
        frame.add(tp);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
