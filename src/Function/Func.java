package Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Func {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,25);
        Function<Integer, Integer> multiplicarDois = n-> n*2;

        List<Integer> numMultiplicadosDois = listaNumeros.stream().map(multiplicarDois).toList();

        numMultiplicadosDois.forEach(System.out::println);
    }
    
}
