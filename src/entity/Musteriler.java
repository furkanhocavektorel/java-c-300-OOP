package entity;

import entity.base.Insanlar;

public class Musteriler extends Insanlar {

    private Double borc;
    private int borcluGunSayisi;

    public Double getBorc() {
        return borc;
    }

    public void setBorc(Double borc) {
        this.borc = borc;
    }

    public int getBorcluGunSayisi() {
        return borcluGunSayisi;
    }

    public void setBorcluGunSayisi(int borcluGunSayisi) {
        this.borcluGunSayisi = borcluGunSayisi;
    }
}
