/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author RIZKA
 */
public class main {
    public static void main(String[] args) {
        System.out.println("=== METHOD OVERRIDING ===");

        kendaraan k1 = new mobil("Toyota Avanza");
        kendaraan k2 = new kapal("KM Sinabung");
        kendaraan k3 = new pesawat("Garuda Indonesia");

        k1.bergerak();
        k2.bergerak();
        k3.bergerak();

        System.out.println();
        k1.info();
    }
}
