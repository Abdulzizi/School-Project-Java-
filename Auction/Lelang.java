
import java.util.ArrayList;

public class Lelang {
    private ArrayList<Integer> idPenawar;
    private ArrayList<Integer> idBarang;
    private ArrayList<Integer> hargaTawar;
    private boolean status;
    
     public ArrayList<Integer> getIdPenawar() {
        return idPenawar;
    }

    public void setIdPenawar(ArrayList<Integer> idPenawar) {
        this.idPenawar = idPenawar;
    }

    public ArrayList<Integer> getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(ArrayList<Integer> idBarang) {
        this.idBarang = idBarang;
    }

    public ArrayList<Integer> getHargaTawar() {
        return hargaTawar;
    }

    public void setHargaTawar(ArrayList<Integer> hargaTawar) {
        this.hargaTawar = hargaTawar;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
