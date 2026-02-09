package sorting.prac;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problm {
    public static void main(String[] args) {
//        arr= [1,2,0,0,0,0,43,5,2,0,0,1]
        Problm p = new Problm();
        int[] arr = {1, 2, 0, 0, 0, 0, 43, 5, 2, 0, 0, 1};
        p.Shift(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        String sentence = "aaabbbbbbbbaabcccc";
        Stream<Map.Entry<String, Long>> sorted = Arrays.stream(sentence.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().sorted();
        System.out.println(sorted);
    }

    public void Shift(int[] arr) {
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZero];
                arr[nonZero] = arr[i];
                arr[i] = temp;
                nonZero++;
            }

        }
    }


    // aaaabbbccd -> b
//
//    select max(e.salary) as max_salary, d.name
//    from Employees e join Department d on
//        e.departmentId = d.id group by d.name;
}

