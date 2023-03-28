package bangunruang;

public class kubus extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public kubus(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.volume = panjang * lebar * tinggi;
        this.luasPermukaan = 2 *((panjang * lebar) +  (panjang * tinggi) + (lebar * tinggi));
    }
}