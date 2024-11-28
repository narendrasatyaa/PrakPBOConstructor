/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

/**
 *
 * @author HP
 */
public class Tugas5 {
    private String nama;
    private int umur;
    
    public Tugas5(){
        this.nama = "Uknown";
        this.umur = 100;
    }
    
    public Tugas5(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public void InfoBosku(){
        System.out.println("Nama: " + nama + "\n" + "Umur: " + umur);
    }
    
}
