import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccountDetailsPage extends JFrame{
    AccountDetailsPage(){
        // Frame settings
        setTitle("Account Details");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Bank Icon
        JLabel bankIcon = new JLabel(new ImageIcon("path_to_bank_icon.png")); // Add your bank icon path here
        bankIcon.setBounds(250, 20, 100, 100);
        add(bankIcon);

        // Page Title
        JLabel titleLabel = new JLabel("Page 3: Account Details");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(100, 130, 400, 30);
        add(titleLabel);

        // Account Type Label and Radio Buttons
        JLabel accountTypeLabel = new JLabel("Account Type:");
        accountTypeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        accountTypeLabel.setBounds(50, 180, 150, 25);
        add(accountTypeLabel);

        JRadioButton savingAccount = new JRadioButton("Saving Account");
        JRadioButton currentAccount = new JRadioButton("Current Account");
        JRadioButton fixedDepositAccount = new JRadioButton("Fixed Deposit Account");
        JRadioButton recurringDepositAccount = new JRadioButton("Recurring Deposit Account");

        savingAccount.setBackground(new Color(240, 248, 255));
        currentAccount.setBackground(new Color(240, 248, 255));
        fixedDepositAccount.setBackground(new Color(240, 248, 255));
        recurringDepositAccount.setBackground(new Color(240, 248, 255));

        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(savingAccount);
        accountTypeGroup.add(currentAccount);
        accountTypeGroup.add(fixedDepositAccount);
        accountTypeGroup.add(recurringDepositAccount);

        JPanel accountTypePanel = new JPanel(new GridLayout(2, 2, 10, 10));
        accountTypePanel.setBounds(50, 210, 500, 80);
        accountTypePanel.setBackground(new Color(240, 248, 255));
        accountTypePanel.add(savingAccount);
        accountTypePanel.add(currentAccount);
        accountTypePanel.add(fixedDepositAccount);
        accountTypePanel.add(recurringDepositAccount);
        add(accountTypePanel);

        // Card Number and PIN
        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberLabel.setFont(new Font("Arial", Font.BOLD, 16));
        cardNumberLabel.setBounds(50, 310, 150, 25);
        add(cardNumberLabel);

        JLabel cardNumberInfo = new JLabel("XXXX-XXXX-XXXX-4142");
        cardNumberInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        cardNumberInfo.setForeground(Color.DARK_GRAY);
        cardNumberInfo.setBounds(220, 310, 300, 25);
        add(cardNumberInfo);

        JLabel pinLabel = new JLabel("PIN:");
        pinLabel.setFont(new Font("Arial", Font.BOLD, 16));
        pinLabel.setBounds(50, 340, 150, 25);
        add(pinLabel);

        JLabel pinInfo = new JLabel("XXXX");
        pinInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        pinInfo.setForeground(Color.DARK_GRAY);
        pinInfo.setBounds(220, 340, 300, 25);
        add(pinInfo);

        // Services Required
        JLabel servicesLabel = new JLabel("Services Required:");
        servicesLabel.setFont(new Font("Arial", Font.BOLD, 16));
        servicesLabel.setBounds(50, 380, 200, 25);
        add(servicesLabel);

        JCheckBox atmCardCheckBox = new JCheckBox("ATM Card");
        JCheckBox internetBankingCheckBox = new JCheckBox("Internet Banking");

        atmCardCheckBox.setBackground(new Color(240, 248, 255));
        internetBankingCheckBox.setBackground(new Color(240, 248, 255));

        atmCardCheckBox.setBounds(50, 410, 150, 25);
        internetBankingCheckBox.setBounds(220, 410, 200, 25);

        add(atmCardCheckBox);
        add(internetBankingCheckBox);

        // Submit Button with Hover Effect
        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));
        submitButton.setBounds(200, 500, 200, 40);
        submitButton.setBackground(new Color(70, 130, 180));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFocusPainted(false);

        submitButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                submitButton.setBackground(new Color(100, 149, 237)); // Lighter Blue
            }

            public void mouseExited(MouseEvent e) {
                submitButton.setBackground(new Color(70, 130, 180)); // Original Color
            }
        });

        add(submitButton);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AccountDetailsPage page = new AccountDetailsPage();
            page.getContentPane().setBackground(new Color(240, 248, 255)); // Light blue background
            page.setVisible(true);
        });
    }
}
