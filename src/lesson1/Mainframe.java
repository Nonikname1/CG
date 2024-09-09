package lesson1;

import javax.swing.*;

public class Mainframe extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel paintAreaPanel;
    private DrawPanel dp;

    public Mainframe() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        dp = new DrawPanel();
        paintAreaPanel.add(dp);
    }

    public static void main(String[] args) {
        Mainframe dialog = new Mainframe();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
