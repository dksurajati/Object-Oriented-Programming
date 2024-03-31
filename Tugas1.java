/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        double alas, tinggi, luas;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitiga: ");
        alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = scanner.nextDouble();

        luas = (alas * tinggi) / 2;

        System.out.println("Luas segitiga adalah: " + luas);

        // Menutup objek Scanner untuk mencegah kebocoran sumber daya
        scanner.close();
    }
}
