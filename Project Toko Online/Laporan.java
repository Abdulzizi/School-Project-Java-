package tokoonline;

public class Laporan {
    
//    ("%d. \t %s \t\t %d \t %d\n"+ i + 1 + barang.getNamaBarang(i)+ barang.getStok(i)+ barang.getHarga(i));
    
    public static void laporan(Barang barang){
        System.out.println("Laporan Barang : ");
        System.out.println("======================================");
        System.out.println("No. \t Nama Barang \t Stok \t Harga");
        System.out.println("======================================");
        for (int i = 0; i < barang.getJmlBarang(); i++) {
            System.out.println(i + 1 +"\t"+ barang.getNamaBarang(i)+"\t\t"+ barang.getStok(i)+"\t"+ barang.getHarga(i)+"\n");
        }
    }
    
    public static void laporan(Member member){
        System.out.println("Laporan Member : ");
        System.out.println("=================================");
        System.out.println("No. \t Nama \t\t Saldo");
        System.out.println("=================================");
        for (int i = 0; i < member.getJmlMember(); i++) {
            System.out.println(i+1+"\t"+ member.getNama(i)+"\t\t"+ member.getSaldo(i,0)+"\n");
        }
    }
    
    public static void laporan(Transaksi transaksi, Barang barang){
        System.out.println("Laporan Transaksi : ");
        System.out.println("========================================================================");
        System.out.println("No. \t Nama Barang \t Banyak \t Harga \t Total Harga \t Member");
        System.out.println("========================================================================");    
        for (int i = 0; i < transaksi.getJmlTransaksi(); i++) {
            int idBarang = transaksi.getIdBarang(i);
            int idMember = transaksi.getIdMember(i);
            int banyaknya = transaksi.getBanyaknya(i);
            int hargaBarang = barang.getHarga(idBarang);
            int totalHarga = hargaBarang * banyaknya;
            String namaBarang = barang.getNamaBarang(idBarang);
            String namaMember = "-";
            if (idMember != -1) {
                namaMember = "Member "+ (idMember+1);
            }
            System.out.println( i+1 +". \t "+namaBarang+" \t\t"+ banyaknya +" \t"+ hargaBarang +" \t\t"+ totalHarga +" \t\t\t " + namaMember +"\n");
        }
    }
}
