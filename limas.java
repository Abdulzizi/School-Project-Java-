package bangunruang;

public class limas extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public limas(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.volume = (1.0/3) * panjang * lebar * tinggi;
        this.luasPermukaan =    panjang * lebar + panjang * Math.sqrt(((lebar/2.0) * (lebar/2.0)) + (tinggi * tinggi)) + lebar * Math.sqrt(((panjang/2.0) * (panjang/2.0)) + (tinggi * tinggi));
    }
}