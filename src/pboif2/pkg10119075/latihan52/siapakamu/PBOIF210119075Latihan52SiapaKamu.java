/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan52.siapakamu;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan siapa kamu
 */

public class PBOIF210119075Latihan52SiapaKamu {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119075");
        mahasiswa.setNama("Aditiya musthafa kamil");
        mahasiswa.setUmur(21);
        mahasiswa.setKelas("PBO2");
        System.out.println("");
        System.out.println("\nNIM MAHASISWA: "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        System.out.println("");
    }
    
}
