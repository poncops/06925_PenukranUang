/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyChanger;

/**
 *
 * @author ASUS
 */
public class UserAbstract {
   private String username,nama, alamat, password;
    
    public UserAbstract(String uname, String nm, String almt, String pass){
        this.username = uname;
        this.nama = nm;
        this.alamat = almt;
        this.password = pass;
    }
        
    public String getUsername(){
        return username;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    public void setAlamat (String alamat){
        this.nama = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    
    public void setPassword (String pass){
        this.password = pass;
    }
    
    public String getPassword(){
        return password;
    }
    
}
  
