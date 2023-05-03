
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
//     // membuat objek-objek yang diperlukan
//        Masyarakat masyarakat = new Masyarakat();
//        Petugas petugas = new Petugas();
//        Barang barang = new Barang();
//        Lelang lelang = new Lelang();
//        Penawar penawar = new Penawar();
//
//        // mengisi data masyarakat, petugas, barang, dan lelang
//        ArrayList<String> namaMasyarakat = new ArrayList<>();
//        namaMasyarakat.add("Andi");
//        namaMasyarakat.add("Budi");
//        masyarakat.setNama(namaMasyarakat);
//
//        ArrayList<String> namaPetugas = new ArrayList<>();
//        namaPetugas.add("Cici");
//        namaPetugas.add("Dedi");
//        petugas.setNama(namaPetugas);
//
//        ArrayList<Integer> idMasyarakat = new ArrayList<>();
//        idMasyarakat.add(1);
//        idMasyarakat.add(2);
//        barang.setIdMasyarakat(idMasyarakat);
//
//        ArrayList<String> namaBarang = new ArrayList<>();
//        namaBarang.add("Sepatu");
//        namaBarang.add("Baju");
//        barang.setNamaBarang(namaBarang);
//
//        ArrayList<Integer> hargaAwal = new ArrayList<>();
//        hargaAwal.add(100000);
//        hargaAwal.add(50000);
//        barang.setHargaAwal(hargaAwal);
//
//        ArrayList<Integer> idPenawar = new ArrayList<>();
//        idPenawar.add(1);
//        idPenawar.add(2);
//        lelang.setIdPenawar(idPenawar);
//
//        ArrayList<Integer> idBarang = new ArrayList<>();
//        idBarang.add(1);
//        idBarang.add(2);
//        lelang.setIdBarang(idBarang);
//
//        ArrayList<Integer> hargaTawar = new ArrayList<>();
//        hargaTawar.add(150000);
//        hargaTawar.add(75000);
//        lelang.setHargaTawar(hargaTawar);
//
//        // menampilkan data lelang sebelum tutup
//        System.out.println("Data Lelang Sebelum Ditutup");
//        penawar.tampilkanLelang(lelang);
//
//        // menutup lelang
////        penawar.tutupLelang(barang);
//
//        // menampilkan data lelang setelah tutup
//        System.out.println("Data Lelang Setelah Ditutup");
//        penawar.tampilkanLelang(lelang);
//        
//        penawar.tutupLelang(barang);


         Scanner scanner = new Scanner(System.in);

         // Inisialisasi data masyarakat
        Masyarakat masyarakat = new Masyarakat();
        ArrayList<String> namaMasyarakat = new ArrayList<>();
        ArrayList<String> alamatMasyarakat = new ArrayList<>();
        ArrayList<String> teleponMasyarakat = new ArrayList<>();
        namaMasyarakat.add("Abdul Qodir");
        alamatMasyarakat.add("Jl. Sudirman No. 10");
        teleponMasyarakat.add("081234567890");
        masyarakat.setNama(namaMasyarakat);
        masyarakat.setAlamat(alamatMasyarakat);
        masyarakat.setTelepon(teleponMasyarakat);
        
        // Inisialisasi data petugas
        Petugas petugas = new Petugas();
        ArrayList<String> namaPetugas = new ArrayList<>();
        ArrayList<String> alamatPetugas = new ArrayList<>();
        ArrayList<String> teleponPetugas = new ArrayList<>();
        namaPetugas.add("Osama Bin Sama");
        alamatPetugas.add("Jl. Thamrin No. 20");
        teleponPetugas.add("081234567891");
        petugas.setNama(namaPetugas);
        petugas.setAlamat(alamatPetugas);
        petugas.setTelepon(teleponPetugas);
        
        // Inisialisasi data barang
        Barang barang = new Barang();
        ArrayList<Integer> idMasyarakat = new ArrayList<>();
        ArrayList<String> namaBarang = new ArrayList<>();
        ArrayList<Integer> hargaAwal = new ArrayList<>();
        idMasyarakat.add(1);
        namaBarang.add("Sepeda");
        hargaAwal.add(500000);
        barang.setIdMasyarakat(idMasyarakat);
        barang.setNamaBarang(namaBarang);
        barang.setHargaAwal(hargaAwal);
        
        // Inisialisasi data lelang
        Lelang lelang = new Lelang();
        ArrayList<Integer> idPenawar = new ArrayList<>();
        ArrayList<Integer> idBarang = new ArrayList<>();
        ArrayList<Integer> hargaTawar = new ArrayList<>();
        idPenawar.add(1);
        idBarang.add(1);
        hargaTawar.add(600000);
        lelang.setIdPenawar(idPenawar);
        lelang.setIdBarang(idBarang);
        lelang.setHargaTawar(hargaTawar);
        
        // Inisialisasi objek Penawar
        Penawar penawar = new Penawar();
        
         // Menampilkan data masyarakat
        System.out.println("Data Masyarakat:");
        for (int i = 0; i < masyarakat.getNama().size(); i++) {
            System.out.println("Nama: " + masyarakat.getNama().get(i));
            System.out.println("Alamat: " + masyarakat.getAlamat().get(i));
            System.out.println("Telepon: " + masyarakat.getTelepon().get(i));
        }
        
        // Menampilkan data petugas
        System.out.println("\nData Petugas:");
        for (int i = 0; i < petugas.getNama().size(); i++) {
            System.out.println("Nama: " + petugas.getNama().get(i));
            System.out.println("Alamat: " + petugas.getAlamat().get(i));
            System.out.println("Telepon: " + petugas.getTelepon().get(i));
        }
        
        // Menampilkan data barang
    System.out.println("\nData Barang:");
    for (int i = 0; i < barang.getIdMasyarakat().size(); i++) {
        System.out.println("ID Barang: " + (i+1));
        System.out.println("ID Masyarakat: " + barang.getIdMasyarakat().get(i));
        System.out.println("Nama Barang: " + barang.getNamaBarang().get(i));
        System.out.println("Harga Awal: " + barang.getHargaAwal().get(i));
        System.out.println();
    }
    
    // Menampilkan data lelang
    System.out.println("\nData Lelang:");
    for (int i = 0; i < lelang.getIdPenawar().size(); i++) {
        System.out.println("ID Lelang: " + (i+1));
        System.out.println("ID Penawar: " + lelang.getIdPenawar().get(i));
        System.out.println("ID Barang: " + lelang.getIdBarang().get(i));
        System.out.println("Harga Tawar: " + lelang.getHargaTawar().get(i));
        System.out.println();
    }
    
    // Memulai proses lelang
    System.out.println("\n--- Proses Lelang ---");
    System.out.print("Masukkan ID Barang yang akan dilelang: ");
    int idBarang1 = scanner.nextInt();
    scanner.nextLine(); // membersihkan newline di buffer

    // Cek apakah ID Barang yang dimasukkan valid
    if (idBarang1 < 1 || idBarang1 > barang.getIdMasyarakat().size()) {
        System.out.println("ID Barang tidak valid!");
    }
    
      // Cetak informasi barang yang bakal dilelang
    System.out.println("\nInformasi Barang:");
    System.out.println("Nama Barang: " + barang.getNamaBarang().get(idBarang1 - 1));
    System.out.println("Harga Awal: " + barang.getHargaAwal().get(idBarang1 - 1));

    // Cek apakah barang sudah pernah dilelang sebelumnyaa
    if (lelang.getIdBarang().contains(idBarang1)) {
        System.out.println("Barang sudah pernah dilelang sebelumnya!");
    }
    
    // Mulai proses penawaran
    System.out.println("\n--- Proses Penawaran ---");
    boolean stop = false;
    while (!stop) {
        System.out.print("Masukkan ID Penawar: ");
        int idPenawar1 = scanner.nextInt();
        scanner.nextLine(); // Kalo kata internet ini buat membersihkan buffer
    
        // Cek apakah ID Penawar yang dimasukkan Valdi
        if (idPenawar1 < 1 || idPenawar1 > masyarakat.getNama().size()) {
            System.out.println("ID Penawar tidak valid!");
            return;
        }
        // Cek apakah ID Penawar sudah pernah melakukan penawaran sebelumnya
        if (lelang.getIdPenawar().contains(idPenawar1)) {
            System.out.println("Anda sudah pernah melakukan penawaran sebelumnya!");
        }
        
        // Cetak informasi penawaran
        System.out.println("\nInformasi Penawaran:");
        System.out.println("ID Barang: " + idBarang.get(idBarang1 - 1));
        System.out.println("ID Penawar: " + idPenawar.get(idPenawar1 - 1));
        System.out.println("Harga Tawar: " + barang.getHargaAwal().get(idBarang1 - 1));
        
        // meminta input harga tawar dari penawar
        System.out.print("Masukkan harga tawaran Anda: ");
        int hargaTawar1 = scanner.nextInt();
        scanner.nextLine(); // bersihin buffer lagi
        
        // Cek apakah harga tawar yang dimasukkan valdi
         if (hargaTawar1 <= barang.getHargaAwal().get(idBarang1 - 1)) {
        System.out.println("Harga tawaran harus lebih besar dari harga awal!");
         }
    
           // menambahkan data penawaran ke dalam list lelang
           lelang.getIdBarang().add(idPenawar1);
           lelang.getIdPenawar().add(idPenawar1);
           lelang.getHargaTawar().add(hargaTawar1);
    
            // Cek apakah penawaran terakhir atau belum
         System.out.print("Apakah ada penawaran lagi? (y/n): ");
         String lanjut = scanner.nextLine();
         if (lanjut.equalsIgnoreCase("n")) {
         stop = true;
                   }
             }

            // Cetak hasil lelang
            System.out.println("\n--- Hasil Lelang ---");
            if (lelang.getIdPenawar().isEmpty()) {
            System.out.println("Tidak ada penawaran pada barang ini.");
        } else {
            int maxIndex = lelang.getHargaTawar().indexOf(Collections.max(lelang.getHargaTawar()));
            int idPenawarMenang = lelang.getIdPenawar().get(maxIndex);
            int hargaTertinggi = lelang.getHargaTawar().get(maxIndex);

            System.out.println("ID Penawar dengan harga tertinggi: " + idPenawarMenang);
            System.out.println("Harga tertinggi: " + hargaTertinggi);
        }
         
     }
}