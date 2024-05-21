/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agrocriptopus.family;

/**
 *
 * @author Adi
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        Person ibu = new AbstractPerson("Sulastri", "Pedagang", "Perempuan") {};
        Person ayah = new AbstractPerson("Wiyarso", "Pedagang", "Laki-Laki") {};

        Anak anak1 = new Anak("Miftakhul Awaliyah", "Perempuan");
        Anak anak2 = new Anak("Isnaini Anggita Safitri", "Perempuan");
        Anak anak3 = new Anak("Adi Salasa Putra", "Laki-Laki");
        Anak anak4 = new Anak("Putri Mei Lani", "Perempuan");

        Anak[] anakAnak = {anak1, anak2, anak3, anak4};

        Family family = new Family(ibu, ayah, anakAnak);

        family.displayFamilyInfo();
    }
}


