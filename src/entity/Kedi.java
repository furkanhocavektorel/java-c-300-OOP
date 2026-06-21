package entity;

import entity.base.Hayvanlarım;

// POJO  - plain old java object
public class Kedi extends Hayvanlarım {

    private boolean tekirMi;

    public boolean isTekirMi() {
        return tekirMi;
    }

    public void setTekirMi(boolean tekirMi) {
        this.tekirMi = tekirMi;
    }


}
