
public class Kopek extends Hayvanlarım {

    private boolean saldirganMi;



    Kopek(String cins){
        super(cins);
    }

    public void sesCikar(){
        System.out.println("havlıyor");
    }




    public boolean isSaldirganMi() {
        return saldirganMi;
    }

    public void setSaldirganMi(boolean saldirganMi) {
        this.saldirganMi = saldirganMi;
    }
}
