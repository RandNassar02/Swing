package org.example.swingtutorial;

import javax.swing.*;

public class SliderExample2 extends JFrame {
    public SliderExample2() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        SliderExample2 frame = new SliderExample2();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
