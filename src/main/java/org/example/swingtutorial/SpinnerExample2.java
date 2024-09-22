package org.example.swingtutorial;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerExample2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Spinner Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(250,100);
        SpinnerModel value =
                new SpinnerNumberModel(5, //initial value
                        0, //minimum value
                        10, //maximum value
                        1); //step
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,100,50,30);
        frame.add(spinner);  frame.add(label);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Value : " + ((JSpinner)e.getSource()).getValue());
            }
        });
    }
}