package tokoonline;

public interface User{
    void setNama(String name,int index);
    void setAlamat(String alamat, int index);
    void setTelepon(String telepon,int index);
    String getNama(int index);
    String getAlamat(int index);
    String getTelepon(int index);
}
