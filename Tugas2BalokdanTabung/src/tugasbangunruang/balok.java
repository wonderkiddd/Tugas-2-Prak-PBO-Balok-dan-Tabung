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
public class balok implements MenghitungRuang{
    double p,l,tb;

    public balok(double p, double l, double tb) {
        this.p = p;
        this.l = l;
        this.tb = tb;
    }

    @Override
    public void volbalok() {
        double hasil;
        hasil = p*l*tb;
        System.out.println("Volume Balok            : " + hasil);
    }

    @Override
    public void lpbalok() {
        double hasil;
        hasil = 2*((p*l)+(p*tb)+(l*tb));
        System.out.println("Luas Permukaan Balok    : " + hasil);
    }

    @Override
    public void lptabung() {
        
    }

    @Override
    public void voltabung() {
        
    }
    
}
