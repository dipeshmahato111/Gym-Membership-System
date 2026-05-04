import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GymApp {
    public static void main(String[] args) {
        // Step 4: Create Main Window
        JFrame frame = new JFrame("Gym Membership System - Project 2");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1, 10, 10)); // Logical grouping

        // Step 3: Identify Components
        JLabel instructionLabel = new JLabel("Enter Member ID to Login:", SwingConstants.CENTER);
        JTextField idField = new JTextField();
        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel("", SwingConstants.CENTER);

        // Add components to the window
        frame.add(instructionLabel);
        frame.add(idField);
        frame.add(loginButton);
        frame.add(statusLabel);

        // Step 4: Event Handling & Step 5: Input Validation
        loginButton.addActionListener((ActionEvent e) -> {
            String memberID = idField.getText();

            // Validation check
            if (memberID.trim().isEmpty()) {
                statusLabel.setText("ERROR: ID cannot be empty!"); // Removed Emoji
                statusLabel.setForeground(Color.RED);
            } else {
                statusLabel.setText("Welcome, Member #" + memberID); // Removed Emoji
                statusLabel.setForeground(new Color(0, 102, 0)); 
            }
        });

        // Center on screen and show
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}