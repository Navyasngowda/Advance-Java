/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcacnj
 */
import java.io.*;
import java.sql.*;

public class sample {
   sample s=new sample();
   static Connection con=null;
   static ResultSet rs=null;
   static Statement st=null;
   static void DbConnection()
   {
       try
       {
           System.out.println("Inside try");
           Class.forName("org.apache.derby.jdbc.ClientDriver");
           System.out.println("inside try after class forname");
           con=DriverManager.getConnection("jdbc:derby://localhost:1527/students","user1","123");
           System.out.println("inside try after getConnection");
           st=con.createStatement();
       }
       catch(ClassNotFoundException e1)
       {
           System.out.println("Error"+e1.getMessage());
       }
       catch(SQLException e2)
       {
           System.out.println(e2.getMessage());
       }
   }
   static void insertRecord()throws IOException,SQLException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter USN");
      String s1=br.readLine();
      System.out.println("Enter Name");
      String s2=br.readLine();
      System.out.println("Enter Sem");
      String s3=br.readLine();
      System.out.println("Enter Age");
      int s4=Integer.parseInt(br.readLine());
      st.executeUpdate("Insert into USER1.STUDENT values('"+s1+"','"+s2+"','"+s3+"',"+s4+")");
      System.out.println("Record Added");
   }
   
   static void deleteRecord()throws IOException,SQLException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        sample.viewRecord();
        System.out.println("Enter USN to Delete");
        String s1=br.readLine();
        int a=st.executeUpdate("delete from USER1.STUDENT where Student_USN='"+s1+"'");
        if(a>=0)
            System.out.println("Record Deleted");
        else
            System.out.println("User Not Found");
   }
   
   static void updateRecord(){
       try{
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        sample.viewRecord();
        System.out.println("Enter USN to update");
        String s1=br.readLine();
        System.out.println("Enter Name");
        String s2=br.readLine();
        System.out.println("Enter Sem");
        String s3=br.readLine();
        System.out.println("Enter Age");
        int s4=Integer.parseInt(br.readLine());
        int executeUpdate=st.executeUpdate("update USER1.STUDENT set Student_Name='"+s2+"',Student_Sem='"+s3+"',Student_Age="+s4+" where Student_USN='"+s1+"'");
        if(executeUpdate>0)
            System.out.println("Record Inserted");
        else
            System.out.println("Record Not Updated");
       }
       catch(SQLException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
   }
    static void viewRecord()throws IOException,SQLException{
        rs=st.executeQuery("select * from USER1.STUDENT");
        Boolean t=rs.next();
        if(!t)
           System.out.println("No Records");
           else{
                   System.out.println("USN      |    Name     |     Semester     |    Age:");
                   do{
                       System.out.println(" "+rs.getString(1)+"       "+rs.getString(2)+"          "+rs.getString(3)+"           "+rs.getString(4));
                   }
                   while(rs.next());
                   }
    }
        
      public static void main(String[] args){
          try{
              DbConnection();
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              while(true)
              {
                  System.out.println("1.Insert Record");
                  System.out.println("2.Delete Record");
                  System.out.println("3.View Record");
                  System.out.println("4.Update Record");
                  System.out.println("5.Exit");
                  System.out.println("Enter Your Choice");
                  int ch=Integer.parseInt(br.readLine());
                  switch(ch)
                  {
                      case 1:insertRecord();
                                break;
                      case 2:deleteRecord();
                                break;
                      case 3:viewRecord();
                                break;
                      case 4:updateRecord();
                                break;
                      case 5:System.exit(0);
                      default:break;
                                
                  }
              }
          }
         catch(Exception e){
             System.out.println(e.getMessage()); 
      }  
    }
}
