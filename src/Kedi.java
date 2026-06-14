public class Kedi extends Hayvanlarım {

    private boolean tekirMi;


    Kedi(){
        super("kedi");
    }

    public void sesCikar(){

        System.out.println("miyavlıyor");
        super.sesCikar();
    }



    public boolean isTekirMi() {
        return tekirMi;
    }

    public void setTekirMi(boolean tekirMi) {
        this.tekirMi = tekirMi;
    }
}
