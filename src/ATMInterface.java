import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMInterface extends JFrame implements ActionListener {
    // Define components
    private JTextField cardNumberField;
    private JPasswordField pinField;
    private JButton signInButton, clearButton, signUpButton;

    public ATMInterface() {
        // Frame settings
        setTitle("ATM Interface");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Bank Icon
        JLabel bankIcon = new JLabel(new ImageIcon("bank_icon.png")); // Add your bank icon path
        bankIcon.setBounds(150, 20, 100, 100);
        add(bankIcon);

        // Welcome Label
        JLabel welcomeLabel = new JLabel("WELCOME TO ATM");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setBounds(50, 130, 300, 30);
        add(welcomeLabel);

        // Card Number Label and Text Field
        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        cardNumberLabel.setBounds(50, 180, 100, 25);
        add(cardNumberLabel);

        cardNumberField = new JTextField();
        cardNumberField.setBounds(150, 180, 200, 25);
        add(cardNumberField);

        // PIN Label and Password Field
        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        pinLabel.setBounds(50, 230, 100, 25);
        add(pinLabel);

        pinField = new JPasswordField();
        pinField.setBounds(150, 230, 200, 25);
        add(pinField);

        // Buttons
        signInButton = new JButton("Sign In");
        signInButton.setBounds(50, 300, 100, 30);
        signInButton.setBackground(new Color(0, 123, 255));
        signInButton.setForeground(Color.WHITE);
        signInButton.addActionListener(this);
        add(signInButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(160, 300, 100, 30);
        clearButton.setBackground(new Color(192, 192, 192));
        clearButton.addActionListener(this);
        add(clearButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(270, 300, 100, 30);
        signUpButton.setBackground(new Color(40, 167, 69));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.addActionListener(this);
        add(signUpButton);

        // Credit Card Icon
        JLabel creditCardIcon = new JLabel(new ImageIcon("credit_card_icon.png")); // Add your credit card icon path
        creditCardIcon.setBounds(300, 400, 50, 50);
        add(creditCardIcon);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signInButton) {
            JOptionPane.showMessageDialog(this, "Sign In Clicked");
        } else if (e.getSource() == clearButton) {
            cardNumberField.setText("");
            pinField.setText("");
        } else if (e.getSource() == signUpButton) {
            JOptionPane.showMessageDialog(this, "Sign Up Clicked");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ATMInterface atmInterface = new ATMInterface();
            atmInterface.setVisible(true);
        });
    }
}