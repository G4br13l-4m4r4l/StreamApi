package Consumer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Com {
    public static void main(String[] args) {
     List<Double> prices = Arrays.asList(20.00,131.33, 12.55, 13.99);
     Collections.sort(prices);
     prices.forEach(t ->{
        System.out.println(t);
     } );  
    }
}
