package streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> list = integers.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list);

        List<String> strings = Arrays.asList("anas", "dhruv", "vansh");
        List<String> strings1 = strings.stream().map(s -> s.toUpperCase()).toList();
        System.out.println(strings1);

        List<String> strings2 = Arrays.asList("", "Dhruv", "", "Malik", "");
        long count = strings2.stream().filter(s -> s.isEmpty()).count();
        System.out.println(count);

        List<Integer> list1 = Arrays.asList(3, 2, 1, 5, 7, 87, 43, 322);
        List<Integer> list2 = list1.stream().sorted().toList();
        System.out.println(list2);

        List<Integer> list3 = Arrays.asList(2, 1, 4, 6, 4, 3, 2, 1, 43);
        Optional<Integer> optionalInteger = list3.stream().reduce((i1, i2) -> i1 + i2);
        System.out.println(optionalInteger);

        List<Integer> list4 = Arrays.asList(23, 45, 51, 56, 57, 58, 59);
        Optional<Integer> first1 = list4.stream().filter(x -> x > 50).sorted().findFirst();
        System.out.println(first1);

        List<Integer> integers1 = Arrays.asList(2, 2, 1, 1, 2, 43, 4, 3, 2, 1, 6, 7, 8, 8);
        Set<Integer> integers2 = integers1.stream().map(i -> i * i).collect(Collectors.toSet());
        System.out.println(integers2);

        List<Integer> integers3 = Arrays.asList(22, 33, 11, 44, 3333, 11112, 44, 3, 2, 2221);
        Optional<Integer> first = integers3.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(first);

        List<String> strings3 = Arrays.asList("Dhruv", "Anas", "Vansh");
        String collect = strings3.stream().collect(Collectors.joining(","));
        System.out.println(collect);

        List<Integer> list5 = Arrays.asList(-1, -2, -4, -3, 1, 2, 3, 4, 5);
        List<Integer> list6 = list5.stream().filter(x -> x < 0).toList();
        System.out.println(list6);

        List<String> strings4 = Arrays.asList("Dhruv", "Anas", "Vansh", "Payallllll");
        Map<Integer, List<String>> listMap = strings4.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(listMap);

        List<String> strings5 = Arrays.asList("Dhruv", "Anas", "Vansh", "Dhruv", "Vansh");
        Map<String, Long> longMap = strings5.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(longMap);

        List<Integer> list7 = Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7, 9, 9);
        Set<Integer> integers4 = list7.stream().collect(Collectors.toSet());
        System.out.println(integers4);

        List<Integer> list8 = Arrays.asList(8, 7, 6, 5, 4, 3, 4, 5, 6, 7, 8, 9, 990, 987565342, 221, 121, 3324, 54);
        List<Integer> limit = list8.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(limit);

        Optional<Integer> first2 = list8.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first2);

        List<Integer> list9 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> booleanListMap = list9.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(booleanListMap);

        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> list10 = nested.stream().flatMap(x -> x.stream()).toList();
        System.out.println(list10);

        List<String> words = Arrays.asList("appppple", "bananananana", "apppple", "orrrrange", "bannnana");
        Double collect1 = words.stream().collect(Collectors.averagingDouble(x -> x.length()));
        System.out.println(collect1);

        List<String> words1 = Arrays.asList("jav a", "st ream", "api");
        Set<String> stringSet =
                words1.stream().flatMap(x -> Arrays.stream(x.split(""))).filter(s -> !s.contains(" ")).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(stringSet);

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "IT"),
                new Employee("David", "Finance"),
                new Employee("Eva", "HR")
        );

        Map<String, List<String>> collect2 = employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment(), Collectors.mapping(x -> x.getName(),
                Collectors.toList())));
        System.out.println(collect2);

        String para = "Hi this is streams practice session, streams practice session, this is not easy";

        List<String> strings6 = Arrays.stream(para.toLowerCase()
                        .split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((o1, o2) ->
                        o2.getValue().compareTo(o1.getValue()))
                .limit(3)
                .map(x -> x.getKey())
                .toList();
        System.out.println(strings6);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Optional<String> first3 =
                names.stream().sorted((s1, s2) -> s2.length() - s1.length()).findFirst();
        System.out.println(first3);

        List<String> words2 = Arrays.asList("Java", "Stream", "API");

        Collector<CharSequence, StringJoiner, String> stringJoinerSupplier = Collector.of(() -> new StringJoiner("-"),
                StringJoiner::add,
                StringJoiner::merge,
                StringJoiner::toString
        );

        String collect3 = words2.stream().collect(stringJoinerSupplier);
        System.out.println(collect3);

        List<Employee1> employees1 = Arrays.asList(
                new Employee1("Alice", "IT", "Developer"),
                new Employee1("Bob", "IT", "Tester"),
                new Employee1("Charlie", "HR", "Recruiter"),
                new Employee1("David", "IT", "Developer"),
                new Employee1("Eva", "HR", "Manager")
        );

        Map<String, Map<String, List<String>>> collect4 = employees1.stream().collect(Collectors.groupingBy(x -> x.getDepartment(),
                Collectors.groupingBy(x -> x.getRole(), Collectors.mapping(x -> x.toString(), Collectors.toList()))));
        System.out.println(collect4);


        List<Employee2> employees3 = Arrays.asList(
                new Employee2("Alice", "IT", 70000),
                new Employee2("Bob", "IT", 85000),
                new Employee2("Charlie", "HR", 60000),
                new Employee2("David", "Finance", 90000),
                new Employee2("Eva", "HR", 65000)
        );

        Map<String, Optional<Employee2>> collect5 = employees3.stream().collect(Collectors.groupingBy(x -> x.getDepartment(),
                Collectors.maxBy(Comparator.comparing(x -> x.getSalary()))));

        System.out.println(collect5);

        List<String> strings7 = Arrays.asList("Radar", "Rhythm", "Dad", "yo", "Mom");
        List<String> collect6 = strings7.stream().filter(s -> s.toLowerCase().contentEquals(new StringBuilder(s.toLowerCase()).reverse())).collect(Collectors.toList());
        System.out.println(collect6);

        List<Employees3> employees4 = Arrays.asList(
                new Employees3("Alice", 8000),
                new Employees3("Bob", 10000),
                new Employees3("Charlie", 8000),
                new Employees3("David", 6000)
        );

        employees4.stream()
                .sorted(Comparator.comparing((Employees3 x) -> x.getSalary())
                        .reversed()
                        .thenComparing(x -> x.getName()))
                .forEach(x -> System.out.println(x));

        List<Employee> baseEmp = Arrays.asList(
                new Employee("Alice", "IT"),
                new Employee("Bob", "HR"),
                new Employee("Charlie", "IT"),
                new Employee("David", "Finance"),
                new Employee("Eva", "HR")
        );
        List<EmployeeDto> list11 = baseEmp.stream().map(x -> new EmployeeDto(x.getName())).toList();
        System.out.println(list11);


        String word = "anas";

        Optional<String> reduce = Arrays.stream(word.split("")).reduce((x, y) -> y + x);
        System.out.println(reduce.get());

        String[] split = word.split("");

        StringBuilder b = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            b.append(split[i]);
        }
        System.out.println(b);


    }


    static class Employee {
        private final String name;
        private final String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    }


    static class EmployeeDto {
        private final String name;

        public EmployeeDto(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "EmployeeDto{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    static class Employee1 {
        private final String name;
        private final String department;
        private final String role;

        public Employee1(String name, String department, String role) {
            this.name = name;
            this.department = department;
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String getRole() {
            return role;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static class Employee2 {
        private final String name;
        private final String department;
        private final double salary;

        public Employee2(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return name + " (" + salary + ")";
        }
    }

    static class Employees3 {
        private final String name;
        private final double salary;

        public Employees3(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employees3{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
