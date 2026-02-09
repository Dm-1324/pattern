package streams.gptQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
//        List<String> input = List.of("java", "stream", "api");
//        input.stream().forEach(s -> System.out.println(s));

//        String[] input = {"java", "stream", "java", "api"};
//        Set<String> stringSet = Arrays.stream(input).collect(Collectors.toSet());
//        System.out.println(stringSet);

//        String input = "abc";
//        int[] array = Arrays.stream(input.chars().toArray()).toArray();
//        System.out.println(Arrays.toString(array));

//        List<String> input = List.of("apple", "ant", "ball", "ape");
//        long count = input.stream().filter(s -> s.startsWith("a")).count();
//        System.out.println(count);

//        List<String> input = List.of("", " ", "", "java", "stream");
//        Optional<String> first = input.stream().filter(s -> s.equals(" ")).findFirst();
//        System.out.println(first.get());

//        List<String> input = List.of("java", "stream", "api", "code");
//        List<String> strings = input.stream().filter(s -> s.length() > 3).map(s -> s.toUpperCase()).toList();
//        System.out.println(strings);

//        List<String> input = List.of("java", "is", "powerful");
//        List<Integer> list = input.stream().map(s -> s.length()).toList();
//        System.out.println(list);

//        List<String> input = List.of("madam", "java", "level", "stream");
//        List<String> strings = input.stream().filter(s -> s.contentEquals(new StringBuilder(s).reverse())).toList();
//        System.out.println(strings);

//        List<String> input = List.of("short", "medium", "verylongword");
//        List<String> peek = input.stream().filter(s -> s.length() > 5).peek(s -> System.out.println(s)).toList();

//        List<String> input = List.of("java", "stream");
//        List<String> strings = input.stream().map(s -> s.toLowerCase().replaceAll("[aeiou]", "*")).toList();
//        System.out.println(strings);

//        List<List<String>> input = List.of(
//                List.of("a", "b"),
//                List.of("c", "d")
//        );
//        List<String> strings = input.stream().flatMap(x -> x.stream()).toList();
//        System.out.println(strings);

//        List<String> input = List.of(
//                "java streams are powerful",
//                "streams make java powerful"
//        );
//        Set<String> stringSet = input.stream().flatMap(s -> Arrays.stream(s.trim().split(" "))).collect(Collectors.toSet());
//        System.out.println(stringSet);

//        List<String> input = List.of("abc", "bcd");
//        Set<String> stringSet = input.stream().flatMap(s -> Arrays.stream(s.split(""))).collect(Collectors.toSet());
//        System.out.println(stringSet);

//        List<String> input = List.of("a,b,c", "b,c,d");
//        Set<String> stringSet = input.stream().flatMap(s -> Arrays.stream(s.split(","))).collect(Collectors.toSet());
//        System.out.println(stringSet);

//        List<String> input = List.of("apple", "banana", "cat");
//        Set<String> stringSet =
//                input.stream().flatMap(s -> Arrays.stream(s.split("")).filter(c -> "aeiou".contains(c.toLowerCase()))).collect(Collectors.toSet());
//        System.out.println(stringSet);

//        List<String> input = List.of("java", "is", "fun", "streams");
//        Map<Integer, List<String>> listMap = input.stream().collect(Collectors.groupingBy(x -> x.length()));
//        System.out.println(listMap);

//        List<String> input = List.of("apple", "ant", "ball", "bat");
//        Map<Character, List<String>> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
//        System.out.println(collect);

//        List<String> input = List.of("a", "bb", "cc", "ddd");
//        Map<Integer, Long> collect = input.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));
//        System.out.println(collect);

//        List<String> input = List.of("cat", "car", "cat", "cow");
//        Map<Character, Set<String>> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.toSet()));
//        System.out.println(collect);

//        List<String> input = List.of("apple", "ant", "banana", "bat");
//        Map<Character, String> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0),
//                Collectors.collectingAndThen(Collectors.toList(),
//                        list -> list.stream()
//                                .max((a, b) -> a.length() - b.length()).orElseThrow())));
//        System.out.println(collect);

//        List<String> input = List.of("apple", "ant", "banana", "bat");
//        Map<Character, List<Integer>> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0),
//                Collectors.collectingAndThen(Collectors.toList(),
//                        lst -> lst.stream().map(s -> s.length()).toList())));
//        System.out.println(collect);

//        List<String> input = List.of("java", "code", "stream", "api");
//        Map<Integer, List<String>> listMap = input.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.collectingAndThen(Collectors.toList(),
//                list -> list.stream().map(x -> x.toUpperCase()).toList())));
//        System.out.println(listMap);

//        List<String> input = List.of("apple", "ant", "ball", "bat");
//        Map<Character, Set<String>> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0),
//                Collectors.collectingAndThen(Collectors.toList(),
//                        list -> list.stream()
//                                .flatMap(s -> Arrays.stream(s.split("")))
//                                .filter(s -> "aeiou".indexOf(s) >= 0)
//                                .collect(Collectors.toSet()))));
//        System.out.println(collect);

//        Map<Integer, List<Character>> collect = input.stream().collect(Collectors.groupingBy(x -> x.length(),
//                Collectors.collectingAndThen(Collectors.toList()
//                        , list -> list.stream().map(x -> x.charAt(0)).toList())));
//
//        System.out.println(collect);
//        input.stream().collect(Collectors.groupingBy(String::length,
//                Collectors.mapping(s -> s.charAt(0), Collectors.toList()))).forEach((k, v) -> System.out.println(k + " -> " + v));
//        Map<Integer, List<Character>> collect1 = input.stream().collect(Collectors.groupingBy(String::length,
//                Collectors.mapping(s -> s.charAt(0), Collectors.toList())));
//
//        System.out.println(collect1);

//        List<String> input = List.of("apple", "ape", "ant");
//        Map<Character, TreeSet<Character>> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0),
//                Collectors.collectingAndThen(Collectors.toList(),
//                        list -> list.stream().flatMap(x -> x.chars().mapToObj(c -> (char) c)).collect(Collectors.toCollection(TreeSet::new)))));
//
//        System.out.println(collect);

//        List<String> input = List.of("cat", "car", "cart", "cow");
//        Map<Character, Long> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0),
//                Collectors.collectingAndThen(Collectors.toList()
//                        , list -> list.stream().map(x -> x.length()).distinct().count())));
//        System.out.println(collect);

//        List<String> input = List.of("java", "streams", "powerful");
//        String s = input.stream().max((s1, s2) -> s1.length() - s2.length()).orElseThrow();
//        System.out.println(s);

//        List<String> input = List.of("java", "api");
//        Integer i = input.stream().map(s -> s.length()).reduce((s1, s2) -> s1 + s2).orElseThrow();
//        System.out.println(i);

//        List<String> input = List.of("java", "stream", "api");
//        Double collect = input.stream().collect(Collectors.averagingDouble(x -> x.length()));
//        System.out.println(collect);

//        List<String> input = List.of("java", "education", "stream");
//        String s1 = input.stream()
//                .max(
//                        Comparator.comparingInt(s -> (int) s.chars().mapToObj(c -> (char) c).filter(c ->
//                                "AEIOUaeiou".indexOf(c) >= 0).count())
//                )
//                .orElseThrow();
//        System.out.println(s1);

//        List<String> input = List.of("abc", "bcd", "cde");
//        Long distinct = input.stream().flatMap(x -> Arrays.stream(x.split(""))).distinct().count();
//        System.out.println(distinct);

//        List<String> input = List.of("java", "stream", "api");
//        boolean b = input.stream().anyMatch(x -> x.startsWith("z"));
//        System.out.println(b);

//        List<String> input = List.of("java", "stream", "Api");
//        boolean b = input.stream().allMatch(s -> s.toLowerCase().equals(s));
//        System.out.println(b);

//        List<String> input = List.of("java", " ", "stream");
//        boolean b = input.stream().anyMatch(s -> s.trim().isEmpty());
//        System.out.println(b);

//        List<String> input = List.of("java", "streams", "powerful");
//        String s1 = input.stream().filter(s -> s.length() > 7).findFirst().orElseThrow();
//        System.out.println(s1);

//        List<String> input = List.of("hello", "java streams");
//        boolean b = input.stream().anyMatch(s -> s.contains("java"));
//        System.out.println(b);

//        List<String> input = List.of("java", "is", "powerful");
//        List<String> strings = input.stream().sorted((s1, s2) -> s1.length() - s2.length()).toList();
//        System.out.println(strings);

//        List<String> input = List.of("bat", "apple", "ant", "bapple", "aaaaa");
//        List<String> strings =
//                input.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).toList();
//        System.out.println(strings);

//        List<String> input = List.of("java", "api", "stream");
//        List<String> strings = input.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(strings);

//        List<String> input = List.of("java", "education", "stream");
//        List<String> strings =
//                input.stream().sorted(Comparator.comparing(s -> s.chars().mapToObj(c -> (char) c).filter(s1 ->
//                        "AEIOUaeiou".indexOf(s1) >= 0).count())).toList();
//
//        System.out.println(strings);

//        List<String> input = List.of("a", "bb", "ccc", "dddd", "eeeee");
//        List<String> strings = input.stream().sorted((s1, s2) -> s2.length() - s1.length()).limit(3).toList();
//        System.out.println(strings);

//        List<String> input = List.of("apple", "ant", "ball", "bat");
//        Map<Character, List<String>> listMap = input.stream().collect(Collectors.groupingBy(s -> s.charAt(0),
//                Collectors.collectingAndThen(Collectors.toList(),
//                        list -> list.stream().flatMap(x -> Arrays.stream(x.split(""))).filter(x1 -> !"AEIOUaeiou".contains(x1)).distinct().toList())));
//        System.out.println(listMap);

//        List<String> input = List.of("apple", "banana");
//        String s = input.stream().flatMap(x -> Arrays.stream(x.split("")))
//                .collect(Collectors.groupingBy(x -> x,
//                        Collectors.counting()))
//                .entrySet()
//                .stream()
//                .sorted
//                        (
//                                (e1, e2) -> Math.toIntExact(e2.getValue() - e1.getValue())
//                        )
//                .map(x -> x.getKey()).findFirst().orElseThrow();
//        System.out.println(s);

//        List<String> input = List.of("cat", "car", "dog");
//        Map<Character, String> collect = input.stream().collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.collectingAndThen(Collectors.toList()
//                ,
//                list -> list.stream().flatMap(x -> Arrays.stream(x.split(" "))).collect(Collectors.joining(",")))));
//
//        System.out.println(collect);

//        List<String> input = List.of("ab", "bc");
//        Map<String, Long> longMap = input.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.groupingBy(x -> x,
//                Collectors.counting()));
//        System.out.println(longMap);

        List<String> input = List.of("apple", "ant", "ball", "bat");
        Map<Character, Double> collect = input.stream().collect(Collectors.groupingBy(c -> c.charAt(0),
                Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream()
                                .flatMap(s -> Arrays.stream(s.split(""))
                                        .filter("AEIOUaeiou"::contains))
                                .map(x -> (double) x.length() / list.size())
                                .reduce(Double::sum).orElseThrow()
                )
        ));

        System.out.println(collect);

        Map<Character, Double> collect1 = input.stream()
                .collect(Collectors.groupingBy(c -> c.charAt(0),
                        Collectors.averagingDouble
                                (
                                        s -> s.chars().mapToObj(c -> (char) c).filter(c -> "AEIOUaeiou".indexOf(c) >= 0).count()
                                )
                ));

        System.out.println(collect1);

    }
}
