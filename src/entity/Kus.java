package entity;

import entity.base.Hayvanlarım;

public class Kus extends Hayvanlarım {

    private boolean ucabilirMi;
    private int kanatGenisligi;
    private boolean gocMen;

    public Kus() {
        super();
    }

    public Kus(String cins) {
        super(cins);
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
