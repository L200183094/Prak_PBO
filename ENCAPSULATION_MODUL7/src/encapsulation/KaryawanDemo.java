/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author DELL
 */
public class KaryawanDemo {
    public static void main(String[]args){
        Karyawan k1 = new Karyawan ();
        Manager b1 = new Manager ();
        
        k1.setNama("Farah");
        k1.setGaji(2500000);
        k1.setUsia(21);
        
        b1.setjamKerja(8.5);
        b1.setlamaJabatan(5);
        b1.setidManager(200200);
        b1.setgajiManager(10000000);
        b1.setRuang(2);
        
        
        
        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());
        
        System.out.println(b1.getjamKerja());
        System.out.println(b1.getlamaJabatan());
        System.out.println(b1.getidManager());
        System.out.println(b1.getgajiManager());
        System.out.println(b1.getRuang());
    }
    
}
