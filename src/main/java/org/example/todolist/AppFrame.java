package org.example.todolist;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AppFrame extends JFrame {

    private Title title;
    private Footer footer;
    private ListTo list;

    private JButton newTask;
    private JButton clear;

    AppFrame() {

        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new Title();
        footer = new Footer();
        list = new ListTo();

        this.add(title, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        newTask = footer.getAddTask();
        clear = footer.getRemoveTask();

        addListeners();

    }


    public void addListeners() {
        newTask.addMouseListener(new MouseAdapter()
        {
            @override
            public void mousePressed(MouseEvent e)
            {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();


                task.getDone().addMouseListener(new MouseAdapter() {
                    @override
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        list.updateNumbers();
                        revalidate();

                    }
                });
            }

        });

        clear.addMouseListener(new MouseAdapter() {
            @override
            public void mousePressed(MouseEvent e) {
                 list.removeCompletedTasks();
                repaint();
            }
        });
    }

}
