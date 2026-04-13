/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author RIZKA
 */
public class kapal extends kendaraan {

    public kapal(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berlayar di atas air!");
    }
}

