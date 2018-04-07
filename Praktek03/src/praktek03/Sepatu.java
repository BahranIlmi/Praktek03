package praktek03;
public class Sepatu {
    private String jenis;
    private String warna;
    private double harga;
    
    void cetakInfo(){
        System.out.println("====================");
        System.out.println("Jenis \t: "+jenis+"\n"+
                "Warna \t: "+warna+"\n"+
                "Harga \t: "+harga+"\n");
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
