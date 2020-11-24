package LabGUI;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu extends JPanel {

    private MainFrame parent;

    private JButton addStudentButton;
    private JButton listSTUDENTSButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent) {

        this.parent = parent;
        setSize(500,500);
        setLayout(null);

        addStudentButton = new JButton("ADD Student");
        addStudentButton.setSize(300,30);
        addStudentButton.setLocation(100,100);
        add(addStudentButton);
        addStudentButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        listSTUDENTSButton = new JButton("LIST STUDENT'S");
        listSTUDENTSButton.setSize(300,30);
        listSTUDENTSButton.setLocation(100,150);
        add(listSTUDENTSButton);
        listSTUDENTSButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });









    }
}
