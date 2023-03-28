package bangunruang;

public class prisma extends BangunRuang {
    private double alas;
    private double tinggiAlas;
    private double tinggi;

    public prisma(double alas, double tinggiAlas, double tinggi) {
        this.alas = alas;
        this.tinggiAlas = tinggiAlas;
        this.tinggi = tinggi;
        this.volume = ((alas * tinggi) / 2) * tinggi;
    }
}