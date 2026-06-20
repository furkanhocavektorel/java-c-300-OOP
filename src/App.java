import cocuk.GocmenKus;
import cocuk.Kedi;
import cocuk.Kus;

public class App {

    // OOP Object Oriented Programing
    // Encapsulation - Kapsülleme
    // inheritence miras alma - kalıtım

    public static void main(String[] args) {

        // Kuş nesnesi oluşturup özellik verelim
        Kus kus = new Kus("Serçe");
        kus.setAd("Minik");
        kus.setBoy(14);
        kus.setKilo(25);
        kus.setRenk("Gri-Kahve");
        kus.setUcabilirMi(true);
        kus.setKanatGenisligi(18);

        System.out.println("--- Kus Bilgileri ---");
        System.out.println("Ad: " + kus.getAd());
        System.out.println("Cins: " + kus.getCins());
        System.out.println("Boy: " + kus.getBoy());
        System.out.println("Kilo: " + kus.getKilo());
        System.out.println("Renk: " + kus.getRenk());
        System.out.println("Kanat Genisligi: " + kus.getKanatGenisligi());
        kus.sesCikar();
        kus.uc();
        kus.tuyleriniTemizie();

        // Göçmen kuş örneği
        GocmenKus gocmen = new GocmenKus();
        gocmen.setAd("Leyla");
        gocmen.setGocMen(true);
        gocmen.setYemekSakladiMi(true);

        System.out.println("\n--- Gocmen Kus ---");
        System.out.println("Ad: " + gocmen.getAd());
        System.out.println("Cins: " + gocmen.getCins());
        gocmen.sesCikar();
        gocmen.gocuYap();

        // Kedi örneği
        Kedi kedi = new Kedi();
        kedi.setAd("Pamuk");
        kedi.setTekirMi(true);
        System.out.println("\n--- Kedi ---");
        System.out.println("Ad: " + kedi.getAd());
        System.out.println("Tekir mi: " + kedi.isTekirMi());
        kedi.sesCikar();

    }

}





