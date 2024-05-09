package Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Sup1 {
    public static void main(String[] args) {
        Supplier<String> saudation = ()-> "Hello there, general Kenobi!";

        List<String> listSaudation = Stream.generate(saudation).limit(10).toList();

        listSaudation.forEach(System.out::println);
    }    
}
