package org.example.swingtutorial;

import javax.swing.*;

public class ProgressBarExample extends JFrame {
    JProgressBar progressBar;
    int i = 0;

    ProgressBarExample() {
        progressBar = new JProgressBar(0, 2000);
        progressBar.setBounds(40, 40, 160, 30);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        add(progressBar);

        setSize(400, 400);
        setLayout(null);
    }

    public void iterate() {
        while (i <= 2000) {
            progressBar.setValue(i);
            i=i+20;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void main(String[] args) {
        ProgressBarExample example = new ProgressBarExample();
        example.setVisible(true);
        example.iterate();
    }
}
