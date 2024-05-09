package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicato {
    public static void main(String[] args) {
        List<String> listaLinguagens = Arrays.asList("Java", "Python","C#", "Javascript","C", "Ruby", "Golang");

        Predicate<String> regraPred = word -> word.length() > 5;

        listaLinguagens.stream().filter(regraPred).forEach(System.out::println);
    }
}
