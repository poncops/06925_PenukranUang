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
public class AuthProces {
    static AuthAdmin[] admin = new AuthAdmin[100];
    static Pelanggan[] user = new Pelanggan[100];
    private static int jumUser = 0, index=0, idLogin;
    private static String isLogin="";
    
    public int dataAdmin() {
        String userAdmin = "admin";
        String namaAdmin = "Admin";
        String alamatAdmin = "Surabaya";
        String passAdmin = "123";
        admin[index] = new AuthAdmin(userAdmin, namaAdmin, alamatAdmin, passAdmin);            
        user[jumUser] = new Pelanggan(userAdmin, namaAdmin, alamatAdmin, passAdmin);
        index = index++;
        jumUser = 1;
        return index-1;
    }
    
    public int totUser() {
        return user.length;
    }
    
    
    public int totAdmin() {
        return admin.length;
    }
    
    public int dataUser(String unm, String nm, String alm, String password) {
        user[jumUser] = new Pelanggan(unm, nm, alm, password);
        jumUser = jumUser++;
        return jumUser-1;
    }
     public int dataUser() {
        return jumUser;
    }
     
      public AuthAdmin[] getAdmin(){
        return admin;
    }
      
    public Pelanggan[] getUser(){
        return user;
    }
    
    public int loginAdmin(String nama, String password){
        AuthAdmin[] admin = getAdmin();
        int loop = 0;
           try{
            for(int i=0; i < totAdmin(); i++){
                if(nama.equals(admin[i].getUsername()) && password.equals(admin[i].getPassword())){
                    isLogin = admin[i].getUsername();
                    idLogin = i;
                    break;
                }
               loop++;
            }
            if(loop == totAdmin()-1){
                loop = -1;
            }
        } catch (Exception e){
             loop = -1;
             System.err.println("Gagal Login");
        }
        return loop;
    }
    
    public int loginUser(String nama, String password){
        Pelanggan[] user = getUser();
        int loop = 0;
           try{
            for(int i=0; i <= totUser(); i++){
                if(user[i].getUsername().equals(nama) && user[i].getPassword().equals(password)){
                    isLogin = user[i].getUsername();
                    idLogin = i;
                    index = i;
                    break;
                }
               loop++;
            }
            if(loop == (totUser()-1)){
                loop = -1;
            }
        } catch (Exception e){
             loop = -1;
             System.err.println("Gagal Login ");
        }
        return loop;
    }
    
    protected String logout(UserAbstract usr){
       isLogin = "";
       return isLogin;
    }
     public String getIsLogin(){
       return isLogin;
    }
    public int getIdLogin(){
       return idLogin;
    }
     public int getJumlUser(){
       return jumUser;
    }
     
}
