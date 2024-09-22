package org.example.todolist;

import javax.swing.*;
import java.awt.*;

public class Title extends JPanel {
    Title(){
        this.setPreferredSize(new Dimension(400,80));

        JLabel titleText = new JLabel("To Do List");
        titleText.setPreferredSize(new Dimension(200,60));
        titleText.setFont(new Font("Sans-serif",Font.BOLD, 20));
        titleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(titleText);
    }
}
