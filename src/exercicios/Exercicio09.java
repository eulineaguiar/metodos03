package exercicios;

public class Exercicio09 {
    public static String ConcatenarStrings(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String[] args) {
        String str1 = "Ol�, ";
        String str2 = "Mundo!";
        String resultado = ConcatenarStrings(str1, str2);
        System.out.println("Resultado da concatena��o: " + resultado);
    }
}