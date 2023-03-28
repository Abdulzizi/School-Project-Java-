package tokoonline;

import java.util.Scanner;

public class TokoOnline{
        
    public static void main(String[] args) {
        
       Member member = new Member();
       Karyawan karyawan = new Karyawan();
       Barang barang = new Barang();
       Transaksi transaksi = new Transaksi();
        
     Scanner sc = new Scanner(System.in);   
     int choice = 0;
        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Add Member");
            System.out.println("2. Add Employee");
            System.out.println("3. Add Item");
            System.out.println("4. Process Transaction");
            System.out.println("5. View Report");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");
            
            try{
                choice = sc.nextInt();
                sc.nextLine();//
                switch(choice){
                    case 1:
                        //member logic
                        System.out.println("\n=== ADD MEMBER ===");
                        System.out.print("Masukan Nama : ");
                        String nama = sc.nextLine();
                        System.out.print("Masukan Alamat : ");
                        String alamat = sc.nextLine();
                        System.out.print("Masukan No. Telepon : ");
                        String telepon = sc.next();
                        System.out.print("Masukan Saldo Member : ");
                        int saldo = sc.nextInt();
                        sc.nextLine();
                        
                        member.addMember(nama, alamat, telepon, saldo);
                        System.out.println("Member berhasil ditambahkan!\n");
                        break;
                    case 2:
                        //Employee Logic 
                        System.out.println("");
                        System.out.println("=== ADD KARYAWAN ===");
                        karyawan.addKaryawan(sc);
                        System.out.println("Karyawan berhasil ditambahkan!\n"); 
                        break;
                    case 3:
                        //  Item Logic
                        System.out.println("\n=== ADD ITEM ===");
                        System.out.print("Masukan Nama Barang : ");
                        String namaBarang = sc.nextLine();
                        System.out.print("Masukan Stok Barang : ");
                        int stok = sc.nextInt();
                        System.out.print("Masukan harga Barang : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        
                        barang.addItem(namaBarang, stok, harga);
                        System.out.println("Barang berhasil ditambahkan!\n");
                        break;
                    case 4:
                        // Transaksi logic
                        
                        System.out.println("\n === TRANSAKSI PENJUALAN ===");
                        System.out.print("ID Member : ");
                        int idMember = sc.nextInt();
                        System.out.print("ID Barang : ");
                        int idBarang = sc.nextInt();
                        System.out.print("Banyaknya : ");
                        int banyaknya = sc.nextInt();
                        
                        
                        if (idMember < 1 || idMember > member.getJmlMember()) {
                            System.out.println("Gagal melakukan transaksi. ID Member tidak ditemukan");
                        }
                        else if (idBarang < 1 || idBarang > barang.getJmlBarang()) {
                            System.out.println("Gagal Melakukan transaksi. ID barang tidak ditemukan");
                        }
                        else if (barang.getStok(idBarang-1) < banyaknya) {
                            System.out.println("Gagal melakukan transaksi. Stok barang tidak mencukupi");
                        }
                        else{
                            transaksi.setTransaksi(barang, idMember, idBarang-1, banyaknya);
                            transaksi.prosesTransaksi(member, transaksi, barang);
                        }
                        break;
                    case 5:
                        // Report
                        System.out.println("\n=== LAPORAN ===");
                       
                        int choiceL = 0;
                        System.out.print("Laporan member/Barang/Transaksi(1/2/3) : ");
                        choiceL = sc.nextInt();
                        if (choiceL == 1) {
                            System.out.println("");
                            Laporan.laporan(member);
                        }
                        else if (choiceL == 2) {
                            System.out.println("");
                            Laporan.laporan(barang);
                        }
                        else if (choiceL == 3) {
                            System.out.println("");
                            Laporan.laporan(transaksi, barang);
                        }
                        else{
                            System.out.println("Input yng anda masukan tidak ada.");
                        }
                        break;
                    case 6:
                        System.out.println("GoodBye!");
                        break;
                    default:
                        System.out.println("Invalid Choice!.");
                        break;
                    }   
            }catch(Exception e){
                System.out.println("Invalid Input. Please enter a number.");
                sc.nextLine();//
            }
        } while (choice != 6);
        
        
    }
    
    //Tambahan
    
}
