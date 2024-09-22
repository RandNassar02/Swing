package org.example.swingtutorial;

import javax.swing.*;

public class ScrollBarExample {
    ScrollBarExample() {
        JFrame f = new JFrame("Scrollbar Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollBar s = new JScrollBar();
        s.setBounds(100, 100, 50, 100);
        f.add(s);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollBarExample();
    }
}

