package Iunie2024_1;

import Iunie2024_1.Carte;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibrarieMain {
    public static void main(String[] args) {

        List<Carte> carti = Arrays.asList(
                new Carte("Java Avansat", "Ion Popescu", "CLB", 15, 75.5),
                new Carte("Bazele Programării", "Ana Ionescu", "Polirom", 5, 45.0),
                new Carte("Algoritmi", "Mihai Georgescu", "CLB", 20, 55.0),
                new Carte("Design Patterns", "Cristina Tudor", "Humanitas", 8, 120.0),
                new Carte("POO în Java", "Ana Ionescu", "CLB", 30, 95.0)
        );

        // 1. Afișați cărțile din care există cel puțin 10 exemplare, în ordinea alfabetică a autorilor
        System.out.println("Cărți cu cel puțin 10 exemplare (ordonate alfabetic după autor):");
        carti.stream()
                .filter(c -> c.getNrExemplare() >= 10)
                .sorted(Comparator.comparing(Carte::getAutor))
                .forEach(System.out::println);

        System.out.println("\n");

        // 2. Afișați editurile distincte
        System.out.println("Edituri distincte:");
        carti.stream()
                .map(Carte::getEditura)
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n");

        // 3. Cărți de la editura CLB cu preț între 50 și 100 RON
        System.out.println("Cărți de la editura CLB cu preț între 50 și 100 RON:");
        List<Carte> clbCarti = carti.stream()
                .filter(c -> c.getEditura().equalsIgnoreCase("CLB"))
                .filter(c -> c.getPret() >= 50 && c.getPret() <= 100)
                .collect(Collectors.toList());
        clbCarti.forEach(System.out::println);

        System.out.println("\n");

        // 4. Pentru fiecare editură, afișați cărțile publicate
        System.out.println("Cărți publicate pe fiecare editură:");
        Map<String, List<Carte>> cartiPeEditura = carti.stream()
                .collect(Collectors.groupingBy(Carte::getEditura));

        cartiPeEditura.forEach((editura, listaCarti) -> {
            System.out.println("Editura: " + editura);
            listaCarti.forEach(System.out::println);
            System.out.println();
        });
    }
}
