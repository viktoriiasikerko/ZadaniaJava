import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Podaj ilość powtórzeń: ");
        int iloscPowtorzen = mojScanner.nextInt();

        for (int i = 0; i < iloscPowtorzen; i++) {
            System.out.println("Hello world");
        }
    }
}
