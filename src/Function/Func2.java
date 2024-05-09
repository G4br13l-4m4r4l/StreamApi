package Function;

import java.util.Arrays;
import java.util.List;

public class Func2 {
    public static void main(String[] args) {
        List<Integer> listaUm = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> segundaLista = listaUm.stream().map(l->l*3).toList();

        segundaLista.forEach(System.out::println);
    }
}
