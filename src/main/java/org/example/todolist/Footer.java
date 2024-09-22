package org.example.todolist;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Footer extends JPanel{
    JButton addTask;
    JButton removeTask;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    Footer(){
        this.setPreferredSize(new Dimension(400, 50));
        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif",Font.PLAIN, 20));

        addTask.setVerticalTextPosition(JButton.BOTTOM);
        this.add(addTask);

        removeTask = new JButton("Remove Task");
        removeTask.setBorder(emptyBorder);
        removeTask.setFont(new Font("Sans-serif",Font.PLAIN, 20));
        removeTask.setVerticalTextPosition(JButton.BOTTOM);
        this.add(removeTask);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getRemoveTask() {
        return removeTask;
    }
}
