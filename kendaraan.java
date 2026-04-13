/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author RIZKA
 */
public class kendaraan {
    String nama;

    public kendaraan(String nama) {
        this.nama = nama;
    }

    public void bergerak() {
        System.out.println(nama + " sedang bergerak...");
    }

    public void info() {
        System.out.println("Ini adalah kendaraan: " + nama);
    }
}

