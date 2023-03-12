import java.util.Scanner;

public class Algoritmo499 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[5];
        int flag = 0, opcao;
        
        for (int i = 0; i < 5; i++) {
            num[i] = 0;
        }
        
        do {
            System.out.println("\n\n\n\tMENU VETOR - FUNÇÃO\n");
            System.out.println("1 - Dados do vetor");
            System.out.println("2 - Ordena vetor");
            System.out.println("3 - Imprime vetor");
            System.out.println("4 - Sai do programa");
            System.out.print("OPÇÃO: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    entrada(num);
                    flag = 1;
                    break;
                    
                case 2:
                    if (flag == 1) {
                        ordena(num);
                    } else {
                        System.out.println("\nEscolha primeiro a opção 1.");
                    }
                    break;
                    
                case 3:
                    if (flag == 1) {
                        imprime(num);
                    } else {
                        System.out.println("\nEscolha primeiro a opção 1.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\nSaindo do algoritmo");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
            
        } while (opcao != 4);
        
        teclado.close();
    }
    
    public static void entrada(int[] vet) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vet[i] = teclado.nextInt();
        }
    }
    
    public static void imprime(int[] vet) {
        System.out.println("\nVETOR");
        for (int i = 0; i < vet.length; i++) {
            System.out.println((i + 1) + " - " + vet[i]);
        }
    }
    
    public static void ordena(int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] > vet[j]) {
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        System.out.println("\nVetor ordenado");
    }
}
