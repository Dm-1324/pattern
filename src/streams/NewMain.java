package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NewMain {
    public static void main(String[] args) {
//        int nums = 1234;
//        String s = String.valueOf(nums);
//
//        String s1 = Arrays.stream(s.split("")).reduce((a, b) -> String.valueOf(Integer.parseInt(a) + Integer.parseInt(b))).orElseThrow();
//        System.out.println(Integer.valueOf(s1));
//
//        Integer limit = Stream.iterate(1, x -> x + 1).limit(5).reduce((a, b) -> (a * b)).orElseThrow();
//        System.out.println(limit);
//
//        List<Integer> numList = new ArrayList<>();
//        int sum = 0;
//        while (nums > 0) {
//            int a = nums % 10;
//            numList.add(a);
//            sum += a;
//            nums = nums / 10;
//        }
//        Integer i = numList.stream().reduce(Integer::sum).orElseThrow();
//        System.out.println(i);
//        System.out.println();
//        System.out.println(numList);
//        System.out.println();
//        System.out.println(sum);


        List<Integer> list = Arrays.asList(2, 4, 8, 8, 6, 10, 10, 3);
        Integer i = list.stream()
                .distinct()
                .filter(x -> x < list.stream().max(Integer::compareTo).get())
                .max((a, b) -> a.compareTo(b)).orElseThrow();

        System.out.println(i);

        String sentence = "Hi this is java code for Streams API";

        Map<Long, List<String>> collect =
                Arrays.stream(sentence.toLowerCase().trim().split(""))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .collect(
                                Collectors.groupingBy(Map.Entry::getValue,
                                        Collectors.mapping(Map.Entry::getKey,
                                                Collectors.toList())));

        System.out.println(collect);

        List<String> words = List.of(
                "apple", "ant", "banana", "bat", "ball", "cat", "car"
        );

        Map<Character, Set<String>> collect1 = words.stream().collect(Collectors.groupingBy(x -> x.charAt(0),
                Collectors.mapping(x -> x.toUpperCase(),
                        Collectors.toSet()
                )));
        System.out.println(collect1);


        List<String> word = List.of(
                "apple", "ant", "ape",
                "banana", "bat", "ball",
                "cat", "car", "cow",
                "camel"
        );

        Map<Character, Set<Character>> collect2 = word.stream().filter(s -> s.length() >= 3)
                .collect(Collectors.groupingBy(x -> x.charAt(0),
                        Collectors.flatMapping(
                                s -> s.toUpperCase().chars()
                                        .mapToObj(c -> (char) c)
                                        .filter(c -> "AEIOU".indexOf(c) >= 0), Collectors.toSet())));

        System.out.println(collect2);

    }
}
