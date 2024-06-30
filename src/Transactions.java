
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    JButton deposit,cash,mini,enqu,loan,cc,exit;
    Transactions()
    {
        setSize(800,700);
        setLocation(300,18);
        setVisible(true);
        setLayout(null);
        setTitle("welcome to sv bank");
        JLabel text=new JLabel("SELECT YOUR TRANSACTION TYPE");
        text.setFont(new Font("Times New Roman", Font.BOLD,30));
        text.setBounds(150,60,600,40);
        add(text);
        deposit=new JButton("DEPOSIT");
        deposit.setBackground(Color.WHITE);
        deposit.setBounds(80,160,270,40);
        deposit.setFont(new Font("Times new Roman", Font.PLAIN,27));
        deposit.addActionListener(this);
        add(deposit);
        cash=new JButton("WITHDRAWAL");
        cash.setBackground(Color.WHITE);
        cash.setBounds(400,160,270,40);
        cash.setFont(new Font("Times new Roman", Font.PLAIN,24));
        cash.addActionListener(this);
        add(cash);
        mini=new JButton("MINI STATEMENT");
        mini.setBackground(Color.WHITE);
        mini.setBounds(80,280,270,40);
        mini.setFont(new Font("Times new Roman", Font.PLAIN,27));
        mini.addActionListener(this);
        add( mini);
        enqu=new JButton("BALANCE ENQUIRY");
        enqu.setBackground(Color.WHITE);
        enqu.setBounds(400,280,270,40);
        enqu.setFont(new Font("Times new Roman", Font.PLAIN,24));
        enqu.addActionListener(this);
        add( enqu);
        loan =new JButton("LOAN");
        loan.setBackground(Color.WHITE);
        loan.setBounds(80,390,270,40);
        loan.setFont(new Font("Times new Roman", Font.PLAIN,27));
        loan.addActionListener(this);
        add( loan);
        cc=new JButton("CUSTOMER-QUERY");
        cc.setBackground(Color.WHITE);
        cc.setBounds(400,390,270,40);
        cc.setFont(new Font("Times new Roman", Font.PLAIN,25));
        cc.addActionListener(this);
        add( cc);
        exit= new JButton("EXIT");
        exit.setBackground(Color.WHITE);
        exit.setBounds(280,500,200,40);
        exit.setFont(new Font("Times new Roman", Font.PLAIN,25));
        exit.addActionListener(this);
        add( exit);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== deposit)
        {
            depositfind a1=new depositfind();
            a1.setVisible(true);
        }
        else if(ae.getSource()== cash )
        {
            withdrawal s1=new withdrawal();
            s1.setVisible(true);
        }

    }
    public static void main(String args[])
    {
        new Transactions();
    }
}
