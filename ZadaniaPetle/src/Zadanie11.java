import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
       for (int i = 1; i<liczba; i++){
           if (liczba % i ==0){
               System.out.print(i + ", ");
           }
       }

    }
}
