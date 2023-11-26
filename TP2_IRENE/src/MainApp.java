public class MainApp {
    public static void main(String[] args) throws Exception {
        
        Mobil mobil = new Mobil("Q2", 120.0, 4, 4);
        Bus bus = new Bus("AA3", 100.0, 2, 2);

        System.out.println("Informasi Mobil: ");
        mobil.hitungWaktuTempuh(19);
        System.out.println(mobil.toString());
        System.out.println("Waktu Tempuh : " +mobil.hitungWaktuTempuh(19));
        System.out.println(" ");

        System.out.println("------------------------------------------------");

        System.out.println(" ");
        System.out.println("Informasi Bus: ");
        bus.hitungWaktuTempuh(19);
        System.out.println(bus.toString());
        System.out.println("Waktu Tempuh : " +bus.hitungWaktuTempuh(19));

    }
}
