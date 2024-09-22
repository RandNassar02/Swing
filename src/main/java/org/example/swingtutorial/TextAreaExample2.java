package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample2 implements ActionListener {

    JLabel label1,label2;
    JTextArea textArea;
    JButton button;
    public TextAreaExample2() {
        JFrame frame = new JFrame();
        label1 = new JLabel();
        label1.setBounds(50,25,100,30);

        label2 = new JLabel();
        label2.setBounds(160,25,100,30);

        textArea = new JTextArea();
        textArea.setBounds(20,75,250,200);

        button = new JButton("Count");
        button.setBounds(100,300,120,30);
        button.addActionListener(this);
        frame.add(label1);
        frame.add(label2);
        frame.add(textArea);
        frame.add(button);

        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        String[] words = text.split("\\s");
        label1.setText("Words: "+words.length );
        label2.setText("Characters: "+text.length());
    }

    public static void main(String[] args) {

        new TextAreaExample2();
    }
}
