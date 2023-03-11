package nl.tudelft.jpacman.ui;

import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    private JButton startButton;
    private JButton exitButton;
    private Theme themeSelector;

    private Account account;

    public void openAccount() {
        account = new Account();
        account.setVisible(true);
    }

    public JButton getStartButton() {
        return startButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public Home(){

        setTitle("Pacman");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundImage = new ImageIcon("src/main/resources/bg/pac_bg.png");
        Image image = backgroundImage.getImage().getScaledInstance(600, 800, Image.SCALE_SMOOTH);
        ImageIcon realImg = new ImageIcon(image);
        JLabel backgroundLabel = new JLabel(realImg);

        ImageIcon startIcon = new ImageIcon("src/main/resources/button/start_btn.png");
        Image startImg = startIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        ImageIcon startBtn = new ImageIcon(startImg);


        ImageIcon exitIcon = new ImageIcon("src/main/resources/button/exit_btn.png");
        Image exitImg = exitIcon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        ImageIcon exitBtn = new ImageIcon(exitImg);


        // Set up the button
        startButton = new JButton("");
        startButton.setIcon(startBtn);
        startButton.setOpaque(false);
        startButton.setContentAreaFilled(false);
        startButton.setBorderPainted(false);
        startButton.setBorder(null);

        startButton.addActionListener(e -> {
            this.setVisible(false);
            openAccount();
        });

        exitButton = new JButton("");
        exitButton.setIcon(exitBtn);
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setBorder(null);
        exitButton.addActionListener(e -> {
            this.dispose();
        });

        backgroundLabel.add(startButton, BorderLayout.CENTER);
        backgroundLabel.add(exitButton, BorderLayout.CENTER);
        startButton.setBounds(200, 350, 200, 50);
        exitButton.setBounds(200, 450, 200, 50);
        backgroundLabel.setLayout(null);
        add(backgroundLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Home();
    }

}
