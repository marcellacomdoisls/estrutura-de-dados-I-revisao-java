import java.util.Scanner;

public class Algoritmo494 {
    public static void main(String[] args) {
        int i, c;
        String[] nome = new String[3];
        String[] professor = new String[3];
        String[] endereco = new String[3];
        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            System.out.println("\nDigite nome: ");
            nome[i] = teclado.nextLine();
            System.out.println("\nDigite endereço: ");
            endereco[i] = teclado.nextLine();
            System.out.println("\nDigite profissão: ");
            professor[i] = teclado.nextLine();
        }

        for (i = 0; i < 2; i++) {
            for (c = i + 1; c < 3; c++) {
                if (nome[i].compareTo(nome[c]) > 0) {
                    troca(nome, i, c);
                    troca(endereco, i, c);
                    troca(professor, i, c);
                }
            }
        }

        for (i = 0; i < 3; i++) {
            System.out.println("\n" + nome[i] + "\n" + endereco[i] + "\n" + professor[i]);
        }
        teclado.close();
    }

    public static void troca(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
