package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{
    long random;
    JLabel formno,personaldetails,name,fname,gender, email,marital, address,city ,state,pincode;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JRadioButton male,female, married,unmarried,other;
    ButtonGroup gendergroup;
    ButtonGroup marriedgroup;
    JButton next;
    SignupOne()
    {
        setLayout(null);
        Random ran = new Random();
        random =Math.abs((ran.nextLong()%9000L)+ 1000L);
        formno = new JLabel("APPLICATION FORM NO:"+ random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        personaldetails = new JLabel("Page 1: Personal Details");
        personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        personaldetails.setBounds(290,80,400,30);
        add(personaldetails);
        name = new JLabel(" Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        nameTextField= new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        fnameTextField= new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        male=new JRadioButton("Male");
        male.setFont(new Font("Raleway",Font.BOLD,20));
        male.setBackground(Color.WHITE);
        male.setBounds(300,290,100,30);
        add(male);
        female=new JRadioButton("Female");
        female.setFont(new Font("Raleway",Font.BOLD,20));
        female.setBackground(Color.WHITE);
        female.setBounds(450,290,140,30);
        add(female);
        gendergroup= new ButtonGroup();
        gendergroup .add(male);
        gendergroup .add(female);
        email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        emailTextField= new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        married=new JRadioButton("Married");
        married.setFont(new Font("Raleway",Font.BOLD,20));
        married.setBackground(Color.WHITE);
        married.setBounds(300,390,140,30);
        add(married);
        unmarried=new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Raleway",Font.BOLD,20));
        unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(450,390,140,30);
        add(unmarried);
        other=new JRadioButton("other");
        other.setFont(new Font("Raleway",Font.BOLD,20));
        other.setBackground(Color.WHITE);
        other.setBounds(600,390,140,30);
        add(other);
        marriedgroup= new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(unmarried);
        marriedgroup.add(other);
        address= new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        addressTextField= new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        city= new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        cityTextField= new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        state= new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        stateTextField= new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        pincode= new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        pinTextField= new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);
        next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(710,600,70,30);
        next.addActionListener(this);
        add(next);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,710);
        setLocation(350,5);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== next)
        {
            SignupTwo t2=new SignupTwo();
            t2.setVisible(true);
        }
    }

    public static void main(String args[]) {

        new SignupOne();

    }
}

