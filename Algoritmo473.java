import java.util.Scanner;

public class Algoritmo473 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String consoante = teclado.next();
        int x = maiuscula(consoante);
        if(x == 1){
            System.out.println("É uma consoante.");
        } else {
            System.out.println("Não é consoante.");
        }
        teclado.close();
    }
    public static int maiuscula(String letra){
        if(letra.equals("A") || letra.equals("a") || letra.equals("E") || letra.equals("e") || letra.equals("I") || letra.equals("i") || letra.equals("O") || letra.equals("o") || letra.equals("U") || letra.equals("u")){
            return 0;
        } else {
            return 1;
        }
    }
}
