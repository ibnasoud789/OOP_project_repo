/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;
import java.util.ArrayList;

/**
 *
 * @author Asif
 */
public class Subscriber {
    private String mail;
    private String password;
  

    public Subscriber(String mail, String password) {
        this.mail = mail;
        this.password = password;
        
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
}
