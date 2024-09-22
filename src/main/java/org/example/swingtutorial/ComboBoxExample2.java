package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample2 {

    JFrame frame;
    ComboBoxExample2(){
        frame =new JFrame("ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JButton button=new JButton("Show");
        button.setBounds(200,100,75,20);
        String[] languages ={"C","C++","C#","Java"};
        final JComboBox cb=new JComboBox(languages);
        cb.setBounds(50, 100,90,20);
        frame.add(cb); frame.add(label); frame.add(button);
        frame.setLayout(null);
        frame.setSize(350,350);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }
    public static void main(String[] args) {
        new ComboBoxExample2();
    }
}
