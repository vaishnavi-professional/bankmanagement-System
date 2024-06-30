
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    JLabel additionaldetails,name,fname,dob,gender,email,marital,pan,aadhar,state,pincode;
    JComboBox religion,category,income,education,occupation;
    JRadioButton mno,myes,yes,no;
    JButton next;
    JTextField aadharTextField,pTextField;
    long random;
    SignupTwo()
    {
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        additionaldetails = new JLabel("Page 2: Additional Details");
        additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionaldetails.setBounds(290,80,400,30);
        add(additionaldetails);
        name = new JLabel(" Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add( name);
        String valReligion[]= {"Hindu","Muslim","Christian","other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setFont(new Font("Raleway",Font.PLAIN,20));
        religion.setBackground(Color.WHITE);
        add(religion);
        fname = new JLabel(" Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add( fname);
        String valCategory[]= {"General","OBC","SC","ST","BC","MBC","DNC","OTHER"};
        category = new JComboBox(valCategory);
        category.setFont(new Font("Raleway",Font.PLAIN,20));
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        String incomecategory[]= {"NULL","<1,50,000","<2,50,000","<5,00,000","<7,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setFont(new Font("Raleway",Font.PLAIN,20));
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        gender = new JLabel("Education");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        String educationvalue[]= {"non-graduate","graduate","postgraduate","doctorate","others"};
        education= new JComboBox(educationvalue);
        education.setFont(new Font("Raleway",Font.PLAIN,20));
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        String occupationValues[]= {"business","self-imployed","student","retired ","others"};
        occupation= new JComboBox(occupationValues);
        occupation.setFont(new Font("Raleway",Font.PLAIN,20));
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        pan= new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);
        pTextField= new JTextField();
        pTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pTextField.setBounds(300, 440, 400, 30);
        add(pTextField);
        aadhar= new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        aadharTextField= new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        state= new JLabel("Senior citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        yes=new JRadioButton("yes");
        yes.setFont(new Font("Raleway",Font.BOLD,20));
        yes.setBounds(300,540,100,40);
        yes.setBackground(Color.WHITE);
        add(yes);
        no=new JRadioButton("no");
        no.setFont(new Font("Raleway",Font.BOLD,20));
        no.setBounds(450,540,100,40);
        no.setBackground(Color.WHITE);
        add(no);
        pincode= new JLabel("Exisiting account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        myes=new JRadioButton("yes");
        myes.setFont(new Font("Raleway",Font.BOLD,20));
        myes.setBounds(300,590,100,40);
        myes.setBackground(Color.WHITE);
        add(myes);
        mno=new JRadioButton("no");
        mno.setFont(new Font("Raleway",Font.BOLD,20));
        mno.setBounds(450,590,100,40);
        mno.setBackground(Color.WHITE);
        add(mno);
        next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(710,600,70,30);
        next.addActionListener(this);
        add(next);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== next)
        {
            SignupThree t3=new SignupThree();
            t3.setVisible(true);
        }
    }
    public static void main(String args[])
    {

        new SignupTwo();

    }
}



