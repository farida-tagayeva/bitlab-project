package bitlab_frida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        JButton button;
        JLabel label = null;
        JTextField textField;
        JTextField textField1;
        JComboBox agesBox;
        Integer [] ages = new Integer[100];
        JTextArea area;

        for (int i=0; i<100; i++){
            ages[i]=i;
        }


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 500);
        setLayout(null);

        JLabel label1 = new JLabel("Name:");
        label1.setSize(50, 50);
        label1.setLocation(100, 100);
        add(label1);

        JLabel label2 = new JLabel("Phone:");
        label2.setSize(50, 120);
        label2.setLocation(100, 100);
        add(label2);

        JLabel label3 = new JLabel("Age:");
        label3.setSize(50, 180);
        label3.setLocation(100, 100);
        add(label3);

        textField = new JTextField("Tagayeva Marzhan");
        textField.setSize(130, 30);
        textField.setLocation(150, 100);
        add(textField);

        textField1 = new JTextField("87072287371");
        textField1.setSize(120, 30);
        textField1.setLocation(150, 150);
        add(textField1);

        agesBox = new JComboBox(ages);
        agesBox.setSize(200,30);
        agesBox.setLocation(150,180);
        add(agesBox);

        area = new JTextArea();
        area.setSize(300,100);
        area.setLocation(100,300);
        add(area);


        button = new JButton("ADD CONTACT");
        button.setSize(300, 30);
        button.setLocation(100, 250);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.equals("")) {
                    label.setText(text);
                    textField.setText("");

                }
            }
        });

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text = textField.getText();
                String text1 = textField1.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if(!text.equals("")){
                    area.append(text+" "+text1+" "+age+"\n");
                    textField.setText("");
                    agesBox.setSelectedIndex(0);
                }
            }
        });
        add(button);
                }
            }











