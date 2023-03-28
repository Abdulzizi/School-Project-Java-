package tokoonline;

import java.util.ArrayList;

public class Transaksi{
    private ArrayList<Integer> idMember;
    private ArrayList<Integer> idBarang;
    private ArrayList<Integer> banyak;
    
    Transaksi(){
        idMember = new ArrayList<>();
        idBarang = new ArrayList<>();
        banyak = new ArrayList<>();
    }
    
    public void setTransaksi(Barang barang, int idMember,int idBarang, int banyak){
        this.idMember.add(idMember);
        this.idBarang.add(idBarang);
        this.banyak.add(banyak);
        barang.editStok(idBarang, - banyak);
    }
    
    public int prosesTransaksi(Member member, Transaksi transaksi, Barang barang){
        int totalHarga = 0;
        for (int i = 0; i < transaksi.idBarang.size(); i++) {
            int id = transaksi.idBarang.get(i);
            int jumlah = transaksi.banyak.get(i);
            totalHarga += barang.getHarga(id) * jumlah;
        }
        int idMember = transaksi.idMember.get(0);
        int saldo = member.getSaldo(idMember,0);
        if (saldo < totalHarga) {
            System.out.println("Transaksi Gagal. Saldo Tidak Mencukupi.");
            return -1;
        }else{
            member.editSaldo(idMember, -totalHarga);
            System.out.println("Transaksi Berhasil. Total Harga : "+totalHarga);
            return totalHarga;
        }
    }
    
    public int getIdBarang(int index){
        return idBarang.get(index);
    }
    public int getBanyaknya(int index){
        return banyak.get(index);
    }
    public int getIdMember(int index){
        return idBarang.size();
    }
    public int getJmlTransaksi(){
        return idBarang.size();
    }
}
