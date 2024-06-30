package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Connection conn;

    Login() {
        // Initialize JFrame
        setTitle("SV BANK");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Connect to database
        String url = "jdbc:mysql://localhost:3306/bankmanagementsystem";
        String username = "root";
        String password = "vaish@57";

        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MySQL JDBC Driver not found: " + e.getMessage());
            System.exit(1); // Exit application if driver not found
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database: " + e.getMessage());
            System.exit(1); // Exit application if connection fails
        }

        // Logo and title
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/mj.jpg"));
        Image image = icon.getImage().getScaledInstance(120, 100, Image.SCALE_DEFAULT);
        ImageIcon logo = new ImageIcon(image);
        JLabel label = new JLabel(logo);
        label.setBounds(180, 15, 100, 100);
        add(label);

        JLabel text = new JLabel("SV BANK");
        text.setFont(new Font("Times New Roman", Font.BOLD, 38));
        text.setBounds(295, 40, 400, 40);
        add(text);

        // Card number field
        JLabel cardLabel = new JLabel("CARD NO");
        cardLabel.setFont(new Font("Georgia", Font.BOLD, 28));
        cardLabel.setBounds(120, 150, 150, 30);
        add(cardLabel);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 155, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        // PIN field
        JLabel pinLabel = new JLabel("PIN");
        pinLabel.setFont(new Font("Georgia", Font.BOLD, 28));
        pinLabel.setBounds(120, 220, 250, 40);
        add(pinLabel);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 225, 230, 30);
        add(pinTextField);

        // Buttons
        login = new JButton("SIGN IN");
        login.setFont(new Font("raleway", Font.BOLD, 14));
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setBounds(300, 300, 100, 30);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setFont(new Font("raleway", Font.BOLD, 14));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.setBounds(430, 300, 100, 30);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setFont(new Font("raleway", Font.BOLD, 14));
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.setBounds(300, 350, 230, 30);
        signup.addActionListener(this);
        add(signup);

        // Frame properties
        getContentPane().setBackground(Color.WHITE);
        setSize(700, 450);
        setLocationRelativeTo(null); // Center the JFrame on screen
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            // Clear fields
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == signup) {
            // Open signup page (assuming you have a SignupOne class defined)
            SignupOne signupPage = new SignupOne();
            signupPage.setVisible(true);
        } else if (ae.getSource() == login) {
            // Authenticate user
            String cardNumber = cardTextField.getText();
            String pin = new String(pinTextField.getPassword());
            if (authenticateUser(cardNumber, pin)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                // Proceed to transactions or dashboard
                Transactions transactions = new Transactions();
                transactions.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid card number or PIN.");
            }
        }
    }

    private boolean authenticateUser(String cardNumber, String pin) {
        try {
            String query = "SELECT * FROM users WHERE card_number = ? AND pin = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, cardNumber);
            ps.setString(2, pin);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // returns true if user exists, false otherwise
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error authenticating user: " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        new Login();
    }
}
