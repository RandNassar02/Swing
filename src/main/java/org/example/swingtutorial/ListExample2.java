package org.example.swingtutorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListExample2 {
    ListExample2() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("ListExample");

        final JLabel label = new JLabel();
        label.setSize(500, 100);

        JButton button = new JButton("Show");
        button.setBounds(200, 150, 80, 30);

        final DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        defaultListModel.addElement("C");
        defaultListModel.addElement("C++");
        defaultListModel.addElement("Java");
        final JList<String> list1 = new JList<>(defaultListModel);
        list1.setBounds(100, 100, 75, 75);

        DefaultListModel<String> defaultListModel2 = new DefaultListModel<>();
        defaultListModel2.addElement("Turbo C++");
        defaultListModel2.addElement("Struts");
        defaultListModel2.addElement("Spring");
        final JList<String> list2 = new JList<>(defaultListModel2);
        list2.setBounds(100, 200, 75, 75);

        frame.add(list1);
        frame.add(list2);
        frame.add(button);
        frame.add(label);
        frame.setSize(450, 450);
        frame.setLayout(null);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "";
                if (list1.getSelectedIndex() != -1) {
                    data = "Programming language Selected: " + list1.getSelectedValue();
                    label.setText(data);
                }
                if (list2.getSelectedIndex() != -1) {
                    data += ", FrameWork Selected: ";
                    for (Object frame : list2.getSelectedValues()) {
                        data += frame + " ";
                    }
                }
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new ListExample2();
    }
}
