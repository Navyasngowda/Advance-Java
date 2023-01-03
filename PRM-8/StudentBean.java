/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.io.Serializable;
/**
 *
 * @author mcacnj
 */
public class StudentBean implements Serializable {
    String name;
    String usn;
    String branch;
    String email;
    String phone;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
     public String getUsn(){
        return usn;
    }
     public void setUsn(String usn){
        this.usn=usn;
    }
    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public String getEmail()
    {
        return email;
    }
     public void setEmail(String email){
        this.email=email;
    }
        public String getPhone(){
        return phone;
    }      
         public void setPhone(String phone){
        this.phone=phone;
    }
}
