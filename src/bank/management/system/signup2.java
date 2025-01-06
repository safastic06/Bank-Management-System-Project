package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class signup2 extends JFrame implements ActionListener {
    JComboBox comboBox1,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 : Additional Details");
        l1.setFont(new Font("Arial", Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Religion : ");
        l2.setFont(new Font("Arial",Font.BOLD,18));
        l2.setBounds(100,180,100,30);
        add(l2);

        String religion[] = {"Hindu","Muslim","Sikh","Cristian","Other's"};
        comboBox1 = new JComboBox<>(religion);
        comboBox1.setBackground(new Color(244, 239, 239, 145));;
        comboBox1.setFont(new Font("Arial",Font.BOLD,14));
        comboBox1.setBounds(350,180,320,30);
        add(comboBox1);

        JLabel l3 = new JLabel("Category : ");
        l3.setFont(new Font("Arial",Font.BOLD,18));
        l3.setBounds(100,240,100,30);
        add(l3);

        String Category[] = {"General","OBC","SC","ST","Other's"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(244, 239, 239, 145));;
        comboBox2.setFont(new Font("Arial",Font.BOLD,14));
        comboBox2.setBounds(350,240,320,30);
        add(comboBox2);

        JLabel l4 = new JLabel("Income : ");
        l4.setFont(new Font("Arial",Font.BOLD,18));
        l4.setBounds(100,300,100,30);
        add(l4);

        String Income[] = {"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(244, 239, 239, 145));;
        comboBox3.setFont(new Font("Arial",Font.BOLD,14));
        comboBox3.setBounds(350,300,320,30);
        add(comboBox3);

        JLabel l5 = new JLabel("Educational : ");
        l5.setFont(new Font("Arial",Font.BOLD,18));
        l5.setBounds(100,360,150,30);
        add(l5);

        String Educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other's"};
        comboBox4 = new JComboBox(Educational);
        comboBox4.setBackground(new Color(244, 239, 239, 145));;
        comboBox4.setFont(new Font("Arial",Font.BOLD,14));
        comboBox4.setBounds(350,360,320,30);
        add(comboBox4);

        JLabel l6 = new JLabel("Occupation : ");
        l6.setFont(new Font("Arial",Font.BOLD,18));
        l6.setBounds(100,420,150,30);
        add(l6);

        String Occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other's"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(244, 239, 239, 145));;
        comboBox5.setFont(new Font("Arial",Font.BOLD,14));
        comboBox5.setBounds(350,420,320,30);
        add(comboBox5);

        JLabel l7 = new JLabel("PAN Number : ");
        l7.setFont(new Font("Arial",Font.BOLD,18));
        l7.setBounds(100,480,150,30);
        add(l7);

        textPan = new JTextField();
        textPan.setFont(new Font("Arial",Font.BOLD,18));
        textPan.setBounds(350,480,320,30);
        add(textPan);

        JLabel l8 = new JLabel("Aadhar Number : ");
        l8.setFont(new Font("Arial",Font.BOLD,18));
        l8.setBounds(100,540,180,30);
        add(l8);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Arial",Font.BOLD,18));
        textAadhar.setBounds(350,540,320,30);
        add(textAadhar);

        JLabel l9 = new JLabel("Senior citizen : ");
        l9.setFont(new Font("Arial",Font.BOLD,18));
        l9.setBounds(100,590,180,30);
        add(l9);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Arial",Font.BOLD,14));
        r1.setBackground(new Color(244, 239, 239, 145));
        r1.setBounds(350,590,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Arial",Font.BOLD,14));
        r2.setBackground(new Color(244, 239, 239, 145));
        r2.setBounds(460,590,100,30);
        add(r2);

        JLabel l10 = new JLabel("Existing Account : ");
        l10.setFont(new Font("Arial",Font.BOLD,18));
        l10.setBounds(100,640,180,30);
        add(l10);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Arial",Font.BOLD,14));
        e1.setBackground(new Color(244, 239, 239, 145));
        e1.setBounds(350,640,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Arial",Font.BOLD,14));
        e2.setBackground(new Color(244, 239, 239, 145));
        e2.setBounds(460,640,100,30);
        add(e2);

        JLabel l11 = new JLabel("Form No : ");
        l11.setFont(new Font("Arial",Font.BOLD,14));
        l11.setBounds(700,10,180,30);
        add(l11);

        JLabel l12 = new JLabel(this.formno);
        l12.setFont(new Font("Arial",Font.BOLD,12));
        l12.setBounds(760,10,60,30);
        add(l12);

        next = new JButton("Next");
        next.setFont(new Font("Arial",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,670,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
         setSize(850,750);
         setLocation(450,80);
         getContentPane().setBackground(new Color(244, 239, 239, 145));
         setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String religion = (String) comboBox1.getSelectedItem();
    String category = (String) comboBox2.getSelectedItem();
    String income = (String)  comboBox3.getSelectedItem();
    String education = (String) comboBox4.getSelectedItem();
    String occupation = (String) comboBox5.getSelectedItem();

    String pan = textPan.getText();
    String aadhar = textAadhar.getText();

    String scitizen = " ";
    if ((r1.isSelected())){
        scitizen = "Yes";
    } else if (r2.isSelected()) {
           scitizen = "No";
    }

        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Fields" );
            }else{
                Connection c1 = new Connection();
                String q = "insert into Signuptwo values('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pan+"', '"+aadhar+"', '"+scitizen+"', '"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
        }

    public static void main(String[] args) {
         new signup2("");
    }
}
