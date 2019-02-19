package effectivejava.methodreference;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Integer> prices = new HashMap<>();
        prices.put(1, 123);
        prices.put(2, 1);
        prices.put(3, 1000);
        prices.put(4, 234);

        for (Integer key : prices.keySet()) {
            prices.merge(key, 3, Integer::sum);
        }

        System.out.println(prices);
    }
}
