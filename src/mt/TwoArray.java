package mt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        Boolean isSame = false;
        Map<Integer, String> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            map.put(i, "add");
            System.out.println(set.add(i));
        }

        for (int i : arr2) {
            isSame = map.containsKey(i);
            System.out.println(set.add(i));
        }
        System.out.println(isSame);
        System.out.println(arr1.length == set.size());


    }
}
