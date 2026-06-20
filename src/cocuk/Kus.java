package cocuk;

import ata.Hayvanlarım;
import ata.Insan;
import ata.Ucanlar;

public class Kus extends Ucanlar {

    private boolean ucabilirMi;
    private int kanatGenisligi;
    private boolean gocMen;

    public Kus() {
        super();
    }

    public Kus(String cins) {
        super(cins);
    }



    public void uc() {
        if (ucabilirMi) {
            System.out.println("Kuş uçuyor...");
        } else {
            System.out.println("Bu kuş uçamaz.");
        }
    }

    public void dalEatla() {
        System.out.println("Daldan dala atlıyor...");
    }

    public void tuyleriniTemizie() {
        System.out.println("Tüylerini temizliyor...");
    }

    public void gocuYap() {
        if (gocMen) {
            System.out.println("Kuş göçe hazırlanıyor...");
        } else {
            System.out.println("Bu kuş göçmen değil.");
        }
    }








    public boolean isUcabilirMi() {
        return ucabilirMi;
    }

    public void setUcabilirMi(boolean ucabilirMi) {
        this.ucabilirMi = ucabilirMi;
    }

    public int getKanatGenisligi() {
        return kanatGenisligi;
    }

    public void setKanatGenisligi(int kanatGenisligi) {
        this.kanatGenisligi = kanatGenisligi;
    }

    public boolean isGocMen() {
        return gocMen;
    }

    public void setGocMen(boolean gocMen) {
        this.gocMen = gocMen;
    }
}
