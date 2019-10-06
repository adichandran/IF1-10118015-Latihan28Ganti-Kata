/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan28gantikata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini dapat mengganti kata dalam sebuah kalimat dimana 
 *                        user menginputkan sendiri kalimatnya
 */
public class IF110118015Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String jadiKata;
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Ganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = input.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = input.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = input.next();
        
        kalimatBaru =  (kalimatAwal).replaceAll(gantiKata, jadiKata);
        
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat Awal : "+kalimatAwal);
        System.out.println("Kalimat Baru : "+kalimatBaru);
    }
    
}
