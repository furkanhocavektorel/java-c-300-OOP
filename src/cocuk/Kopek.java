package cocuk;

import ata.Hayvanlarım;

public class Kopek extends Hayvanlarım {

    private boolean saldirganMi;



    public Kopek(String cins){
        super(cins);
    }





    @Override
    public void sesCikar(){
        System.out.println("ucuyor");
    }




    public boolean isSaldirganMi() {
        return saldirganMi;
    }

    public void setSaldirganMi(boolean saldirganMi) {
        this.saldirganMi = saldirganMi;
    }
}
