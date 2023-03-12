import java.util.Scanner;

public class Algoritmo480 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, x;
        System.out.println("Digite um número: ");
        numero = teclado.nextInt();
        x = reverso(numero);
        System.out.println(numero + " - " + x);

        if(x == numero){
            System.out.println("É um número capicua.");
        } else {
            System.out.println("Não é um número capicua.");
        }

        teclado.close();
    }

    public static int reverso(int num){
        int soma = 0, r;
        while (num != 0){
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
}
