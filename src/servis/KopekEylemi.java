package servis;

import entity.base.Hayvanlarım;
import entity.Kopek;

public class KopekEylemi implements HayvanEylemleri,IKopekEylemi {

    @Override
    public void sesCikar(Hayvanlarım hayvanlarım) {
        System.out.println(hayvanlarım.getAd() + " havliyor");

    }

    @Override
    public void suIc(Hayvanlarım hayvanlarım) {
        System.out.println(hayvanlarım.getAd()+" kaptan su iciyor");

    }


    @Override
    public void kovala(Kopek kopek) {
        System.out.println( kopek.getAd() +" arabayı kovalıyor..");
    }

}
