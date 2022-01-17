/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyChanger;

public class AuthAdmin extends UserAbstract {
    ValidMoney uang[] = new ValidMoney[100];
    
    public AuthAdmin(String username, String nama, String alamat, String password){
        super(username, nama, alamat,password);
    }
    
    public void updateSaldo(double saldo){
       
    }
    
    
}
