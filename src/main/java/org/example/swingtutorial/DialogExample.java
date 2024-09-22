package org.example.swingtutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {
    private static JDialog dialog;
    DialogExample() {
        JFrame frame= new JFrame();
        dialog = new JDialog(frame , "Dialog Example", true);
        dialog.setLayout( new FlowLayout() );
        JButton button = new JButton ("OK");
        button.addActionListener ( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                DialogExample.dialog.setVisible(false);
            }
        });
        dialog.add( new JLabel ("Click button to continue."));
        dialog.add(button);
        dialog.setSize(300,300);
        dialog.setVisible(true);
    }
    public static void main(String[] args)
    {
        new DialogExample();
    }
}
