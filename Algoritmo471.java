import java.util.Scanner;

public class Algoritmo471 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int dividendo, divisor, operacao;
        System.out.println("Digite o dividendo: ");
        dividendo = teclado.nextInt();
        System.out.println("Digite o divisor: ");
        divisor = teclado.nextInt();

        while(divisor > dividendo){
            System.out.println("INVÁLIDO. Digite um número menor que o dividendo: ");
            divisor = teclado.nextInt();
        }

        operacao = divisor(dividendo, divisor);

        if(operacao == 0){
            System.out.println("Nenhuma vez.");
        } else {
            System.out.println("Número de vezes: " + operacao);
        }

        teclado.close();
    }

    public static int divisor(int x, int y){
        int resto;
        int n1 = 0;
        resto = x % y;
        while(resto == 0){
            n1++;
            x = x / y;
            resto = x % y;
        }
        return n1;
    }
}
