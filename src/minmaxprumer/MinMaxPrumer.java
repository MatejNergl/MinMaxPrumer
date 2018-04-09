package minmaxprumer;

import java.util.Scanner;

public class MinMaxPrumer {

    public static void main(String[] args) {
        // definice vstupu (z klávesnice)
        Scanner sc = new Scanner(System.in, "CP1250");
        // uložené min, max, průměr
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pocet = 1;
        int soucet = 0;
        // nekonečná smyčka
        while (true) {
            System.out.println("Vlož " + pocet + " . číslo: ");
            // vstup od uživatele (z klávesnice) do proměnné vstup
            int vstup = sc.nextInt();
            // když vložím nulu, přerušíme smyčku (program)
            if (vstup == 0) {
                break;
            }
            soucet = soucet + vstup;
            // když vložené číslo je menší, než min, zapisujeme ho 
            if (vstup < min) {
                min = vstup;
            }
            if (vstup > max) {
                max = vstup;
            }
            System.out.println("nejmenší zatím vložené: " + min);
            System.out.println("největší zatím vložené: " + max);
            System.out.println("Průměr všech zadaných čísel: " + ((float) soucet / pocet));
            pocet++;

        }
    }

}
