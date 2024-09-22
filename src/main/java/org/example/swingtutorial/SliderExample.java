package org.example.swingtutorial;

import javax.swing.*;

public class SliderExample extends JFrame {
    public SliderExample() {
        JSlider slider = new JSlider();
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }
    public static void main(String[] args) {
        SliderExample frame = new SliderExample();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
