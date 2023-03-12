import java.util.Scanner;

public class Algoritmo490 {
    public static void main(String[] args) {
        String[] nome = new String[10];
        Scanner teclado = new Scanner(System.in);

        for (int L = 0; L < 10; L++) {
            System.out.print("Digite uma palavra em letras minúsculas " + (L+1) + ": ");
            nome[L] = teclado.next();
            restantes(nome, nome[L].length(), "c");
        }

        for (int L = 0; L < 10; L++) {
            System.out.println((L+1) + " - " + nome[L]);
        }
        teclado.close();
    }

    public static int restantes(String[] vet, int tam, String x) {
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            if (vet[i].equals(x)) {
                vet[i] = "u1";
                cont++;
            }
        }
        return cont;
    }
}
