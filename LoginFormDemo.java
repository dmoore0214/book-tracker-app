/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daniellegrodi
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class createLoginForm extends JFrame implements ActionListener{
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textField1, textField2;
    
    createLoginForm(){
        //create label for username
        userLabel = new JLabel();
        userLabel.setText("Username");
        
        //create text field to get username from user
        textField1 = new JTextField(15);
        
        //create label for password
        passLabel = new JLabel();
        passLabel.setText("Password");
        
        //create text field to get password
        textField2 = new JPasswordField(15);
        
        b1 = new JButton("Submit");
        
        newPanel = new JPanel(new GridLayout(3,1));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(b1);
        
        //set border to panel
        add(newPanel, BorderLayout.CENTER);
        
        //perform action on button click
        b1.addActionListener(this);
        setTitle("Login Form");
    }
    
    public void actionPerformed(ActionEvent ae){
        String userValue = textField1.getText(); //get user input username from text field 1
        String passValue = textField2.getText();// get user input password from textfield2
        
        //check wheter credentials are authentic or not
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")){
            //if authentic navigate users to new page
            NewPage page = new NewPage();
            
            //make page visible to user
            page.setVisible(true);
            
            //create a welcome label
            JLabel welcomeLabel = new JLabel("Welcome: "+ userValue);
            page.getContentPane().add(welcomeLabel);
        } else {
            //show error message
            System.out.println("Please enter valid username and password");
        }
    }
}

class LoginFormDemo
{
    public static void main(String arg[]){
        try
        {
            createLoginForm form = new createLoginForm();
            form.setSize(300,100);
            form.setVisible(true);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}