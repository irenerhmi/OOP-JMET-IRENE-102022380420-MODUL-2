public class TelUExpress extends Ekspedisi
{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected  boolean antarInter;

    // TO DO: Create Constructor of TelUExpress
    public TelUExpress(int jumlahCabang, String pusat, float tarif, boolean antarInter){
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antarInter;
    }

    // TO DO: Create 'informasi' Method to show Information
    @Override
    public void informasi(){
        if (antarInter == true){
            System.out.println("Ekspedisi TeluExpress dengan jumlah cabang " + jumlahCabang + " dan berpusat di " + pusat + " mempunyai tarif sebesar " + tarif + " perkilogram. Selain itu, ekspedisi ini melayani paket pengantaran International" );
        } else {
            System.out.println("Ekspedisi ini tidak melayani pengantaran International");
        }
    }

    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil(String tempat){
        System.out.println("TelUExpress berhasil mengambil paket ke " + tempat);

    }

    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi){
        System.out.println("TelUExpress berhasil mengantar paket dengan no resi " + resi);
    }

    // TO DO: Create 'antar' Method to send two packages
    public void antar(int resi_1, int resi_2){
        System.out.println("TelUExpress berhasil mengantar paket dengan no resi " + resi_1 + " dan " + resi_2);
    }
}
