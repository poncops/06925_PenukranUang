/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyChanger;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MoneyChanger {
  private int jumlah, perolehan, kembalian, s, e, r;
    //private User usr;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //adm = new Admin();
        // TODO code application logic here
        AuthProces auth = new AuthProces ();
        Options menu = new Options();
        Scanner scan = new Scanner(System.in);
        int pil;
        auth.dataAdmin(); //Inisialisasi Admin dan user
        do{
            menu.menuUtama(); //Tampilan Menu Utama
            pil = scan.nextInt();
            switch(pil){
                case 1:
                    menu.logonAdmin(); //Login Admin
                    break;
                case 2:
                    menu.logonUser(); //Login User
                    break;
            }
        }while(pil != 3);      
    }
}
