package org.example.swingtutorial;

import javax.swing.*;

public class OptionPaneExample2 {
    JFrame frame;
    OptionPaneExample2() {
        frame = new JFrame();
        JOptionPane.showMessageDialog(frame,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);

    }

    public static void main(String[] args) {
        new OptionPaneExample2();
    }
}
