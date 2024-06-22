package exercicios;

public class Exercicio08 {
    public static long CalcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        long fatorial = CalcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }
}