package praktek03;
public class SepatuAksi {
    public static void main(String[] args){
        Sepatu Vans = new Sepatu();
        Sepatu Nike = new Sepatu();
        Sepatu Adidas = new Sepatu();
        
        Vans.jenis="Sneakers";
        Vans.warna="Hitam";
        Vans.harga=300000;
        
        Nike.jenis="Running";
        Nike.warna="Navy";
        Nike.harga=500000;
        
        Adidas.jenis="Boots";
        Adidas.warna="Hitam";
        Adidas.harga=800000;
        
        Vans.cetakInfo();
        Nike.cetakInfo();
        Adidas.cetakInfo();
    }
}
