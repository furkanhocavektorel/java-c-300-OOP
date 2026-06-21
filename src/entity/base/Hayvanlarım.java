package entity.base;

public abstract class Hayvanlarım {

    private String ad;
    private String cins ;
    private int boy;
    private int kilo;
    private int yas;
    private String renk;
    private boolean disiMi;

    protected Hayvanlarım(){
    }

    public Hayvanlarım(String cins){
        this.cins=cins;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getCins() {
        return cins;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public boolean isDisiMi() {
        return disiMi;
    }

    public void setDisiMi(boolean disiMi) {
        this.disiMi = disiMi;
    }
}
