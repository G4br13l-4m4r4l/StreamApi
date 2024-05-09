package Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);

        Consumer<Integer> mostrarPar = num -> {
            if(num%2==0){
                System.out.println(num);
            }
        };

        listaNumeros.forEach(mostrarPar);
    }
}
