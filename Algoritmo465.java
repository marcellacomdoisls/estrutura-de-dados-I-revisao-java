import java.util.Scanner;

public class Algoritmo465 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite o número 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite o número 2: ");
        numero2 = teclado.nextInt();

        verifica(numero1, numero2);

        teclado.close();
    }

    public static void verifica(int num1, int num2) {
        if(num1 < num2){
            System.out.println("\n"+ num2);
        }else{
            System.out.println("\n" + num1);

        }

    }

}
