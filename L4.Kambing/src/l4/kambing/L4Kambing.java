/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4.kambing;

/**
 * NAMA  : Luthfi Hilman 
 * NIM   : A2.1900099
 * Kelas : TI-1A
 * 
 * @author Luthfi Hilman
 */
public class L4Kambing {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambahkan: " + jumlahKambing);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        L4Kambing kambingJantan =  new L4Kambing ();
        kambingJantan.tambahKambing();
        // TODO code application logic here
    }
    
}
