import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 1);
        map.put("Key2", 6);
        map.put("Key3", 7);

        Service<String, Integer> service = new Service<>();
//        service.afisare(map, (k, v) -> System.out.println("Key: " + k + " Value: " + v));


        Map<String, String> map2 = new HashMap<>();
        map2.put("Key1", "Andrei");
        map2.put("a", "Vlad");
        map2.put("Key3", "Ion");

        Service<String, String> service2 = new Service<>();
        Map<String, String> filteredMap =  service2.filter(map2, (k, v) -> k.contains("e") || v.contains("e"));
        service2.afisare(filteredMap, (k, v) -> System.out.println("Key: " + k + " Value: " + v));


    }
}