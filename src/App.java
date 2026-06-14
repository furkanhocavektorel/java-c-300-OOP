import java.util.List;
import java.util.Scanner;

public class App {

    // OOP Object Oriented Programing
    // Encapsulation - Kapsülleme
    // inheritence miras alma - kalıtım

    public static void main(String[] args) {

        Kopek [] kopeklerim= new Kopek[3];

        Kopek k1 = new Kopek("pekinez");
        k1.setAd("matija");
        k1.setKilo(15);
        k1.setSaldirganMi(true);
        k1.sesCikar();

        kopeklerim[0]=k1;

        Kopek k2= new Kopek("Kangal");

        kopeklerim[1]=k2;

    }

    
    public static void test(Kopek[] kopeklerim){
        System.out.println(kopeklerim[0].getAd());

        System.out.println(kopeklerim[1].isSaldirganMi());

    }


}
