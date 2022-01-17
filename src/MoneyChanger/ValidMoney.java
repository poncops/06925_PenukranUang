/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyChanger;
public class ValidMoney {
  private String negara, mataUang;
    private double nominal,saldo,rupiah, nilaiTukar;


    public ValidMoney(String nama, String negara, double nominal, double nilaiTukar, double saldo){
        this.mataUang = nama;
        this.negara = negara;
        this.nominal = nominal;
        this.nilaiTukar = nilaiTukar;
        this.saldo = saldo;
        hitRupiah(nominal,nilaiTukar,saldo);
    }
    
    protected  String getNegara(){
        return this.negara;
    }
    
    protected  String getMatauang(){
        return this.mataUang;
    }
    
    protected  double getRupiah(){
        return this.rupiah;
    }
    
    protected double getNominal()
    {
        return nominal;
    }
    
    protected void setSaldo(double sld){
        this.saldo = sld;
    }
    
    protected double getSaldo(){
        return saldo;
    }
    
    protected void setNilaiTukar(double nltkr){
        this.nilaiTukar = nltkr;
    }
    
    protected double getNilaiTukar(){
        return nilaiTukar;
    }
    
    protected void hitRupiah(double nominal, double saldo, double nilaiTukar){
        double rp;
        rp = nominal*saldo*nilaiTukar;
        this.rupiah =  rp;
    }
    
}
