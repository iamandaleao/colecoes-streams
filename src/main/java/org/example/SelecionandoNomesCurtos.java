package org.example;
import java.util.List;
import java.util.stream.Collectors;

public class SelecionandoNomesCurtos {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Noé", "Bruno", "Carlos", "Amanda", "Elias", "Daniel", "Caroline");

        List<String> nomesCurtos = funcionarios.stream()
                .filter(nome -> nome.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(nomesCurtos);
    }
}