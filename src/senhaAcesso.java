import java.util.Scanner;

public class senhaAcesso {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
