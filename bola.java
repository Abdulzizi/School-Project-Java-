package bangunruang;

public class bola extends BangunRuang {
    private double jariJari;

    public bola(double jariJari) {
        this.jariJari = jariJari;
        this.volume = ((4/3) * Math.PI * jariJari * jariJari * jariJari);
        this.luasPermukaan = (4 * Math.PI * jariJari * jariJari);
    }
}
