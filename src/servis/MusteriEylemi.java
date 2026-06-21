package servis;

import entity.Musteriler;

// service- business
public class MusteriEylemi {

    public void borcKatla(Musteriler musteri){

        if (musteri.getBorcluGunSayisi()>10){
            musteri.setBorc(musteri.getBorc()*2);
        }


    }

}
