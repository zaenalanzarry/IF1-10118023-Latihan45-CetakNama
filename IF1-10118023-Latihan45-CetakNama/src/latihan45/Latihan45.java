/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan45;
import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Cetak Nama
 */

public class Latihan45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Printer printer = new Printer();
        
        //input
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(input.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(input.nextInt());
        
        //output
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
