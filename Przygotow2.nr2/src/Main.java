
import Boxes.Box;
import Boxes.Proznia;
import Boxes.Termo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var al = new ArrayList<Box>();
        ArrayList<Integer> list = new ArrayList<>();
        Proznia boxp1 = new Proznia(80,"kiełba");
        Proznia boxp2 = new Proznia(20,"steak");
        Termo ter1 = new Termo(40,"piwo", -15);
        Termo ter2 = new Termo(80, "Cola",1);
        Box boxes = new Box(45,"Ramen");
      al.add(boxes);
      al.add(boxp1);
      al.add(boxp2);
      al.add(ter1);
      al.add(ter2);
      ter1.getzmiana(-40);
      boxp1.zapieczentowanie("k");
      boxp1.getzmiana(-40);
      for (Box box : al) {

          System.out.println(box);
      }



    }
}