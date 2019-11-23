import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner pierwszyOdczyt = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int liczbaPierwsza = pierwszyOdczyt.nextInt();


        Scanner odczytDrugi = new Scanner(System.in);
        System.out.print("Podaj druga liczbę wiekszą od pierwszej: ");
        int liczbaDruga = odczytDrugi.nextInt();


        while (liczbaPierwsza < liczbaDruga) {

            int suma = 0;
            for (int a = 0; liczbaPierwsza <= liczbaDruga; a++) {
                suma = suma + liczbaPierwsza;
                liczbaPierwsza++;
            }
            System.out.println(suma);
        }

    }
}
