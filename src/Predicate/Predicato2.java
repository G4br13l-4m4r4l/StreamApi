package Predicate;

import java.util.Arrays;
import java.util.List;

public class Predicato2 {
    public static void main(String[] args) {
        List<String> listaPalavras = Arrays.asList("first","second","third", "fourth","quinto");

        listaPalavras.stream().filter(p->p.length() <= 5).forEach(System.out::println);
    }
}
