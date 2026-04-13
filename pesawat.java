/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author RIZKA
 */
public class pesawat extends kendaraan {

    public pesawat(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " terbang di udara 30.000 kaki!");
    }
}

