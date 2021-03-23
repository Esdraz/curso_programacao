import java.util.Scanner;

public class lerCoordenadas {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite Coordenada X: ");
        double x = sc.nextDouble();
        System.out.print("Digite Coordenada Y: ");
        double y = sc.nextDouble();

        while (x != 0 && y != 0) {


            if (x >= 0 && y >= 0) {
                System.out.println("primeiro");

            }
            if (x <= 0 && y >= 0) {
                System.out.println("segundo");

            }
            if (x <= 0 && y <= 0) {
                System.out.println("terceiro");

            } else {
                System.out.println("quarto");

            }

        }
        sc.close();
    }
}
