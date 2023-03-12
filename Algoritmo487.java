import java.util.Scanner;

public class Algoritmo487 {
    public static void main(String[] args) {
        int i;
        int[] num = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            num[i] = teclado.nextInt();
        }

        inverte(num, 10);

        System.out.println("\nVETOR");

        for(i = 0; i < 10; i++){
            System.out.println((i + 1) + " - " + num[i]);
        }

        teclado.close();
    }

    public static void inverte(int[] vet, int max){
        int k = max - 1;
        int aux;

        for(int i = 0; i < max / 2; i++){
            aux = vet[i];
            vet[i] = vet[k];
            vet[k] = aux;
            k--;
        }
    }
}
