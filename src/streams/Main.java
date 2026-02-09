package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Main extends School {
    public static void main(String[] args) {
        String a = "Pneumonoultramicroscopicsilicovolcanoconiosis";

//        Map<String, Long> longMap = Arrays.stream(a.split("")).collect(Collectors.groupingBy(s -> s.toLowerCase(),
//                Collectors.counting()));
//        System.out.println(longMap);

//        Optional<String> first =
//                longMap.entrySet().stream().filter(k -> k.getValue() == 1).map(k -> k.getKey()).skip(1).findFirst();
//        System.out.println(first);

//        Optional<String> first1 =
//                Arrays.stream(a.split("")).filter(s -> a.indexOf(s) == a.lastIndexOf(s)).findFirst();
//        System.out.println(first1);

//        String word = "I am the";
//        Optional<String> reduce = Arrays.stream(word.split(" "))
//                .map(s -> s.trim())
//                .reduce((x, y) -> y + " " + x);
//        System.out.println(reduce.get());
//
//        String collect = Arrays.stream(word.split("\\s+"))
//                .map(s -> s.trim())
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        list -> {
//                            Collections.reverse(list);
//                            return String.join(" ", list);
//                        }
//                ));
//        System.out.println(collect);
//
//        String newWord = "hello world";
//        String collect1 = Arrays.stream(newWord.split("\\s+"))
//                .map(s -> IntStream.range(0, s.length())
//                        .mapToObj(i -> (i % 2 == 0)
//                                ? String.valueOf(s.charAt(i)).toLowerCase()
//                                : String.valueOf(s.charAt(i)).toUpperCase()
//                        )
//                        .collect(Collectors.joining()))
//                .collect(Collectors.joining(" "));
//        System.out.println(collect1);
//
//        String word = "abbbbaaas";
//        LinkedHashSet<String> repeatingChars = new LinkedHashSet<>();
//        Map<String, Integer> map = new HashMap<>();
//
//        Arrays.stream(word.split(""))
//                .forEach(s -> {
//                    if (map.containsKey(s)) {
//                        map.put(s, map.get(s) + 1);
//                        repeatingChars.add(s);
//                    } else {
//                        map.put(s, 1);
//                    }
//                });
//
//        System.out.println(repeatingChars);
//
//        List<String> repeat = new ArrayList<>(repeatingChars);
//
//        System.out.println(repeat.get(1));
//
//        String sentence = "i am the.";
//        String[] split = sentence.split("\\W+");
//        List<String> list = Arrays.asList(split);
//        System.out.println(list);
//
//        String collect = Arrays.stream(sentence.split(" "))
//                .map(s -> {
//                    if (s.endsWith(".")) {
//                        return s.substring(0, s.length() - 1);
//                    }
//                    return s;
//                }).collect(Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        listReverse -> {
//                            Collections.reverse(listReverse);
//                            listReverse.set(listReverse.size() - 1, listReverse.get(listReverse.size() - 1) + ".");
//                            return String.join(" ", listReverse);
//                        }
//                ));
//        System.out.println(collect);
//
//        User user = new User(1, "Dhruv");
//        System.out.println(user.id());
//
//        System.out.println(user);
//
//        UserData userData = new UserData(1, "Dhruv");
//        System.out.println(userData.getId());
//
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Optional<Integer> list2 = list1.stream().filter(x -> x % 2 == 0).findAny();
//        System.out.println(list2);
//
//        List<Integer> list3 = Arrays.asList(1, 3, 5, 7, 9, 2);
//        boolean b = list3.stream().noneMatch(x -> x % 2 == 0);
//        System.out.println(b);
//
//        Supplier<Integer> supplier = () -> 10;
//        Consumer<Integer> consumer = x -> System.out.println(x);
//        Predicate<Integer> isEven = x -> x % 2 == 0;
//        Function<Integer, Integer> function = x -> x * x;
//
//        if (isEven.test(supplier.get())) {
//            consumer.accept(function.apply(supplier.get()));
//        }
//
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//
//        int num = 2;
//
//        switch (num) {
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            default: {
//                System.out.println("default");
//            }
//
//        }
//
//        String result = switch (num) {
//            case 1 -> "1";
//            case 2 -> "2";
//            case 3 -> "3";
//            default -> "default";
//        };
//
//        System.out.println(result);
//
//        Main main = new Main();
//
//        System.out.println(main.sum(2, 3));
//        System.out.println(main.sum(2, 3, 4, 5));
//        System.out.println(main.sum(2, 3, 1, 5, 6, 7, 8, 9, 0, 3, 2, 1, 2, 3, 4, 44));
//
//        String sentence1 = "abacdbbbbbaedbabsbasefan";
//
//        Optional<String> first = Arrays.stream(sentence1.split(""))
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(s -> s.getValue() > 1)
//                .sorted((p, q) -> q.getValue().compareTo(p.getValue()))
//                .map(x -> x.getKey()).skip(1).findFirst();
//        System.out.println(first);
//
//        //ababbbbbababsbasan
//
//
//        String fullWord = "abcdefghijklmno";
//        String subWord = "efg";
//
//        String[] splitSubWord = subWord.trim().split("");
//        String[] splitFullWord = fullWord.trim().split("");
//
//        for (int i = 0; i < splitFullWord.length; i++) {
//
//            for (int j = 0; j < splitSubWord.length; j++) {
//                if (splitSubWord[j].equals(splitFullWord[i]) &&
//                        splitSubWord[j + 1].equals(splitFullWord[i + 1]) &&
//                        splitSubWord[j + 2].equals(splitFullWord[i + 2])) {
//                    System.out.println("The common substring starts from " + i);
//                }
//                if (i > splitSubWord.length) {
//                    break;
//                }
//            }
//
//        }
//
//        List<String> strings = Arrays.asList("Dhruv", "Malik", "Vansh", "Anas", "Bharadwaj");
//
//        String.join(" ", strings);
//        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        Double collect1 = strings.stream().collect(Collectors.averagingDouble(String::length));
//        System.out.println(collect1);
//
//        Optional<Float> reduce = strings.stream()
//                .map(s -> (float) s.length() / strings.size())
//                .reduce(Float::sum);
//        System.out.println(reduce);
//
//        Optional<Float> reduce1 = list4.stream().map(i -> (float) i / list4.size()).reduce(Float::sum);
//        System.out.println(reduce1.get());
//
//        int number = 12345;
//        String s = String.valueOf(number);
//
//        String collect2 = Arrays.stream(s.split("")).collect(Collectors.collectingAndThen(Collectors.joining(""),
//                q -> new StringBuilder(q).reverse().toString()));
//
//        Integer collect3 = Arrays.stream(s.split(""))
//                .collect(Collectors.collectingAndThen(Collectors.joining(),
//                        q -> Integer.valueOf(new StringBuilder(q).reverse().toString())));
//
//        System.out.println(collect2);
//        System.out.println(collect3);
//
//        Integer i = Arrays.stream(s.split("")).
//                limit(1)
//                .map(x -> {
//                    int reversed = 0;
//                    int n = number;
//                    while (n != 0) {
//                        int digit = n % 10;
//                        reversed = reversed * 10 + digit;
//                        n /= 10;
//                    }
//                    return reversed;
//                }).findFirst()
//                .orElseThrow();
//        System.out.println(i);
//
//        String string = "Hello my name is Dhruv Malik.";
//
//        String collect4 = Arrays.stream(string.split(" "))
//                .map(s1 -> {
//                    if (s1.endsWith(".")) {
//                        return s1.substring(0, s1.length() - 1);
//                    }
//                    return s1;
//                })
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        l -> {
//                            Collections.reverse(l);
//                            l.set(l.size() - 1, l.get(l.size() - 1) + ".");
//                            return String.join(" ", l);
//                        }
//                ));
//        System.out.println(collect4);

//        Long c = System.currentTimeMillis();
//        System.out.println(c);
//
//        int[] array = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 7, 7};
//        int k = 1;
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] != array[i - 1]) {
//                array[k++] = array[i];
//            }
//        }
//
//
//        for (int i = 0; i < k; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        System.out.println();
//
//
//        int[] zeroArr = {1, 2, 0, 0, 3, 12, 0};
//
//        int nonZeroPointer = 0;
//        for (int j = 0; j < zeroArr.length; j++) {
//            if (zeroArr[j] != 0) {
//                zeroArr[nonZeroPointer++] = zeroArr[j];
//            }
//        }
//
//
//        while (nonZeroPointer < zeroArr.length) {
//            zeroArr[nonZeroPointer++] = 0;
//        }
//
//        for (int x : zeroArr) {
//            System.out.print(x + " ");
//        }
//
//        int i = 0;
//        int k = 0;
//        while (i < array.length - 1) {
//            if (array[i] != array[i + 1]) {
//                newArray[k++] = array[i];
//            }
//            i++;
//        }
//
//        newArray[k++] = array[array.length - 1];
//
//        for (int j = 0; j < k; j++) {
//            System.out.print(newArray[j] + " ");
//        }
//
//        Long d = System.currentTimeMillis();
//        System.out.println(d);
//        System.out.println(d - c);
//
//
//        Long c = System.currentTimeMillis();
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 2, 7};
//        int finalLength = arr1.length + arr2.length;
//        int[] finalArray = new int[finalLength];
//        int k = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            finalArray[k++] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            boolean exists = false;
//
//            for (int j = 0; j < k; j++) {
//                if (finalArray[j] == arr2[i]) {
//                    exists = true;
//                    break;
//                }
//            }
//            if (!exists) {
//                finalArray[k++] = arr2[i];
//            }
//        }
//
//        System.out.println(k);
//        for (int i = 0; i < k; i++) {
//            System.out.print(finalArray[i] + " ");
//        }
//        System.out.println();
//        Long d = System.currentTimeMillis();
//        System.out.println(d - c);

//        int[] array = {1, 1, 0, 1, 1, 1};
//        int k = 0;
//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 1) {
//                k++;
//                max = Math.max(max, k);
//            } else {
//                k = 0;
//            }
//        }
//        System.out.println(max);
//        int[] array = {1, 2, 2, 3, 5, 3, 4, 1, 4};
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        for (int i : array) {
//            if (!countMap.containsKey(i)) {
//                countMap.put(i, 1);
//            } else {
//                countMap.put(i, countMap.get(i) + 1);
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//            }
//        }
//
//        Arrays.stream(array).boxed()
//                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
//                .entrySet().stream()
//                .filter(x -> x.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .forEach(System.out::println);


//        int[] array = {2, 11, 15, 7};
//        HashMap<Integer, Integer> checkMap = new HashMap<>();
//        int target = 9;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == target) {
//                    System.out.println(i + " " + j);
//                }
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            int needed = target - array[i];
//            checkMap.put(array[i], i);
//            if (checkMap.containsKey(needed)) {
//                System.out.println(checkMap.get(needed) + " " + i);
//            }
//        }
//
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            int needed = target - array[i];
//            checkMap.put(array[i], i);
//            if (checkMap.containsKey(needed)) {
//                System.out.println(checkMap.get(needed) + " " + i);
//            }
//        }
//        System.out.println("Not found");

//        int[] array = {2, 2, 1, 1, 1, 2, 2};
//        int countMax = 0;
//        int maxNumber = 0;
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        for (int i : array) {
//            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            if (entry.getValue() > countMax) {
//                countMax = entry.getValue();
//                maxNumber = entry.getKey();
//            }
//        }
//        System.out.println(maxNumber);

//        int[] array = {7, 1, 5, 3, 6, 4};
////        int[] array = {5, 4, 3, 2, 1};
//        int smallest = array[0];
//        int largest = 0;
//        int smallestIndex = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < smallest) {
//                smallest = array[i];
//                smallestIndex = i;
//            }
//        }
//        for (int i = smallestIndex; i < array.length; i++) {
//            if (array[i] > largest) {
//                largest = array[i];
//            }
//        }
//        System.out.println(smallest);
//        System.out.println(largest);
//        System.out.println(largest - smallest);

//        int[] array = {3, 1, -2, -5, 2, -4};
//        int[] positiveArray = new int[array.length / 2];
//        int[] negativeArray = new int[array.length / 2];
//        int posInd = 0;
//        int negInd = 0;
//        for (int i : array) {
//            if (i < 0) {
//                negativeArray[negInd++] = i;
//            } else if (i > 0) {
//                positiveArray[posInd++] = i;
//            }
//        }
//
//        int k = 0;
//        int n = 0;
//        for (int j : positiveArray) {
//            array[k++] = j;
//            array[k++] = negativeArray[n++];
//        }
//
//        for (int i : array) {
//            System.out.println(i);
//        }
//        int[] nums = {100, 4, 200, 1, 3, 2};
//        int maxCount = 0;
//        int conCount = 1;
//        TreeSet<Integer> orderedSet = new TreeSet<>();
//        for (int i : nums) {
//            orderedSet.add(i);
//        }
//        Iterator<Integer> integerIterator = orderedSet.iterator();
//        for (int i = 0; i < orderedSet.size(); i++) {
//            int el = integerIterator.next();
//            nums[i] = el;
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1] + 1) {
//                conCount++;
//            } else {
//                if (conCount > maxCount) {
//                    maxCount = conCount;
//                }
//                conCount = 1;
//            }
//        }
//        System.out.println(maxCount);
//        int[] nums = {100, 4, 200, 1, 3, 2};
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int longestStreak = 0;
//
//        for (int num : set) {
//            if (!set.contains(num - 1)) {
//                int current = num;
//                int streak = 1;
//
//                while (set.contains(current + 1)) {
//                    streak++;
//                    current++;
//                }
//
//                longestStreak = Math.max(longestStreak, streak);
//
//            }
//        }
//
//        System.out.println(longestStreak);
//
//        for (int i : nums) {
//            System.out.print(i + " ");
//        }

//        int[] array = {1, 2, 1, 2, 1};
//        int target = 3;
//        Map<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//
//        for (int num : array) {
//            int needed = target - num;
//            if (map.containsKey(needed)) {
//                count += map.get(needed);
//            }
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        System.out.println(count);
//
//        Map<String, Integer> map1 = new HashMap<>();
//        map1.put("A", 1);
//        map1.put("A", 2);
//        map1.put("A", 3);
//        map1.put("A", 4);
//        map1.put("B", null);
//        map1.put(null, 3);
//        System.out.println(map1.put("C", 1));
//        System.out.println(map1.put("C", 2));
//        System.out.println(map1.put("C", 3));
//        System.out.println(map1.size());
//        System.out.println(map1);
//        System.out.println(map1.containsValue(2));

//        String word = "amsterdma";
//        String s = Arrays.stream(word.split(""))
//                .filter(x -> word.indexOf(x) == word.lastIndexOf(x))
//                .skip(1)
//                .findFirst()
//                .orElseThrow();
//        System.out.println(s);
//        String s1 = Arrays.stream(word.split("")).filter(x -> word.indexOf(x) != word.lastIndexOf(x)).skip(1).findFirst().orElseThrow();
//        System.out.println(s1);

//        String word = "amsterdma";
//        LinkedHashSet<String> repeatingChars = new LinkedHashSet<>();
//        Map<String, Integer> map = new HashMap<>();
//
//        Arrays.stream(word.split(""))
//                .forEach(s -> {
//                    if (map.containsKey(s)) {
//                        map.put(s, map.get(s) + 1);
//                        repeatingChars.add(s);
//                    } else {
//                        map.put(s, 1);
//                    }
//                });
//
//        System.out.println(repeatingChars);
//
//        System.out.println(map);
//
//        List<String> repeat = new ArrayList<>(repeatingChars);
//
//        System.out.println(repeat.get(1));

//        int[] arr = new int[]{0, 1, 2, 0, 0, 4, 3, 0, 5};
//        int nonZeroIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                int temp = arr[i];
//                arr[i] = arr[nonZeroIndex];
//                arr[nonZeroIndex] = temp;
//                nonZeroIndex++;
//            }
//        }


//        while (nonZeroIndex < arr.length) {
//            arr[nonZeroIndex++] = 0;
//        }
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5};

        Set<Integer> integers = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(integers);

        List<Integer> list =
                Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().map(x -> x.getKey()).toList();
        System.out.println(list);

    }


    public int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }


}
