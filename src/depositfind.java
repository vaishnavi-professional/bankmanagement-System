
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class depositfind extends JFrame implements ActionListener{
    JButton next;

    depositfind()
    {
        setTitle("depositselection");
        setLayout(null);
        setSize(650,450);
        setLocation(400,180);
        setVisible(true);
        JRadioButton deposit=new JRadioButton("FIXED DEPOSIT");
        deposit.setBounds(230,130,250,40);
        deposit.setFont(new Font("Times new Roman", Font.PLAIN,20));
        deposit.addActionListener(this);
        add(deposit);
        JRadioButton rdeposit=new JRadioButton("RECURRING DEPOSIT");
        rdeposit.setBounds(230,200,250,40);
        rdeposit.setFont(new Font("Times new Roman", Font.PLAIN,20));
        rdeposit.addActionListener(this);
        add(rdeposit);
        ButtonGroup rdep= new ButtonGroup();
        rdep.add(deposit);
        rdep.add(rdeposit);
        next= new JButton("Next");
        next.setFont(new Font("Times new Roman", Font.PLAIN,20));
        next.setBackground(Color.WHITE);
        next.setBounds(500,300,100,30);
        next.addActionListener(this);
        add(next);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== next)
        {
            deposit l1=new deposit();
            l1.setVisible(true);
        }

    }
    public static void main(String[] args)
    {
        new depositfind();
    }
}
