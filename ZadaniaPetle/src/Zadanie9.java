import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        int zgadywanaLiczba = (int) (Math.random() * 100);

        boolean szukana = false;
        System.out.println("Podaj liczbę: ");

        while (!szukana) {
            Scanner scanner = new Scanner(System.in);
            int liczbaUzytkownika = scanner.nextInt();
            if (liczbaUzytkownika < zgadywanaLiczba) {
                System.out.println("Podałeś za małą wartość.");
            } else if (liczbaUzytkownika > zgadywanaLiczba) {
                System.out.println("Podałeś za dużą wartość.");
            } else if (liczbaUzytkownika == zgadywanaLiczba) {
                System.out.println("Gratulacje!");
                szukana = true;
            }
        }
    }
}

