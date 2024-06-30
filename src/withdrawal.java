package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class withdrawal extends JFrame implements ActionListener {
    JLabel text;
    JTextField amount;
    JButton deposit,back;

    withdrawal ()
    {
        setLayout(null);
        setSize(650,450);
        setLocation(400,100);
        setVisible(true);
        text=new JLabel("Enter the amount you to withdraw");
        text.setFont(new Font("Times New Roman", Font.PLAIN,28));
        text.setBounds(150,135,500,30);
        add(text);
        amount=new JTextField();
        amount.setFont(new Font("Times New Roman", Font.PLAIN,28));
        amount.setBounds(240,200,160,50);
        amount.setBackground(Color.WHITE);
        add(amount);
        deposit=new JButton("WITHDRAWAL");
        deposit.setBackground(Color.WHITE);
        deposit.setBounds(400,300,180,40);
        deposit.setFont(new Font("Times new Roman", Font.PLAIN,20));
        deposit.addActionListener(this);
        add(deposit);
        back=new JButton("BACK");
        back.setBackground(Color.WHITE);
        back.setBounds(400,350,180,40);
        back.setFont(new Font("Times new Roman", Font.PLAIN,20));
        back.addActionListener(this);
        add(back);
    }
    public void actionPerformed(ActionEvent ae)
    {
        {
            if(ae.getSource()==deposit )
            {
                JOptionPane.showMessageDialog(deposit,"your amount has been successfully withdrawed" );
            }else if(ae.getSource()== back)
            {
                JOptionPane.showMessageDialog(back,"please try again" );
            }
        }
    }
    public static void main(String args[])
    {
        new withdrawal();

    }
}
