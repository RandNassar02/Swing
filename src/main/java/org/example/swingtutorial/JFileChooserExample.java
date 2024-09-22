package org.example.swingtutorial;

import javax.swing.*;

public class JFileChooserExample {
    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser();
        jfc.showSaveDialog(null);
    }
}
