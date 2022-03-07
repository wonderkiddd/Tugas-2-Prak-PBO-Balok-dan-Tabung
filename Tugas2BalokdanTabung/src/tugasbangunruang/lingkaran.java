/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbangunruang;

/**
 *
 * @author ACER
 */
public class lingkaran implements MenghitungBidang {
double j;

    public lingkaran(double j) {
        this.j = j;
    }

    @Override
    public void luaslingkaran() {
        double hasil;
        hasil = 3.14*j*j;
        System.out.println("Luas Lingkaran      : " + hasil);
   
    }

    @Override
    public void kelilinglingkaran() {
        double hasil;
        hasil = 3.14*(j+j);
        System.out.println("Keliling Lingkaran  : " + hasil);
    }

    @Override
    public void luaspp() {
        
    }

    @Override
    public void kelilingpp() {
        
    }
    
}
