package org.example.swingtutorial;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    JFrame frame;

    TreeExample() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        JTree jt = new JTree(style);
        frame.add(jt);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TreeExample();
    }
}