package bangunruang;

public class tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.volume = Math.PI * jariJari * jariJari * tinggi;
        this.luasPermukaan =  2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}