import entity.Kedi;
import entity.Kopek;
import entity.Kus;
import entity.Musteriler;
import servis.KediEylemi;
import servis.KopekEylemi;
import servis.KusEylemi;
import servis.MusteriEylemi;

public class App {

    // OOP Object Oriented Programing 4 madde var
    // Encapsulation - Kapsülleme
    // inheritence miras alma - kalıtım
    // polymorphism - çok biçimlilik
    // abstraction - soyutlama

    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("kangal");
        kopek1.setAd("karabas");
        Kopek kopek2 = new Kopek("alman");
        kopek2.setAd("sementa");

        Kedi kedi= new Kedi();
        kedi.setAd("pamuk");

        Kus kus=new Kus();
        kus.setAd("boncuk");

        KopekEylemi kopekEylemi = new KopekEylemi();
        kopekEylemi.kovala(kopek1);
        kopekEylemi.suIc(kopek2);

        KediEylemi kediEylemi=new KediEylemi();
        kediEylemi.sesCikar(kedi);

        KusEylemi kusEylemi=new KusEylemi();
        kusEylemi.sesCikar(kus);
        kusEylemi.suIc(kus);
        kusEylemi.suIc(kus);


        kediEylemi.sesCikar(kedi);

        kopekEylemi.suIc(kopek2);


        Musteriler musteri= new Musteriler();

        musteri.setBorc(500d);

        System.out.println("musterinin borcu: "+musteri.getBorc());
        musteri.setBorcluGunSayisi(15);

        MusteriEylemi musteriEylemi= new MusteriEylemi();

        musteriEylemi.borcKatla(musteri);

        System.out.println("musterinin yeni borcu: "+ musteri.getBorc());







    }

}





