/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcacnj
 */
import java.*;
import java.sql.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class index {
    index s=new index();
    static Connection con=null;
    static ResultSet rs=null;
    static Statement st=null;
    static void DbConnection()
    {
        try{
            System.out.println("Inside try");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("inside try after class.forName");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/student","user1","123");
            System.out.println("Inside try after getconnection");
            st = con.createStatement();
        }
        catch(ClassNotFoundException e1)
        {
            System.out.println("Error"+e1.getMessage());
        }
        catch(SQLException e2){
            System.out.println(e2.getMessage());
        }
    }

    static void insertRecord() throws IOException,SQLException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter USN:");
        String s1 = br.readLine();
        System.out.println("Enter Name:");
        String s2 = br.readLine();
        System.out.println("Enter Semister:");
        int s3 = Integer.parseInt(br.readLine());
        System.out.println("Enter Age:");
        int s4 = Integer.parseInt(br.readLine());
        st.executeUpdate("insert into user1.std values('"+s1+"','"+s2+"',"+s3+","+s4+")");
        System.out.println("Record added");
    }
    static void deleteRecord() throws IOException,SQLException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        index.viewRecord();
        System.out.println("Enter USN to Delete:");
        String s1 = br.readLine();
        int a = st.executeUpdate("delete from user1.std where USN = '"+s1+"'");
        if(a > 0)
            System.out.println("Record Deleted");
        else
            System.out.println("USN not found");
    }
    static void updateRecord(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            index.viewRecord();
            System.out.println("Enter USN to update");
            String s1=br.readLine();
            System.out.println("Enter Name to update");
            String s2=br.readLine();
            System.out.println("Enter Semister  to update");
            int s3 = Integer.parseInt(br.readLine());
            System.out.println("Enter Age to update");
            int s4=Integer.parseInt(br.readLine());
            int executeUpdate=st.executeUpdate("Update user1.std SET NAME = '"+s2+"', SEM = "+s3+", AGE = "+s4+" where USN= '"+s1+"'");
            if(executeUpdate > 0)
                System.out.println("Record updated");
            else
                System.out.println("Record not updated");
   
        }
        catch(SQLException | IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void viewRecord() throws IOException,SQLException{
        rs = st.executeQuery("select * from user1.std");
        Boolean t = rs.next();
        if(!t)
            System.out.println("No Records");
        else{
            System.out.println("USN NAME SEMISTER AGE");
            do{
                System.out.println(""+rs.getString(1)+"---"+rs.getString(2)+"-----"+rs.getString(3)+"------"+rs.getString(4));
            }while(rs.next());
        }
    }
    public static void main(String[] args){
        try{
            DbConnection();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.println("1.Insert Record");
                System.out.println("2.Delete record");
                System.out.println("3.View record");
                System.out.println("4.Update record");
                System.out.println("5.Exit");
                System.out.println("Enter your choice");
                int ch=Integer.parseInt(br.readLine());
                switch(ch){
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
        catch(IOException | NumberFormatException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
}