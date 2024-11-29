#include <iostream>

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    int main() {
        printf("podaj swoje imie");
        char name [50];
        scanf("%s", name);
        printf("podaj ocene z przedmiotu 1: ");
        int a ;
        scanf("%d",&a);
        printf("podaj ocene z przedmiotu 2: ");
        int b ;
        scanf("%d",&b);
        printf("podaj ocene z przedmiotu 3: ");
        int c ;
        scanf("%d",&c);
        printf("podaj srednia temperature dnia");
        double temp;
        scanf("%lf",&temp);
        double wynik = (a + b + c) / 3;
        if (wynik >= 4) {
            printf("Srednia oceny wynosi: %f", wynik);
            printf("\n Gratulacje : %s zdales", name);
            printf("\nSrednia temperatura dnia wynosi : %f", temp);
        }else {
            printf("niestety nie zdales");
        }
        return 0;
    }
// TIP See CLion help at <a
// href="https://www.jetbrains.com/help/clion/">jetbrains.com/help/clion/</a>.
//  Also, you can try interactive lessons for CLion by selecting
//  'Help | Learn IDE Features' from the main menu.