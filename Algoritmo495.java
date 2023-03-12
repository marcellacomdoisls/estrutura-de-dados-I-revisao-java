import java.util.Scanner;

public class Algoritmo495 {
    public static void main(String[] args) {
        String[][] nome = new String[5][20];
        Scanner teclado = new Scanner(System.in);

        for (int j = 0; j < 5; j++) {
            System.out.print("Digite nome " + (j+1) + ": ");
            nome[j] = teclado.nextLine().split(" ");
        }

        ordena(nome, 5);

        System.out.println("\n\nNOMES ORDENADOS\n");
        for (int j = 0; j < 5; j++) {
            System.out.print((j+1) + " - ");
            for (int i = 0; i < nome[j].length; i++) {
                System.out.print(nome[j][i] + " ");
            }
            System.out.println();
        }
        teclado.close();
    }

    public static void ordena(String[][] vet, int tam) {
        String aux;
        for (int Li = 0; Li < tam - 1; Li++) {
            for (int ci = Li + 1; ci < tam; ci++) {
                if (vet[Li][0].compareTo(vet[ci][0]) > 0) {
                    for (int i = 0; i < vet[Li].length; i++) {
                        aux = vet[Li][i];
                        vet[Li][i] = vet[ci][i];
                        vet[ci][i] = aux;
                    }
                }
            }
        }
    }
}
