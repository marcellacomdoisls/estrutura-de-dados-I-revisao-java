import java.util.Scanner;

public class Algoritmo497 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int n, c;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        System.out.print("Digite o número para buscar: ");
        n = scanner.nextInt();

        ordena(num);

        c = busca(num, n);

        System.out.println("\nVETOR");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " - " + num[i]);
        }

        if (c != -1) {
            System.out.println("\nPosição no vetor: " + (c + 1));
        } else {
            System.out.println("\nNão encontrado.");
        }
    }

    public static int busca(int[] vet, int chave) {
        int ini = 0, fim = vet.length - 1, meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1;
    }

    public static void ordena(int[] vet) {
        int aux;
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }

}
