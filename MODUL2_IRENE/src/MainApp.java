public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(12, "Bandung", 2000);
        ekspedisi.informasi();
        System.out.println(" ");

        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress telUExpress = new TelUExpress(2, "Jakarta", 20000, true);
        telUExpress.ambil("Jawa");
        telUExpress.antar(10202234);
        telUExpress.antar(100020, 100021);
        telUExpress.informasi();
        System.out.println(" ");

        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress = new FRIExpress(20, "Bekasi", 10000, true);
        friExpress.terima(2);
        friExpress.kirim("Bogor");
        friExpress.kirim("Jogja", "Malang");
        friExpress.informasi();
    }
}
