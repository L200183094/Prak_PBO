/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localvariable1;

/**
 *
 * @author Dell
 */
public class LocalVariable1 {
    int usia = 0;
    
    public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan() {
        int beratBadan = 0;
        int beratLahir = 3;

        beratBadan = beratLahir + (usia / 2);

        System.out.println("Berat badan : " + beratBadan);
    }
    public static void main(String[] args) {
        LocalVariable1 dis = new LocalVariable1();
        dis.hitungUsia();
        dis.beratBadan();
    }
    
}
