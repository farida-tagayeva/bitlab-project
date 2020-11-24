package LabGUI;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ADDStudent  extends JPanel {
    private MainFrame parent;

    private JLabel label ;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private  JLabel label4;
    private JTextField textField;
    private JTextField textField1;
    private JComboBox stringBox ;
    String [] strings = new String[Integer.parseInt("Information Technologies, Economics, Mathematics")];
    private  JTextField textField2;
    private JButton button;
    private JButton button1;

    public ADDStudent(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("ADD STUDENT");
        label.setSize(300, 30);
        label.setLocation(100, 50);
        add(label);

        label1 = new JLabel("NAME");
        label1.setSize(100,30);
        label1.setLocation(100,100);
        add(label1);

        label2 = new JLabel("SURNAME");
        label2.setSize(150,30);
        label2.setLocation(100,150);
        add(label2);

        label3 = new JLabel("FACULTY");
        label3.setSize(150,30);
        label3.setLocation(100,200);
        add(label3);

        label4 = new JLabel("GROUP");
        label4.setSize(100,30);
        label4.setLocation(100,250);
        add(label4);



        textField = new JTextField("Zhanna");
        textField.setSize(100, 30);
        textField.setLocation(150, 100);
        add(textField);

        textField1 = new JTextField("Orazkan");
        textField1.setSize(200, 30);
        textField1.setLocation(200, 150);
        add(textField1);

        stringBox = new JComboBox(strings);
        stringBox.setSize(200,30);
        stringBox.setLocation(200,200);
        add(stringBox);

        textField2 = new JTextField("SE-2018");
        textField2.setSize(100,30);
        textField2.setLocation(150,250);
        add(textField2);

        button = new JButton("ADD");
        button.setSize(50,30);
        button.setLocation(80,400);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        button1 = new JButton("BACK");
        button1.setSize(100,30);
        button1.setLocation(400,400);
        add(button1);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }
}
