/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodparameter;

/**
 *
 * @author Dell
 */
public class MethodParameter {
    String nama;
    public String setNama(String nama) {
        return this.nama = nama;
    }

    public static void main(String[] args) {
        MethodParameter mp = new MethodParameter();
        mp.setNama("Helooooooo ");
        System.out.println(mp.nama);
    }
}

