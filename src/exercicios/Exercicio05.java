package exercicios;

public class Exercicio05 {
    public static int MaiorNumero(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int maior = MaiorNumero(15, 7);
        System.out.println("Maior número: " + maior);
    }
}