package BinaryOperator;

import java.util.Arrays;
import java.util.List;

public class Bo2 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,100);
        System.out.println("Total: "+listaNumeros.stream().reduce(0, Integer::sum));
    }
}
