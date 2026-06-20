package ata;

public class Ucanlar extends Hayvanlarım {



    private boolean suzulmeYapabilirMi;

    public Ucanlar() {
        super();
    }

    public Ucanlar(boolean suzulmeYapabilirMi) {
        this.suzulmeYapabilirMi = suzulmeYapabilirMi;
    }

    public Ucanlar(String cins) {
        super(cins);
    }

    public boolean isSuzulmeYapabilirMi() {
        return suzulmeYapabilirMi;
    }

    public void setSuzulmeYapabilirMi(boolean suzulmeYapabilirMi) {
        this.suzulmeYapabilirMi = suzulmeYapabilirMi;
    }
}
