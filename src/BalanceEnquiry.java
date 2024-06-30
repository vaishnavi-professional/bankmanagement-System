package bank.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back,next;
    JLabel text;
    JTextField amount;
    BalanceEnquiry(String pinchange){
        setLayout(null);
        setSize(650,450);
        setLocation(400,100);
        setVisible(true);


        text=new JLabel("Enter the Registered Pin Number ");
        text.setFont(new Font("Times New Roman", Font.PLAIN,28));
        text.setBounds(145,135,500,30);
        add(text);

        next =new JButton("Next");
        next.setBackground(Color.WHITE);
        next.setBounds(450,280,150,40);
        next.setFont(new Font("Times new Roman", Font.PLAIN,30));
        next.addActionListener(this);
        add( next);

        amount=new JTextField();
        amount.setFont(new Font("Times New Roman", Font.PLAIN,28));
        amount.setBounds(240,200,160,50);
        amount.setBackground(Color.WHITE);
        add(amount);

        back = new JButton ("Back");
        back.setBackground(Color.WHITE);
        back.setBounds(450,330,150,40);
        back.setFont(new Font("Times new Roman", Font.PLAIN,30));
        back.addActionListener(this);
        add(back);






    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back)
        {

        }
    }



    public static void main(String args[])
    {
        new BalanceEnquiry("");
    }
}



