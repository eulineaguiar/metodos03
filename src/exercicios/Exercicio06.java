package exercicios;

public class Exercicio06 {
    public static boolean EhPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 17;
        if (EhPar(num)) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }
}