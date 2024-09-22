package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample2 {
    PopupMenuExample2() {
        final JFrame frame = new JFrame("PopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        final JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(frame, e.getX(), e.getY());
            }
        });
        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("cut MenuItem clicked.");
            }
        });
        copy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("copy MenuItem clicked.");
            }
        });
        paste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("paste MenuItem clicked.");
            }
        });
        frame.add(label);
        frame.add(popupmenu);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuExample2();
    }
}
