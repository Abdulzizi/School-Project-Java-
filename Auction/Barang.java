
import java.util.ArrayList;

public class Barang {
    private ArrayList<Integer> idMasyarakat;
    private ArrayList<String> namaBarang;
    private ArrayList<Integer> hargaAwal;
    private boolean status;
    
     public ArrayList<Integer> getIdMasyarakat() {
        return idMasyarakat;
    }

    public void setIdMasyarakat(ArrayList<Integer> idMasyarakat) {
        this.idMasyarakat = idMasyarakat;
    }

    public ArrayList<String> getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(ArrayList<String> namaBarang) {
        this.namaBarang = namaBarang;
    }

    public ArrayList<Integer> getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(ArrayList<Integer> hargaAwal) {
        this.hargaAwal = hargaAwal;
    }

    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
}
