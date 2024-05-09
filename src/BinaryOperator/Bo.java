package BinaryOperator;
 
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Bo {
    public static void main(String[] args) {
        List<Integer> listaNumeros = Arrays.asList(12,32,14,1,44);

        BinaryOperator<Integer> regraNumeros = (n1,n2) -> n1+n2;

        System.out.println("Resultado: "+ listaNumeros.stream().reduce(0, regraNumeros));
    }
}
