package cocuk;

public class GocmenKus extends Kus{

    private boolean yemekSakladiMi;


    @Override
    public void sesCikar() {
        System.out.println("leylek bagırıyor");
    }

    public boolean isYemekSakladiMi() {
        return yemekSakladiMi;
    }

    public void setYemekSakladiMi(boolean yemekSakladiMi) {
        this.yemekSakladiMi = yemekSakladiMi;
    }
}
