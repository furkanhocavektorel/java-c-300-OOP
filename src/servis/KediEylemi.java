package servis;

import entity.base.Hayvanlarım;

public class KediEylemi implements HayvanEylemleri{

    @Override
    public void sesCikar(Hayvanlarım hayvanlarım){
        System.out.println( hayvanlarım.getAd()+ " miyavliyor");
    }

    @Override
    public void suIc(Hayvanlarım hayvanlarım){
        System.out.println(hayvanlarım.getAd()+ " kaptan su iciyor kedi");
    }

}
