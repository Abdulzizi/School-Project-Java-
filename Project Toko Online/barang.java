package tokoonline;

import java.util.ArrayList;

public class Barang{
    private ArrayList<String> namaBarang;
    private ArrayList<Integer> stok;
    private ArrayList<Integer> harga;
    
    Barang(){
        namaBarang = new ArrayList<>();
        stok = new ArrayList<>();
        harga = new ArrayList<>();
    }
    public int getJmlBarang(){
        return namaBarang.size();
    }
    public void setNamaBarang(String nama){
        namaBarang.add(nama);
    }
    public String getNamaBarang(int index){
        return namaBarang.get(index);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public int getStok(int index){
        return stok.get(index);
    }
    public int editStok(int index, int jumlah){
        int newStok = stok.get(index) + jumlah;
        stok.set(index, newStok);
        return newStok;
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int index){
        return harga.get(index);
    }
    
    
    //tambahan
    
    public void addItem(String nama, int stok, int harga){
        namaBarang.add(nama);
        this.stok.add(stok);
        this.harga.add(harga);
    }
}
