import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        int h, a;
        char star = '*';
        System.out.println("Podaj wysokość choinki: ");
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        for (int i = 0; i < h; i++) {
            for (a = 0; a < h * 2; a++) {
                if (a < (h - i) || a > (h + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }
}

