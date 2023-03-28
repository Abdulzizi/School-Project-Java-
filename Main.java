package bangunruang;

public class Main {

    public static void main(String[] args) {

        kubus k = new kubus(3,4,7);
        System.out.println("Volume kubus : "+k.volume);
        System.out.println("Luas Permukaan Kubus : "+k.luasPermukaan);
        
        balok b = new balok(4,5,3);
        System.out.println("Volume Balok : "+b.volume);
        System.out.println("Luas Permukaan Balok "+b.luasPermukaan);
        
        tabung t = new tabung(7,2);
        System.out.println("Volume tabung : "+t.volume);
        System.out.println("Luas Permukaan tabung "+t.luasPermukaan);
        
        kerucut ke = new kerucut(12,3);
        System.out.println("Volume kerucut : "+ke.volume);
        System.out.println("Luas Permukaan kerucut : "+ke.luasPermukaan);
        
        limas l  = new limas(3,4,2);
        System.out.println("Volume limas : "+l.volume);
        System.out.println("Luas Permukaan limaas : "+l.luasPermukaan);
        
        prisma p = new prisma(5,6,4);
        System.out.println("");
    }
    
}
