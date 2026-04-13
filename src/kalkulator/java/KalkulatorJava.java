/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator.java;

/**
 *
 * @author RIZKA
 */
public class KalkulatorJava {
    /**
     * @param args the command line arguments
     */
    // Luas lingkaran (1 parameter: jari-jari)
    public double hitungLuas(double r) {
        return Math.PI * r * r;
    }
    // Luas persegi panjang (2 parameter: panjang, lebar)
    public double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Luas segitiga (3 parameter: alas, tinggi, dan tipe "segitiga")
    public double hitungLuas(double alas, double tinggi, String bentuk) {
        if (bentuk.equals("segitiga")) {
            return 0.5 * alas * tinggi;
        }
        return 0;
    }

    public static void main(String[] args) {
        KalkulatorJava k = new KalkulatorJava();

        System.out.println("=== METHOD OVERLOADING ===");
        System.out.printf("Luas Lingkaran (r=7): %.2f%n", k.hitungLuas(7));
        System.out.printf("Luas Persegi Panjang (5x4): %.2f%n", k.hitungLuas(5, 4));
        System.out.printf("Luas Segitiga (6x3): %.2f%n", k.hitungLuas(6, 3, "segitiga"));
    }
}
