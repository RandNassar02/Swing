package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarExample2 {
    ScrollBarExample2(){
        JFrame frame= new JFrame("Scrollbar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        final JScrollBar s=new JScrollBar();
        s.setBounds(100,100, 50,100);
        frame.add(s); frame.add(label);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:"+ s.getValue());
            }
        });
    }
    public static void main(String[] args)
    {
        new ScrollBarExample2();
    }}
