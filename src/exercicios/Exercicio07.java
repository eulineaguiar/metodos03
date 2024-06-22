package exercicios;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Exercicio07 {
    public static String ObterDataAtual() {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return hoje.format(formatter);
    }

    public static void main(String[] args) {
        String dataAtual = ObterDataAtual();
        System.out.println("Data atual: " + dataAtual);
    }
}