package entity;

import entity.base.Hayvanlarım;

public class Kopek extends Hayvanlarım {

    private boolean saldirganMi;

    public Kopek(String cins){
        super(cins);
    }

    public boolean isSaldirganMi() {
        return saldirganMi;
    }

    public void setSaldirganMi(boolean saldirganMi) {
        this.saldirganMi = saldirganMi;
    }
}
