package org.example.swingtutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserExample extends JFrame implements ActionListener {
    JButton button;
    Container contentPane;

    ColorChooserExample() {
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        button = new JButton("Color");
        button.addActionListener(this);
        contentPane.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color initialcolor=Color.cyan;
        Color color=JColorChooser.showDialog(this, "Choose a color", initialcolor);
        contentPane.setBackground(color);
    }

    public static void main(String[] args) {
        ColorChooserExample colorChooserExample = new ColorChooserExample();
        colorChooserExample.setSize(400,400);
        colorChooserExample.setVisible(true);
        colorChooserExample.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
