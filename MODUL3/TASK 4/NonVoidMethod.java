/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonvoidmethod;

/**
 *
 * @author Dell
 */
public class NonVoidMethod {
    public String getNama() {
        String nama = "Farah";
        return nama;
    }

    public String getNIM() {
        String nim = "L200183094";
        return nim;
    }

    public static void main(String[] args) {
        NonVoidMethod nonvoidmethod = new NonVoidMethod();
        System.out.println("Nama : " + nonvoidmethod.getNama());
        System.out.println("NIM : " + nonvoidmethod.getNIM());
    }
}
