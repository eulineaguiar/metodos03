package exercicios;

public class Exercicio10 {
    public static double CalcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double n1 = 7.5;
        double n2 = 8.0;
        double n3 = 9.5;
        double media = CalcularMedia(n1, n2, n3);
        System.out.println("Média dos números: " + media);
    }
}