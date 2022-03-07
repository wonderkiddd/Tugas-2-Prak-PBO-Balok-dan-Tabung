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
public class tabung implements MenghitungRuang{
    double j,tt;

     public tabung(double j, double tt) {
        this.j = j;
        this.tt = tt;
    }
     
    @Override
    public void volbalok() {
        
    }

    @Override
    public void lpbalok() {
        
    }

    @Override
    public void lptabung() {
        double hasil;
        hasil = 2*3.14*j*(j+tt);
        System.out.println("Luas Permukaan Tabung   : " + hasil);
        
    }

    @Override
    public void voltabung() {
        double hasil;
        hasil = (3.14*j*j)*tt;
        System.out.println("Volume Tabung           : " + hasil);
    }
    
}
