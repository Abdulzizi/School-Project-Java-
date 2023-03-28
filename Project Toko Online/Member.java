package tokoonline;

import java.util.ArrayList;

public class Member implements User{
    private ArrayList<String> namaMember;
    private ArrayList<String> alamat;
    private ArrayList<String> telepon;
    private ArrayList<Integer> saldo;
    
    
    
    Member(){
        namaMember= new ArrayList<>();
        alamat = new ArrayList<>();
        telepon = new ArrayList<>();
        saldo = new ArrayList<>();
        
        
    }
    @Override
    public void setNama(String nama,int index){
        namaMember.set(index, nama);
    }
    @Override
    public void setAlamat(String alamat,int index){
        this.alamat.set(index, alamat);
    }
    @Override
    public void setTelepon(String telepon,int index){
        this.telepon.set(index, telepon);
    }    
        
    @Override
        public String getNama(int index){
            return namaMember.get(index);
        }
    @Override
        public String getAlamat(int index){
            return alamat.get(index);
        }
    @Override
        public String getTelepon(int index){
            return telepon.get(index);
        }
        
        public void setSaldo(int saldo,int index){
            this.saldo.set(index, saldo);
        }
        public int getSaldo(int index, int jumlah){
            return saldo.get(index);
        }
        public void editSaldo(int index, int jumlah){
            int saldoLama = getSaldo(index,0);
            setSaldo(saldoLama + jumlah, index);
        }
       public int getJmlMember(){
           return namaMember.size();
    }
       
       //Tambahan(Untuk set member dan edit member di main class)
       public void addMember(String nama, String alamat, String telepon, int saldo){
        namaMember.add(nama);
        this.alamat.add(alamat);
        this.telepon.add(telepon);
        this.saldo.add(saldo);
    }
}
