import java.util.Scanner;

public class Algoritmo462 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a nota 1: ");
    double nota1 = teclado.nextDouble();
    
    System.out.println("Digite anota 2: ");
    double nota2 = teclado.nextDouble();
    
    System.out.println("Digite a nota 3: ");
    double nota3 = teclado.nextDouble();
    
    double media = mediaAritmetica(nota1, nota2, nota3);
    
    System.out.println("A média aritmética é: " + media);

    teclado.close();
    }
    
    public static double mediaAritmetica(double nota1, double nota2, double nota3) {
    double media = (nota1 + nota2 + nota3) / 3.0;
    return media;
    }
}
