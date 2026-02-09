package streams.gptQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsQuestions {

    public static void main(String[] args) {
        // You can call each question method individually for testing:
        question1_printAll();
        question2_collectToSet();
        question3_stringToIntStream();
        question4_countWordsStartingWithA();
        question5_firstNonEmptyString();
        question6_uppercaseFilter();
        question7_wordLengths();
        question8_palindromes();
        question9_peekExample();
        question10_replaceVowels();
        question11_flattenLists();
        question12_uniqueWordsFromSentences();
        question13_uniqueCharacters();
        question14_csvFlattening();
        question15_uniqueVowels();
        question16_groupByLength();
        question17_groupByFirstChar();
        question18_groupByLengthCount();
        question19_groupByFirstCharSet();
        question20_longestWordPerGroup();
        question21_lengthsPerGroup();
        question22_uppercasePerLength();
        question23_vowelsPerGroup();
        question24_sortedCharactersPerGroup();
        question25_distinctLengthCount();
        question26_longestWord();
        question27_totalCharacterCount();
        question28_averageLength();
        question29_mostVowels();
        question30_distinctCharactersCount();
        question31_anyStartsWithZ();
        question32_allLowerCase();
        question33_noneEmpty();
        question34_firstLongerThan7();
        question35_anyContainingJava();
        question36_sortByLength();
        question37_lengthThenAlphabet();
        question38_reverseAlphabet();
        question39_sortByVowelCount();
        question40_top3Longest();
        question41_uniqueConsonantsPerGroup();
        question42_mostFrequentCharacter();
        question43_commaSeparatedPerGroup();
        question44_characterFrequency();
        question45_avgVowelsPerGroup();
    }

    // =================== 1. Stream Basics ===================
    // Question.md 1: Print all elements
    public static void question1_printAll() {
        List<String> input = List.of("java", "stream", "api");
        // Expected Output:
        // java
        // stream
        // api
        input.stream().forEach(System.out::println);
    }

    // Question.md 2: Collect to Set
    public static void question2_collectToSet() {
        String[] input = {"java", "stream", "java", "api"};
        // Expected Output: [java, stream, api]
        Set<String> stringSet = Arrays.stream(input).collect(Collectors.toSet());
        System.out.println(stringSet);
    }

    // Question.md 3: String to IntStream
    public static void question3_stringToIntStream() {
        String input = "abc";
        // Expected Output: [97, 98, 99]
        int[] array = input.chars().toArray();
        System.out.println(Arrays.toString(array));
    }

    // Question.md 4: Count words starting with 'a'
    public static void question4_countWordsStartingWithA() {
        List<String> input = List.of("apple", "ant", "ball", "ape");
        // Expected Output: 3
        long count = input.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(count);
    }

    // Question.md 5: First non-empty string that is exactly a space
    public static void question5_firstNonEmptyString() {
        List<String> input = List.of("", " ", "", "java", "stream");
        // Expected Output: " "
        Optional<String> first = input.stream().filter(s -> s.equals(" ")).findFirst();
        System.out.println(first.orElse(""));
    }

    // =================== 2. Map & Filter ===================
    // Question.md 6: Uppercase + filter length > 3
    public static void question6_uppercaseFilter() {
        List<String> input = List.of("java", "stream", "api", "code");
        // Expected Output: [JAVA, STREAM, CODE]
        List<String> result = input.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // Question.md 7: Word lengths
    public static void question7_wordLengths() {
        List<String> input = List.of("java", "is", "powerful");
        // Expected Output: [4, 2, 8]
        List<Integer> lengths = input.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);
    }

    // Question.md 8: Palindromes
    public static void question8_palindromes() {
        List<String> input = List.of("madam", "java", "level", "stream");
        // Expected Output: [madam, level]
        List<String> palindromes = input.stream()
                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(palindromes);
    }

    // Question.md 9: peek example
    public static void question9_peekExample() {
        List<String> input = List.of("short", "medium", "verylongword");
        // Expected Output: prints medium, verylongword
        List<String> result = input.stream()
                .filter(s -> s.length() > 5)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    // Question.md 10: Replace vowels with '*'
    public static void question10_replaceVowels() {
        List<String> input = List.of("java", "stream");
        // Expected Output: [j*v*, str**m]
        List<String> result = input.stream()
                .map(s -> s.replaceAll("(?i)[aeiou]", "*"))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // =================== 3. flatMap & Flattening ===================
    // Question.md 11: Flatten lists
    public static void question11_flattenLists() {
        List<List<String>> input = List.of(
                List.of("a", "b"),
                List.of("c", "d")
        );
        // Expected Output: [a, b, c, d]
        List<String> result = input.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // Question.md 12: Unique words from sentences
    public static void question12_uniqueWordsFromSentences() {
        List<String> input = List.of(
                "java streams are powerful",
                "streams make java powerful"
        );
        // Expected Output: [java, streams, are, powerful, make]
        Set<String> result = input.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    // Question.md 13: Unique characters
    public static void question13_uniqueCharacters() {
        List<String> input = List.of("abc", "bcd");
        // Expected Output: [a, b, c, d]
        Set<String> result = input.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    // Question.md 14: CSV flattening
    public static void question14_csvFlattening() {
        List<String> input = List.of("a,b,c", "b,c,d");
        // Expected Output: [a, b, c, d]
        Set<String> result = input.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    // Question.md 15: Unique vowels
    public static void question15_uniqueVowels() {
        List<String> input = List.of("apple", "banana", "cat");
        // Expected Output: [a, e]
        Set<String> result = input.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .filter(c -> "aeiou".contains(c.toLowerCase()))
                .collect(Collectors.toSet());
        System.out.println(result);
    }

    // =================== 4. Grouping ===================
    // Question.md 16: Group by length
    public static void question16_groupByLength() {
        List<String> input = List.of("java", "is", "fun", "streams");
        // Expected Output: {2=[is], 3=[fun], 4=[java], 7=[streams]}
        Map<Integer, List<String>> result = input.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }

    // Question.md 17: Group by first character
    public static void question17_groupByFirstChar() {
        List<String> input = List.of("apple", "ant", "ball", "bat");
        // Expected Output: {a=[apple, ant], b=[ball, bat]}
        Map<Character, List<String>> result = input.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(result);
    }

    // Question.md 18: Group by length + count
    public static void question18_groupByLengthCount() {
        List<String> input = List.of("a", "bb", "cc", "ddd");
        // Expected Output: {1=1, 2=2, 3=1}
        Map<Integer, Long> result = input.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(result);
    }

    // Question.md 19: Group by first char + Set
    public static void question19_groupByFirstCharSet() {
        List<String> input = List.of("cat", "car", "cat", "cow");
        // Expected Output: {c=[cat, car, cow]}
        Map<Character, Set<String>> result = input.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.toSet()));
        System.out.println(result);
    }

    // Question.md 20: Longest word per group
    public static void question20_longestWordPerGroup() {
        List<String> input = List.of("apple", "ant", "banana", "bat");
        // Expected Output: {a=apple, b=banana}
        Map<Character, String> result = input.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream().max(Comparator.comparingInt(String::length)).orElseThrow())
                ));
        System.out.println(result);
    }

    // =================== 5. Mapping within Group ===================
    // Question.md 21: Lengths per group
    public static void question21_lengthsPerGroup() {
        List<String> input = List.of("apple", "ant", "banana", "bat");
        // Expected Output: {a=[5, 3], b=[6, 3]}
        Map<Character, List<Integer>> result = input.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream().map(String::length).collect(Collectors.toList()))
                ));
        System.out.println(result);
    }

    // Question.md 22: Uppercase per length
    public static void question22_uppercasePerLength() {
        List<String> input = List.of("java", "code", "stream", "api");
        // Expected Output: {3=[API], 4=[JAVA, CODE], 6=[STREAM]}
        Map<Integer, List<String>> result = input.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream().map(String::toUpperCase).collect(Collectors.toList()))
                ));
        System.out.println(result);
    }

    // Question.md 23: Vowels per group
    public static void question23_vowelsPerGroup() {
        List<String> input = List.of("apple", "ant", "ball", "bat");
        // Expected Output: {a=[a, e], b=[a]}
        Map<Character, Set<String>> result = input.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .flatMap(str -> Arrays.stream(str.split("")))
                                        .filter(c -> "aeiou".indexOf(c.toLowerCase()) >= 0)
                                        .collect(Collectors.toSet())
                        )
                ));
        System.out.println(result);
    }

    // Question.md 24: Sorted characters per group
    public static void question24_sortedCharactersPerGroup() {
        List<String> input = List.of("apple", "ape", "ant");
        // Expected Output: {a=[a, e, l, n, p, t]}
        Map<Character, TreeSet<Character>> result = input.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                                        .collect(Collectors.toCollection(TreeSet::new))
                        )
                ));
        System.out.println(result);
    }

    // Question.md 25: Distinct length count per group
    public static void question25_distinctLengthCount() {
        List<String> input = List.of("cat", "car", "cart", "cow");
        // Expected Output: {c=2}
        Map<Character, Long> result = input.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .map(String::length)
                                        .distinct()
                                        .count()
                        )
                ));
        System.out.println(result);
    }

    // =================== 6. Reduction & Numeric ===================
    // Question.md 26: Longest word
    public static void question26_longestWord() {
        List<String> input = List.of("java", "streams", "powerful");
        // Expected Output: powerful
        String result = input.stream()
                .max(Comparator.comparingInt(String::length))
                .orElseThrow();
        System.out.println(result);
    }

    // Question.md 27: Total character count
    public static void question27_totalCharacterCount() {
        List<String> input = List.of("java", "api");
        // Expected Output: 7
        int total = input.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(total);
    }

    // Question.md 28: Average length
    public static void question28_averageLength() {
        List<String> input = List.of("java", "stream", "api");
        // Expected Output: 4.3333...
        double avg = input.stream()
                .collect(Collectors.averagingDouble(String::length));
        System.out.println(avg);
    }

    // Question.md 29: Most vowels in a word
    public static void question29_mostVowels() {
        List<String> input = List.of("java", "education", "stream");
        // Expected Output: education
        String result = input.stream()
                .max(Comparator.comparingInt(s -> (int) s.chars().filter(c -> "aeiouAEIOU".indexOf(c) >= 0).count()))
                .orElseThrow();
        System.out.println(result);
    }

    // Question.md 30: Distinct characters count
    public static void question30_distinctCharactersCount() {
        List<String> input = List.of("abc", "bcd", "cde");
        // Expected Output: 5
        long count = input.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .distinct()
                .count();
        System.out.println(count);
    }

    // =================== 7. Matching & Short-Circuiting ===================
    // Question.md 31: Any starts with 'z'
    public static void question31_anyStartsWithZ() {
        List<String> input = List.of("java", "stream", "api");
        System.out.println(input.stream().anyMatch(s -> s.startsWith("z"))); // false
    }

    // Question.md 32: All lowercase
    public static void question32_allLowerCase() {
        List<String> input = List.of("java", "stream", "Api");
        System.out.println(input.stream().allMatch(s -> s.equals(s.toLowerCase()))); // false
    }

    // Question.md 33: None empty
    public static void question33_noneEmpty() {
        List<String> input = List.of("java", " ", "stream");
        System.out.println(input.stream().noneMatch(s -> s.trim().isEmpty())); // false
    }

    // Question.md 34: First longer than 7
    public static void question34_firstLongerThan7() {
        List<String> input = List.of("java", "streams", "powerful");
        System.out.println(input.stream().filter(s -> s.length() > 7).findFirst().orElseThrow()); // powerful
    }

    // Question.md 35: Any containing "java"
    public static void question35_anyContainingJava() {
        List<String> input = List.of("hello", "java streams");
        System.out.println(input.stream().anyMatch(s -> s.contains("java"))); // true
    }

    // =================== 8. Sorting ===================
    // Question.md 36: Sort by length
    public static void question36_sortByLength() {
        List<String> input = List.of("java", "is", "powerful");
        System.out.println(input.stream().sorted(Comparator.comparingInt(String::length)).toList());
    }

    // Question.md 37: Length then alphabet
    public static void question37_lengthThenAlphabet() {
        List<String> input = List.of("bat", "apple", "ant", "bapple", "aaaaa");
        System.out.println(input.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .toList());
    }

    // Question.md 38: Reverse alphabetical
    public static void question38_reverseAlphabet() {
        List<String> input = List.of("java", "api", "stream");
        System.out.println(input.stream().sorted(Comparator.reverseOrder()).toList());
    }

    // Question.md 39: Sort by vowel count
    public static void question39_sortByVowelCount() {
        List<String> input = List.of("java", "education", "stream");
        System.out.println(input.stream()
                .sorted(Comparator.comparingLong(s -> s.chars().filter(c -> "aeiouAEIOU".indexOf(c) >= 0).count()))
                .toList());
    }

    // Question.md 40: Top 3 longest
    public static void question40_top3Longest() {
        List<String> input = List.of("a", "bb", "ccc", "dddd", "eeeee");
        System.out.println(input.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .limit(3)
                .toList());
    }

    // =================== 9. Complex Grouping & Reduction ===================
    // Question.md 41: Unique consonants per group
    public static void question41_uniqueConsonantsPerGroup() {
        List<String> input = List.of("apple", "ant", "ball", "bat");
        System.out.println(input.stream().collect(Collectors.groupingBy(
                s -> s.charAt(0),
                Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream()
                                .flatMap(str -> Arrays.stream(str.split("")))
                                .filter(c -> !"aeiouAEIOU".contains(c))
                                .distinct()
                                .toList()
                )
        )));
    }

    // Question.md 42: Most frequent character
    public static void question42_mostFrequentCharacter() {
        List<String> input = List.of("apple", "banana");
        System.out.println(input.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey());
    }

    // Question.md 43: Comma-separated per group
    public static void question43_commaSeparatedPerGroup() {
        List<String> input = List.of("cat", "car", "dog");
        System.out.println(input.stream().collect(Collectors.groupingBy(
                s -> s.charAt(0),
                Collectors.collectingAndThen(Collectors.toList(),
                        list -> list.stream().collect(Collectors.joining(",")))
        )));
    }

    // Question.md 44: Character frequency
    public static void question44_characterFrequency() {
        List<String> input = List.of("ab", "bc");
        System.out.println(input.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }

    // Question.md 45: Average vowels per group
    public static void question45_avgVowelsPerGroup() {
        List<String> input = List.of("apple", "ant", "ball", "bat");
        Map<Character, Double> avgVowels = input.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.averagingDouble(str -> str.chars().filter(c -> "aeiouAEIOU".indexOf(c) >= 0).count())
                ));
        System.out.println(avgVowels);
    }

}
