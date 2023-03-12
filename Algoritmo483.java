import java.util.Scanner;

public class Algoritmo483 {
    public static void main(String[] args) {
        int produtoInterno;
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("\nDigite o " + (i+1) + "º número para o vetor 1: ");
            vetor1[i] = teclado.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("\nDigite o " + (i+1) + "º número para o vetor 2: ");
            vetor2[i] = teclado.nextInt();
        }

        produtoInterno = produtoInterno(vetor1, vetor2, 4);
        System.out.print("\nVETOR A\tVETOR B\n");

        for (int i = 0; i < 4; i++) {
            System.out.println(vetor1[i] + "\t" + vetor2[i]);
        }

        System.out.print("\nProduto interno: " + produtoInterno + "\n");

        teclado.close();
    }

    public static int produtoInterno(int[] vetor1, int[] vetor2, int quant) {
        int produto = 0;

        for (int i = 0; i < quant; i++) {
            produto += (vetor1[i] * vetor2[i]);
        }

        return produto;
    }
}
