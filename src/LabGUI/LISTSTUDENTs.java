package LabGUI;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class LISTSTUDENTs extends JPanel {
    private MainFrame parent;

    private JLabel label;
    private JButton back;

    private String header[] = {"id","Name","Surname","Faculty","Group"};
    private JTable table;
    private JScrollPane scrollPane;


    public LISTSTUDENTs(MainFrame parent) {

        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("LIST STUDENT'S");
        label.setSize(300, 30);
        label.setLocation(100, 100);
        add(label);


        back = new JButton("Back");
        back.setSize(300, 30);
        back.setLocation(100, 150);
        add(back);
        back.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {

            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {

            }

            @Override
            public void ancestorMoved(AncestorEvent event) {

            }
        });


    }
}
