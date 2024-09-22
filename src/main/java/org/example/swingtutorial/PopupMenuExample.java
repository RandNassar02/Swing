package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample {

    PopupMenuExample() {
        final JFrame frame = new JFrame("PopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        frame.add(popupmenu);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuExample();
    }
}
