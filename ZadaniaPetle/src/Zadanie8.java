import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Podaj liczby: ");

        while (scanner.hasNextInt()) {
            int liczba = scanner.nextInt();
            if (liczba == 0) {
                break;
            }
            if (liczba > max) {
                max = liczba;

            }
            if (liczba < min) {
                min = liczba;

            }

        }
        System.out.println("min + max = " + (min+max));
        System.out.println("avg (min,max) =" +(min+max)/2);

    }
}


