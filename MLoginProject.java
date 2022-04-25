
//Code by Munna Kumar

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class LoginFrame extends JFrame implements ActionListener {
 
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JLabel lblNewLabel = new JLabel("Login Page by Munna Kumar ");
 
 
    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
 
    }
 
    public void setLayoutManager() {
        container.setBackground(new Color(34, 52, 98));
        container.setLayout(null);
    }
 
    public void setLocationAndSize() {
        userLabel.setBounds(525, 150, 100, 30);
        passwordLabel.setBounds(525, 220, 100, 30);
        userTextField.setBounds(700, 150, 150, 30);
        passwordField.setBounds(700, 220, 150, 30);
        showPassword.setBounds(700, 260, 150, 30);   
        loginButton.setBounds(525, 300, 100, 30);
        resetButton.setBounds(750, 300, 100, 30);
        lblNewLabel.setBounds(450, 13, 2730, 93);
        lblNewLabel.setForeground(Color.yellow);
        lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 50));
        passwordLabel.setForeground(Color.white);
        userLabel.setForeground(Color.white);
 
 
    }
 
    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(lblNewLabel);
    }
 
    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Munna Kumar") && pwdText.equalsIgnoreCase("Munna@123")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
 
 
        }
    }
 
}
 
public class MLoginProject {
    public static void main(String[] a) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Login Form by Munna");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }
 
}