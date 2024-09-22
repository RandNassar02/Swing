package org.example.swingtutorial;

import javax.swing.*;

public class SpinnerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spinner Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpinnerModel value =
                new SpinnerNumberModel(5, //initial value
                        0, //minimum value
                        10, //maximum value
                        1); //step
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100, 100, 50, 30);
        frame.add(spinner);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
