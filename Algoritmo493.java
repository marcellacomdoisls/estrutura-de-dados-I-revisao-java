import java.util.Scanner;

public class Algoritmo493 {
    public static void main(String[] args) {
        int L, c, num[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (L = 0; L < 10; L++) {
            System.out.print("Digite um número " + (L+1) + ": ");
            num[L] = teclado.nextInt();
        }

        c = verificaOrdem(num, 10);

        if (c == 1) {
            System.out.println("\nORDENAÇÃO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENAÇÃO DECRESCENTE");
        } else {
            System.out.println("\nNÃO ESTÁ ORDENADO");
        }

        teclado.close();
    }

    public static int busca(int[] vet, int tam) {
        int i, x;
        for (i = 0; i < tam - 1; i++) {
            if (vet[i] < vet[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }

    public static int buscaL(int[] vet, int tam) {
        int i, x;
        for (i = 0; i < tam - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }

    public static int verificaOrdem(int[] vetor, int t) {
        int r, res;
        r = busca(vetor, t);
        if (r == 1) {
            res = 2;
            return res;
        } else {
            r = buscaL(vetor, t);
            if (r == 1) {
                res = 1;
                return res;
            } else {
                res = 0;
                return res;
            }
        }
    }
}
