package nl.tudelft.jpacman.ui;

import javax.swing.*;
import java.awt.*;

public class Account extends JFrame {
    private JButton nextButton;
    private JButton backButton;
    private Theme themeSelector;

    public void openTheme() {
        themeSelector = new Theme();
        themeSelector.setVisible(true);
    }

    public Account() {
        setTitle("Pacman");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundImage = new ImageIcon("src/main/resources/bg/ac_bg.png");
        Image image = backgroundImage.getImage().getScaledInstance(600, 770, Image.SCALE_SMOOTH);


        ImageIcon realImg = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(realImg);

        ImageIcon continueIcon = new ImageIcon("src/main/resources/button/continue_btn.png");
        Image continuebtnImg = continueIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        ImageIcon continuebtn = new ImageIcon(continuebtnImg);

        ImageIcon backIcon = new ImageIcon("src/main/resources/button/back_btn.png");
        Image backImg = backIcon.getImage().getScaledInstance(200, 50   , Image.SCALE_SMOOTH);
        ImageIcon backBtn = new ImageIcon(backImg);

        nextButton = new JButton("");
        nextButton.setIcon(continuebtn);
        nextButton.setOpaque(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setBorderPainted(false);
        nextButton.setBorder(null);

        nextButton.addActionListener(e -> {
            this.setVisible(false);
            openTheme();
        });
        backButton = new JButton("");
        backButton.setIcon(backBtn);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setBorder(null);

        backButton.addActionListener(e -> {
            this.setVisible(false);
            new Home();
        });

        backgroundLabel.add(nextButton, BorderLayout.CENTER);
        backgroundLabel.add(backButton, BorderLayout.CENTER);

        nextButton.setBounds(300, 650, 200, 50);
        backButton.setBounds(100, 650, 200, 50);

        add(backgroundLabel, BorderLayout.CENTER);

    }
    public static void main(String[] args) {

    }

}
