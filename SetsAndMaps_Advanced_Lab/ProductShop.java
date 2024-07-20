package SetsAndMaps_Advanced_Lab;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        TreeMap<String, Map<String,Double>> store = new TreeMap<>();
        while (!command.equals("Revision")){
            String shop = command.split(", ")[0];
            String product = command.split(", ")[1];
            Double price = Double.parseDouble(command.split(", ")[2]);

            if (!store.containsKey(shop)){
                store.put(shop,new LinkedHashMap<>(){{
                    put(product,price);
                }});
            } else {
                Map<String,Double> map = store.get(shop);
                if (!map.containsKey(product)) {
                    map.put(product, price);
                    store.put(shop, map);
                } else {
                    map.put(product,price);
                    store.put(shop,map);
                }
            }





            command = scanner.nextLine();
        }
        store.keySet().forEach(shop-> {
            System.out.println(shop + "->");

            Map<String,Double> productList = store.get(shop);
            productList.entrySet().forEach(product-> System.out.println("Product: " + product.getKey() + ", " + "Price: " + product.getValue()));
        });
    }
}
