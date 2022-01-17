/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyChanger;

public class Pelanggan extends UserAbstract{
    private double saldo=0;
    public Pelanggan(String uname, String nm, String almt, String pass){
        super(uname,nm,almt,pass);
    }
    
    public Pelanggan(String uname, String nm, String almt, String pass, double sld){
        super(uname,nm,almt,pass);
        this.saldo = sld;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }    
    
}
