public class Kendaraan {
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang){
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public double hitungWaktuTempuh(double jarak){
        return jarak / kecepatanMaksimum;
    }

    public String toString(){
        
        return 
        "Nomor Identifikasi : " + this.nomorIdentifikasi + "\n" +
        "Kecepatan Maksimum : " + this.kecepatanMaksimum + " km/jam" + "\n" + 
        "Kapasitas Penumpang : " + this.kapasitasPenumpang + " orang";
    }
}
