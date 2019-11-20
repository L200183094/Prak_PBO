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
public class Manager extends Karyawan {
    private double jamKerja = 7.5f;
    private int gajiManager;
    private int Ruang;
    private int lamaJabatan;
    private int idManager;
    
    public double getjamKerja(){
        return jamKerja;
    }
    
    public void setjamKerja(double jamKerja){
        this.jamKerja = jamKerja;
    }
    
    public float getgajiManager(){
        return getGaji() *2;
    }
    
    public void setgajiManager(int gajiManager){
        this.gajiManager = gajiManager;
    }
     
    public int getRuang(){
        return Ruang;
    }
    
    public void setRuang(int Ruang){
        this.Ruang = Ruang;
    }
    
    public int getlamaJabatan(){
        return lamaJabatan;
    }
    
    public void setlamaJabatan(int lamaJabatan){
        this.lamaJabatan = lamaJabatan;
    }
    
    public int getidManager(){
        return idManager;
    }
    
    public void setidManager(int idManager){
        this.idManager = idManager;
    }
}
