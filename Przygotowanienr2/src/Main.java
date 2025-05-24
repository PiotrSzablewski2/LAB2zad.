
import boxes.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wybur = 0;
        int nr = 1;
        int ilosc = 0;
        Box[] boxy = new Box[3];
        boxy[0] = new Box(30,"Cola");
        boxy[1] = new Box(10,"Cheassburger");
        boxy[2] = new Box(50,"Corn dog");
        for (Box box : boxy) {
            System.out.println(nr + "" + box);
            nr++;
        }
        System.out.println("/                  /");

        do {
            try {
                System.out.printf("Z którego boxa chcesz coś dodać lub zabrać:");
                wybur = Integer.parseInt(sc.nextLine());
                switch (wybur) {
                    case 1:

                        System.out.println("aby zabrać daj ujemną liczbe a dodać dodatnią");
                        ilosc = Integer.parseInt(sc.next());
                        boxy[wybur - 1].getzmiana(ilosc);
                        break;
                    case 2:
                        System.out.println("aby zabrać daj ujemną liczbe a dodać dodatnią");
                        ilosc = Integer.parseInt(sc.next());
                        boxy[wybur - 1].getzmiana(ilosc);
                        break;
                    case 3:
                        System.out.println("aby zabrać daj ujemną liczbe a dodać dodatnią");
                        ilosc = Integer.parseInt(sc.next());
                        boxy[wybur - 1].getzmiana(ilosc);
                        break;
                    default:
                        System.out.println("nieporawny box koniec programu");
                        wybur = 4;
                        break;
                }
                nr = 1;
                System.out.println();
                for (Box box : boxy) {
                    System.out.println(nr + "" + box);
                    nr++;
                }
            }catch (Exception e) {
                System.out.println("Niepoprawny dane");
                wybur = 4;
            }
            }while (wybur != 4) ;
        }
    }
