package bangunruang;

public class kerucut extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.volume = ((1/3) * Math.PI * (jariJari * jariJari ) * tinggi);
        this.luasPermukaan = Math.PI * jariJari  * (jariJari + Math.sqrt((tinggi * tinggi) + (jariJari *jariJari)));
    }
}