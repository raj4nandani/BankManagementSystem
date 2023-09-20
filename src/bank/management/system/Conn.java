package bank.management.system;


import java.sql.*;


//5 steps in this 1.register the driver 2.create connection 3. create statement 4.execute query 5.close connection
//(we dont have a main class in here becoz conn will be used as obj)
public class Conn {
    
    Connection c;  //create connection  
    Statement s;   //create statement
    public Conn(){
        //to catch runtime errors using exceptional handling, my sql is external entity
        try{
           Class.forName("com.mysql.cj.jdbc.Driver"); //register the driver
         //url is conn string
         c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","2509"); 
         s= c.createStatement();
         
         
        }catch(Exception e)
            
        {
            System.out.println(e);
            
        }
    }    
    
      
    }

