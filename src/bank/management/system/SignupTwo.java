package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class SignupTwo extends JFrame implements ActionListener{
    

    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,income,category,occupation,education;
    String formno;

    
    SignupTwo(String formno)  {
        this.formno= formno;
        
        setLayout(null);
        
        
        setTitle("NEW APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails); 
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[]= {"General","OBC","SC","ST","Other"};
        category= new JComboBox (valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomecategory[]= {"NULL","< 1,50,000","< 2,00,000","< 5,00,000","Upto 10,00,000"};
        income= new JComboBox (incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
                     
        JLabel educational  = new JLabel("Educational");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);
       
           
        JLabel email  = new JLabel("Qualifications:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String educationValues[]= {"Non-Graduation","Graduate","Post-Graduate","Doctrate","Others"};
        education= new JComboBox (educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
       
        
        JLabel maritalStatus  = new JLabel("Occupation:");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);
        
        String occupationValues[]= {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation= new JComboBox (occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
      
        
        JLabel address  = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel state  = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes= new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno= new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();        
        maritalgroup.add(syes);
        maritalgroup.add(sno);
  
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes= new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno= new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();        
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
    
        
       
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("RALEWAY",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
               

        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
       public void actionPerformed(ActionEvent ae){
       
       //we are using (string) because getselectitem will return values but we have values in string so to concate it 
       String sreligion= (String)religion.getSelectedItem ();    //s means string of religion & get selector item for chosing values from dropdown menu 
       String scategory= (String)category.getSelectedItem();
       String sincome= (String)income.getSelectedItem();   //getuo was returniong the textfield so concate by jtextfield
       String seducation =(String)education.getSelectedItem();
       String soccupation =(String)occupation.getSelectedItem();
       String seniorcitizen= null;
       if(syes.isSelected()) {
          seniorcitizen="Yes";
    }  else if(sno.isSelected()){
        seniorcitizen="No";
    }    
    
       String existingaccount=null;
       if(eyes.isSelected()){
          existingaccount ="YES";
       }else if(eno.isSelected()){
           existingaccount= "NO";
     
       }
       String span = pan.getText();
       String saadhar = aadhar.getText();
        
       
       
       try{
         //also we want to continue with the signupone data so we need to pass on the form no from signupone
             Conn c= new Conn();
             String query= "Insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"', '"+sincome+"', '"+seducation+"','"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
             c.s.executeUpdate(query);   //dml command
             
             //Signup3 Object     
             setVisible(false);
             new SignupThree(formno).setVisible(true);
             
       } catch (Exception e){
           System.out.println(e);
       }
       
    }
    
   
    public static void main(String args[]) {
       new SignupTwo("");
    }
}

