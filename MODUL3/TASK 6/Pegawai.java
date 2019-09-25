/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

/**
 *
 * @author Dell
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji; 
    
    public void setDataPegawai(String namaPeg, int nipPeg, double gajiPeg){
        nama = namaPeg;
        nip = nipPeg;
        gaji = gajiPeg;
    }
    
    public void getDataPegawai (){
        System.out.println("Nama Pegawai : " + nama +"\n" + 
                           "NIP : " + nip +"\n" +
                           "Gaji Pegawai : " + gaji + "\n" );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai peg1 = new Pegawai();
        Pegawai peg2 = new Pegawai();
        Pegawai peg3 = new Pegawai();
        Pegawai peg4 = new Pegawai();
        Pegawai peg5 = new Pegawai();
        
        peg1.setDataPegawai("hapsoh", 379542, 170000);
        peg1.getDataPegawai();
        
        peg2.setDataPegawai("azi", 379542, 130000);
        peg2.getDataPegawai();
        // TODO code application logic here
    }
    
}
