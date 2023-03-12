import java.util.Scanner;

public class Algoritmo485 {
    public static void main(String[] args) {
        int[] num = new int[6];
        String[] num1 = new String[6];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            System.out.println("Digite número "+ (i + 1) + ": ");
            num[i] = teclado.nextInt();
        }

        for(int i = 0; i < 6; i++){
            System.out.println("Digite caractere "+ (i + 1) + ": ");
            num1[i] = teclado.next();
        }
        System.out.print("\n");
        multivetor(num, num1, 6);
        System.out.print("\n");

        teclado.close();
    }

    public static void multivetor(int[] vet1, String[] vet2, int tam){
        for(int i = 0; i < tam; i++){
            System.out.println();
            for(int w = 0; w < vet1[i]; w++){
                System.out.println(vet2[i]);
            }
        }
    }
}
