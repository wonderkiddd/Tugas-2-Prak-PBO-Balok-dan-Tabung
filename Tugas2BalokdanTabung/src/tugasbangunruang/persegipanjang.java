package tugasbangunruang;


import tugasbangunruang.MenghitungBidang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class persegipanjang implements MenghitungBidang {
    double p,l;

    public persegipanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }
    

    @Override
    public void luaslingkaran() {
        
    }

    @Override
    public void kelilinglingkaran() {
        
    }

    @Override
    public void luaspp() {
        double hasil;
        hasil = p*l;
        System.out.println("Luas Persegi Panjang        : " + hasil);
        
    }

    @Override
    public void kelilingpp() {
        double hasil;
        hasil = 2*(p+l);
        System.out.println("Keliling Persegi Panjang    : " + hasil);
        
    }
}
