package pboif2.pkg10119079.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI: 
 *
 */
public class PBOIF210119079Latihan31PerkenalanMahasiswa {
    public static void main(String[] args) {
         Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10110269";
        mhs1.name = "Rizki Adam Kurniawan";
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10110270";
        mhs2.name = "Indra Tiola";
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "10110271";
        mhs3.name = "Robi Tanzil Ganefi";
        
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nim = "10110269";
        mhs4.name = "Muhammad Nur Awaludin";
        
        mhs1.perkenalanmahasiswa();
        mhs2.perkenalanmahasiswa();
        mhs3.perkenalanmahasiswa();
        mhs4.perkenalanmahasiswa();    
        
    }
    
}