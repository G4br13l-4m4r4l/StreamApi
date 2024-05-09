package Supplier;

import java.util.List;
import java.util.stream.Stream;

public class Sup2 {

    public static void main(String[] args) {
        List<Integer> listaInteiros = Stream.generate(()->11).limit(10).toList();
        listaInteiros.forEach(System.out::println);
    }
}
