/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbangunruang;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pil,kembali=1;
        double p,l,tb,j,tt;
        
        do {
            
        
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1.  Hitung Balok");
        System.out.println("2.  Hitung Tabung");    
        System.out.println("0.  Exit");
        System.out.print("Pilih : ");
        pil = input.nextInt();
        
        if ( pil == 1 ){
            System.out.print("Input Panjang   : ");
            p = input.nextDouble();
            System.out.print("Input Lebar     : ");
            l = input.nextDouble();
            System.out.print("Input Tinggi    : ");
            tb = input.nextDouble();
            
            persegipanjang persegipanjang = new persegipanjang(p,l);
            balok balok = new balok(p,l,tb);
            persegipanjang.luaspp();
            persegipanjang.kelilingpp();
            balok.volbalok();
            balok.lpbalok();
            
        }else if ( pil == 2 ) {
            System.out.print("Input Jari-Jari : ");
            j = input.nextDouble();
            System.out.print("Input Tinggi    : ");
            tt = input.nextDouble();
            
            lingkaran lingkaran = new lingkaran(j);
            tabung tabung = new tabung(j,tt);
            
            lingkaran.luaslingkaran();
            lingkaran.kelilinglingkaran();
            tabung.voltabung();
            tabung.lptabung();
       
        }else if ( pil == 0 ) {
            kembali=0;
        }else{
            System.out.println("Pilihan tidak tersedia");
            
        }
        
        if(pil != 0){
            System.out.println("Ulangi ? (Ya : 1 || Tidak : 0)");
            System.out.print("Jawaban : ");
            kembali = input.nextInt();
        }   
     } while (kembali==1);  
    }
    
}

