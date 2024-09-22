package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample2 implements ActionListener {

    JTextField textField1,textField2,textField3;
    JButton button1,button2;

    TextFieldExample2(){
        JFrame frame = new JFrame();

        textField1 = new JTextField();
        textField1.setBounds(50,50,150,20);
        textField2 = new JTextField();
        textField2.setBounds(50,100,150,20);
        textField3 = new JTextField();
        textField3.setBounds(50,150,150,20);

        button1 = new JButton("+");
        button1.setBounds(50,200,50,50);
        button2 = new JButton("-");
        button2.setBounds(120,200,50,50);

        button1.addActionListener(this);
        button2.addActionListener(this);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button1);
        frame.add(button2);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text1 = textField1.getText();
        String text2 = textField2.getText();

        int a=Integer.parseInt(text1);
        int b=Integer.parseInt(text2);
        int c=0;

        if(e.getSource()==button1){
            c=a+b;
        }
        else if(e.getSource()==button2){
            c=a-b;
        }

        String result = String.valueOf(c);
        textField3.setText(result);
    }

    public static void main(String[] args) {
        new TextFieldExample2();
    }
}
