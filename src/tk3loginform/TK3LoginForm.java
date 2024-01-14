/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tk3loginform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author muhammadrydwan
 */
public class TK3LoginForm extends JFrame{
  public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            onInitGUI();
        });
    }

    private static void onInitGUI() {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 225);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

        JLabel usernameLabel = new JLabel("Username");
        JTextField user = new JTextField();

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField pass = new JPasswordField();

        JCheckBox tampilpass = new JCheckBox("Tampilkan Password");

        JButton masuk = new JButton("Masuk");
        JButton keluar = new JButton("Keluar");

        panel.add(usernameLabel);
        panel.add(user);
        panel.add(passwordLabel);
        panel.add(pass);
        panel.add(new JLabel());
        panel.add(tampilpass);
        panel.add(masuk);
        panel.add(keluar);

        tampilpass.addActionListener((ActionEvent e) -> {
            if (tampilpass.isSelected()) {
                pass.setEchoChar((char) 0);
            } else {
                pass.setEchoChar('\u2022');
            }
        });

        masuk.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "Halo, " + user.getText() + ". Anda berhasil masuk!");
        });

        keluar.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
