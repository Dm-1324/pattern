import java.util.HashMap;
import java.util.Map;

public class BrokenEqualsMapDemo {

    public static void main(String[] args) {

        Map<MyKey, Integer> map = new HashMap<>();

        map.put(new MyKey(1), 10);
        map.put(new MyKey(1), 20);
        map.put(new MyKey(1), 30);

        System.out.println("Map size: " + map.size());

        System.out.println("Get key: " + map.get(new MyKey(1)));
        System.out.println("Contains key: " + map.containsKey(new MyKey(1)));

        System.out.println("Map contents:");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println(map);
    }

    static class MyKey {
        int id;

        MyKey(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            return false; // BROKEN
        }

        @Override
        public int hashCode() {
            return 1; // same bucket
        }

        @Override
        public String toString() {
            return "MyKey{id=" + id + "}";
        }
    }
}
