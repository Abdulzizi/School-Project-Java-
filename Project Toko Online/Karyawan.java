package tokoonline;

import java.util.ArrayList;
import java.util.Scanner;

public class Karyawan implements User{
    private ArrayList<String> namaKaryawan;
    private ArrayList<String> alamat;
    private ArrayList<String> telepon;
    private ArrayList<String> jabatan;
    
    Karyawan(){
        namaKaryawan = new ArrayList<>();
        alamat = new ArrayList<>();
        telepon = new ArrayList<>();
        jabatan = new ArrayList<>();
    }
    //Setter dari user
    @Override
     public void setNama(String nama, int index) {
        namaKaryawan.set(index, nama);
    }

    @Override
    public void setAlamat(String alamat, int index) {
        this.alamat.set(index, alamat);
    }
    @Override
    public void setTelepon(String telepon, int index) {
        this.telepon.set(index, telepon);
    }
    //getter Dari user
    @Override
    public String getNama(int index) {
        return namaKaryawan.get(index);
    }
    @Override
     public String getAlamat(int index) {
        return alamat.get(index);
    }

    @Override
    public String getTelepon(int index) {
        return telepon.get(index);
    }
    public void setJabatan(String jabatan, int index) {
        this.jabatan.set(index, jabatan);
    }

    public String getJabatan(int index) {
        return jabatan.get(index);
    }
    public int getJmlKaryawan(){
        return namaKaryawan.size();
    }
    
    //Tambahan
    
//     public void addKaryawan(String nama, String alamat, String telepon, String jabatan){
//        namaKaryawan.add(nama);
//        this.alamat.add(alamat);
//        this.telepon.add(telepon);
//        this.jabatan.add(jabatan);
//    }
    
    public void addKaryawan(Scanner sc){
        System.out.print("Masukan Nama Karyawan : ");
        String nama = sc.nextLine();
        System.out.print("Masukan Alamat Karyawan : ");
        String alamat = sc.nextLine();
        System.out.print("Masukan No. Telepon Karyawan : ");
        String telepon = sc.next();
        System.out.print("Masukan Jabatan Karyawan : ");
        String jabatan = sc.nextLine();
        namaKaryawan.add(nama);
        this.alamat.add(alamat);
        this.telepon.add(telepon);
        this.jabatan.add(jabatan);
    }
    public void editKaryawan(Scanner sc, int index){
        System.out.print("\nMasukan Nomor Karyawan yang ingin di edit : ");
        int editIndex = sc.nextInt();
        System.out.print("Masukan nama : ");
        String editNama = sc.nextLine();
        System.out.print("Masukan Alamat : ");
        String editAlamat = sc.nextLine();
        System.out.print("Masukan No. Telepon : ");
        String editTelepon = sc.next();
        System.out.print("Masukan Jabatan : ");
        String editJabatan = sc.nextLine();
        
        
    }
}
