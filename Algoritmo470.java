import java.util.Scanner;

public class Algoritmo470 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, primo;

        System.out.println("\n Digite um número maior que 0: ");
        numero = teclado.nextInt();

        primo = primo(numero);

        if(primo == 0){
            System.out.println("É primo: " + numero);
        } else {
            System.out.println("Não é primo " + numero);
        }

        teclado.close();

    }

    public static int primo(int n) {
        int c = 0, p = 2;
        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }
        return c;
    }
}
