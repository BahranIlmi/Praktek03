package praktek03;
public class SepatuAksi {
    public static void main(String[] args){
        Sepatu Vans = new Sepatu();
        Sepatu Nike = new Sepatu();
        Sepatu Adidas = new Sepatu();
        
        Vans.setJenis("Casual");
        Vans.setWarna("Biru");
        Vans.setHarga(300000);
        
        Nike.setJenis("Futsal");
        Nike.setWarna("Abu-Abu");
        Nike.setHarga(500000);
        
        Adidas.setJenis("Sneakers");
        Adidas.setWarna("Putih");
        Adidas.setHarga(800000);
        
        Vans.cetakInfo();
        Nike.cetakInfo();
        Adidas.cetakInfo();
        
        System.out.print("Jenisnya \t: ");
        System.out.println(Vans.getJenis());
        System.out.print("Warnanya \t: ");
        System.out.println(Vans.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(Vans.getHarga());
    }
}
