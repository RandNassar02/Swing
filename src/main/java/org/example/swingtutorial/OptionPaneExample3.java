package org.example.swingtutorial;

import javax.swing.*;

public class OptionPaneExample3 {
    JFrame frame;
    OptionPaneExample3() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String name = JOptionPane.showInputDialog(frame, "What is your name?");
    }
    public static void main(String[] args) {
        new OptionPaneExample3();
    }
}
