public class Penawar implements LelangA{
    
    @Override
    public void bukaLelang(Barang barang) {
        barang.setStatus(true);
    }
    @Override
     public void tutupLelang(Barang barang) {
        barang.setStatus(false);
        int indexPemenang = 0;
        int hargaTertinggi = 0;
        for (int i = 0; i < barang.getHargaAwal().size(); i++) {
            if (barang.getHargaAwal().get(i) > hargaTertinggi) {
                hargaTertinggi = barang.getHargaAwal().get(i);
                indexPemenang = i;
            }
        }
        System.out.println("Pemenang lelang adalah " + barang.getNamaBarang().get(indexPemenang) +  " dengan harga penawaran " + barang.getHargaAwal().get(indexPemenang));
    }
    @Override
      public void tampilkanLelang(Lelang lelang) {
        for (int i = 0; i < lelang.getIdBarang().size(); i++) {
            System.out.println("ID Barang: " + lelang.getIdBarang().get(i));
            System.out.println("ID Penawar: " + lelang.getIdPenawar().get(i));
            System.out.println("Harga Tawar: " + lelang.getHargaTawar().get(i));
            System.out.println("");
        }
    }
}
