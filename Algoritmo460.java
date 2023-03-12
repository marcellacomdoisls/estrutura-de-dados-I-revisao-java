import java.util.Scanner;

public class Algoritmo460 {
    public static void main(String[] args) {
        int numero;
        int i;
    
        Scanner teclado = new Scanner(System.in);
    
        for(i = 1; i <= 3; i++){
            System.out.println("Digite o número: ");
            numero = teclado.nextInt();
            System.out.println("Dobro: "+ dobro(numero));

            teclado.close();
        }
    
    }
    private static int dobro(int numero) {
        return (numero * 2);
    }

}
