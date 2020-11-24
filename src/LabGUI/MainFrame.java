package LabGUI;

import javax.swing.*;

public class MainFrame extends JFrame {

        private MainMenu mainMenuPage;
        private ADDStudent addStudent;
        private LISTSTUDENTs liststudenTs;

    public MainFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Student Application");
        setSize(500, 500);
        setLayout(null);

        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

       addStudent = new ADDStudent(this);
        addStudent.setVisible(false);
        add(addStudent);

        liststudenTs = new LISTSTUDENTs(this);
        liststudenTs.setVisible(false);
        add(liststudenTs);
    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public ADDStudent getAddStudent() {
        return addStudent;
    }

    public LISTSTUDENTs getListstudenTs() {
        return liststudenTs;
    }
}
