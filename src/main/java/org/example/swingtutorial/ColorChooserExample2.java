package org.example.swingtutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserExample2 extends JFrame implements ActionListener {
    JFrame frame;
    JButton button;
    JTextArea textArea;
    ColorChooserExample2(){
        frame =new JFrame("Color Chooser Example.");

        button =new JButton("Pad Color");
        button.setBounds(200,250,100,30);

        textArea =new JTextArea();
        textArea.setBounds(10,10,300,200);
        button.addActionListener(this);
        frame.add(button);
        frame.add(textArea);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Color c=JColorChooser.showDialog(this,"Choose",Color.CYAN);
        textArea.setBackground(c);
    }
    public static void main(String[] args) {
        new ColorChooserExample2();
    }
}