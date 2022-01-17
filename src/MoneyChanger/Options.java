/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyChanger;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Options {
     AuthProces auth = new AuthProces();
     DataProces dataProcess = new DataProces();
    private static String uname,upass;
    private static int cekLogin=-1, pil;
    
    public void menuUtama(){
        System.out.print("\n========================");
        System.out.print("\n=====  M  E  N  U  =====");
        System.out.println("\n========================");
        System.out.println("1. Login Admin");
        System.out.println("2. Login User");
        System.out.println("3. Keluar");
        System.out.println("========================");
        System.out.print("Masukkan pilihan : ");
    }
    
    public void logonAdmin(){
        Scanner  scan = new Scanner(System.in);
        System.out.print("\n=========================");
        System.out.print("\n======  L O G I N  ======");
        System.out.println("\n=========================");
        System.out.print("User Admin : ");
        uname = scan.next();
        System.out.print("Password : ");
        upass = scan.next();
        cekLogin = auth.loginAdmin(uname, upass);
        
        if(cekLogin != -1){
            menuAdmin(); 
        }
    }
    
    
    public void logonUser(){
        Scanner  scan = new Scanner(System.in);
        System.out.print("\n=========================");
        System.out.print("\n======  L O G I N  ======");
        System.out.println("\n=========================");
        System.out.print("Username : ");
        uname = scan.next();
        System.out.print("Password : ");
        upass = scan.next();
        cekLogin = auth.loginUser(uname, upass);
        
        if(cekLogin != -1){
            menuUser(); 
        }
    }
    
     private void menuAdmin(){
        Scanner  scan = new Scanner(System.in);
        System.out.println("\nSelamat Datang " + auth.getIsLogin());
        System.out.println("");
        do{
            System.out.print("\n========================");
            System.out.print("\n====== A D M I N =======");
            System.out.println("\n========================");
            System.out.println("1. Tambah Matauang");
            System.out.println("2. Ubah Matauang");
            System.out.println("3. Lihat Matauang");
            System.out.println("4. Hapus Matauang");
            System.out.println("5. Tambah User");
            System.out.println("6. Lihat User");
            System.out.println("0. Log Out");
            System.out.println("\n========================");
            System.out.print("Pilih : ");
            pil = scan.nextInt();
            scan.nextLine();
            switch(pil){
                case 1:
                    addUang();
                    break;
                case 2:
                    updateUang();
                    break;
                case 3:
                    dataProcess.lihatUang();
                    break;
                case 4:
                    removeUang();
                    break;
                case 5:
                    tambahUser();
                    break;
                case 6:
                    dataProcess.lihatPengguna();
                    break;
            }
        }while(pil != 0);
    }
     
     
     private void menuUser(){
        Scanner  scan = new Scanner(System.in);
        System.out.println("\nSelamat Datang " + auth.getIsLogin());
        System.out.println("");
        do{
            System.out.print("\n========================");
            System.out.print("\n======  U S E R  =======");
            System.out.println("\n========================");
            System.out.println("1. Deposit");
            System.out.println("2. Tukar uang");
            System.out.println("3. Lihat Saldo");
            System.out.println("0. Log Out");
            System.out.println("\n========================");
            System.out.print("Pilih : ");
            pil = scan.nextInt();
            scan.nextLine();
            switch(pil){
                case 1:
                    penggunaDeposit();
                   // insertPeserta();
                    break;
                case 2:
                    System.out.println("Tukar uang");
                    //updatePeserta();
                    break;
                case 3:
                    //viewPeserta();
                    break;
            }
        }while(pil != 0);
    }
     
     private void tambahUser(){
        Scanner scan = new Scanner(System.in);
        String unm,nm,almt,psw;
        double sld;
        int pil, idx;
        
        System.out.println("Buat Username Login : ");
        unm = scan.nextLine();
        System.out.println("Buat Password Login : ");
        psw =  scan.nextLine();
        System.out.println("Masukkan Nama Anda : ");
        nm =  scan.nextLine();
        System.out.println("Masukkan Alamat Anda : ");
        almt =  scan.nextLine();
        System.out.println("\n========================");
        idx =  auth.dataUser(unm, nm, almt, psw);
        dataProcess.lihatPengguna(idx);
        menuAdmin();
     }
          
     
     
     private void addUang(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n==================================");
        System.out.println("Masukkan Mata Uang = ");
        String mataUang = scan.nextLine();
        System.out.println("Masukkan Negara = ");
        String negara = scan.nextLine();
        System.out.println("\nMasukkan Satuan Terkecil = ");
        double nominal = scan.nextDouble();
        System.out.println("\nMasukkan Harga Tukar = ");
        double nilaiTukar = scan.nextDouble();
        System.out.println("\nMasukkan Saldo Uang = ");
        double saldo = scan.nextDouble();
        int i = dataProcess.tambahUang(mataUang, negara, nominal, nilaiTukar, saldo);
        dataProcess.lihatUang(i-1);
     }
     
     
    private void updateUang(){
        Scanner scan = new Scanner(System.in);
        dataProcess.lihatUang();
        System.out.println("Masukkan ID Uang yang akan di UBAH : ");
        int Search = scan.nextInt();
        dataProcess.lihatUang(Search-1);
        System.out.println("\nMasukkan Mata Uang = ");
        String mataUang = scan.next();
        System.out.println("Masukkan Negara = ");
        String negara = scan.next();
        System.out.println("Masukkan Besar Nominal = ");
        double nominal = scan.nextDouble();
        System.out.println("Masukkan Harga Tukar = ");
        double nilaiTukar = scan.nextDouble();
        System.out.println("Masukkan Saldo Uang = ");
        double saldo = scan.nextDouble();
        dataProcess.ubahUang(Search-1, mataUang, negara, nominal, nilaiTukar, saldo);
    }
    
    
    private void removeUang(){
        Scanner scan = new Scanner(System.in);
        dataProcess.lihatUang();
        System.out.println("Masukkan ID uang yang akan di HAPUS : ");
        int search = scan.nextInt();
        dataProcess.hapusUang(search-1);
    }
    
    
    private void penggunaDeposit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Deposit (Rupiah) : ");
        double dpst = scan.nextDouble();
        dataProcess.depositPengguna(dpst);
    }
}
