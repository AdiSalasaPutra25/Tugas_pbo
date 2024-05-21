/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package agrocriptopus.family;

/**
 *
 * @author Adi
 */
// Family.java
public class Family {
    private Person ibu;
    private Person ayah;
    private Anak[] anakAnak;

    public Family(Person ibu, Person ayah, Anak[] anakAnak) {
        this.ibu = ibu;
        this.ayah = ayah;
        this.anakAnak = anakAnak;
    }

    public void displayFamilyInfo() {
        System.out.println("Nama Ibu: " + ibu.getName() + ", Pekerjaan: " + ibu.getJob());
        System.out.println("Nama Ayah: " + ayah.getName() + ", Pekerjaan: " + ayah.getJob());
        System.out.println("Anak-Anak: ");
        for (Anak anak : anakAnak) {
            System.out.println("Nama: " + anak.getName() + ", Jenis Kelamin: " + anak.getGender());
        }
    }
}


