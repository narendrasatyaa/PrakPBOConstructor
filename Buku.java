/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buku;

/**
 *
 * @author HP
 */
public class Buku {
    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;
//    Constructor 1
    public Buku(String namaPengarang, String judulBuku){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = 1998;
        this.cetakanKe = 23;
        this.hargaJual = 200.00;
    }
//    Comstructor 2
     public Buku(String namaPengarang, String judulBuku, int tahunTerbit){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = 24;
        this.hargaJual = 78.00;
    }
//     Consgtructor 3
      public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = 234.00;
    }
    
      public void tampilInfo(){
          System.out.println("Nama Pengarang: " + namaPengarang + "\n" + "Judul Buku: " + judulBuku + "\n" + "Tahun Terbit: " + tahunTerbit +"\n" + "Cetakan Ke -" + cetakanKe +"\n" + "Harga : " + hargaJual);
      }
    
    
    public static void main(String[] args) {
        Buku [] buku = new Buku[10];
        
       buku[0] = new Buku("George Orwell", "1984");
       buku[1] = new Buku("Harper Lee", "To Kill a Mockingbird", 1960);
       buku[2] = new Buku("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 1997, 20);
       buku[3] = new Buku("J.R.R. Tolkien", "The Hobbit", 1937);
       buku[4]= new Buku("F. Scott Fitzgerald", "The Great Gatsby", 1925, 10);
       buku[5] = new Buku("Markus Zusak", "The Book Thief");
       buku[6] = new Buku("Jane Austen", "Pride and Prejudice", 1813);
       buku[7]= new Buku("Gabriel Garcia Marquez", "One Hundred Years of Solitude", 1967, 12);
       buku[8] = new Buku("Leo Tolstoy", "War and Peace", 1869);
       buku[9] = new Buku("Charlotte Bronte", "Jane Eyre", 1847, 5);
         
        
        for (Buku book : buku) {
          book.tampilInfo();
        }
    }
    
}
