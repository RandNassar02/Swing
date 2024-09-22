package org.example.todolist;

import javax.swing.*;
import java.awt.*;

public class ListTo extends JPanel {
    ListTo() {
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(400, 560));

        //this.setBackground(Color.BLUE);
    }

    public void updateNumbers() {
        Component[] components = this.getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof Task) {
                ((Task) components[i]).changeIndex(i + 1);
            }
        }
    }

    public void removeCompletedTasks() {
        for (Component c : getComponents()) {
            if (c instanceof Task) {
                if (((Task) c).getState()) {
                    remove(c);
                    updateNumbers();
                }
            }
        }
    }
}
