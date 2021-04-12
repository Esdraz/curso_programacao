package outros;

import java.util.Scanner;

public class mostrarImpares {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        for (int i = 1; i <= X; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
