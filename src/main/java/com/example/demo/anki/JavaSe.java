package com.example.demo.anki;

import java.util.*;
import java.util.function.Function;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaSe {


    public static void main(String[] args) {
        myAnswers();
    }

    static void myAnswers() {

        boolean[] logicArray = new boolean[]{true, false, true};

        System.out.println(logicArray);
        System.out.println(Arrays.toString(logicArray));

        //Q-1564
        List<String> integerStrings = new ArrayList<>();
        integerStrings.add("1");
        integerStrings.add("2");
        Function<String, Integer> parseIntegers = Integer::parseInt;
        List<Integer> integers = integerStrings.stream().map(parseIntegers).toList();
        System.out.println(integers);

        List<Integer> integers2 = new ArrayList<>();
        integers2.add(1);
        integers2.add(3);
        System.out.println(integers2);

        // Q-0014

        int[] intArray = {1, 2, 3, 4};
        Set<Integer> intSet = Arrays.stream(intArray).boxed().collect(Collectors.toSet());
        System.out.println(intSet);

        // Q-0003
        double avr = Arrays.stream(intArray).average().getAsDouble();
        System.out.println(avr);

        double avr2 = 0;
        for (int x : intArray) {
            avr2 += x;
        }
        avr2 = avr2 / intArray.length;
        System.out.println("avr loop: " + avr2);


        // [Q-1558]
        LinkedHashSet<Integer> linkedHashSetSet = intSet.stream().sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        TreeSet<Integer> treeSet = new TreeSet<>(intSet);
        System.out.println("linked: " + linkedHashSetSet + "tree set" + treeSet);

        // [Q-1575]

        Stream<Object> objectStream = Stream.of("two", 2, true, null);

        List<Object> objectList = objectStream.map(Optional::ofNullable).flatMap(Optional::stream).collect(Collectors.toList());
        System.out.println("object list" + objectList);

        // [Q-1576]
        String value = integerStrings.get(1);
        Optional.of(value).filter(v -> value.length() >= 5);

        // [Q-0018]
        int[] intArray2 = {1, 2, 4, 3, 5, 6, 7};
        int k = 3;
        // {5, 6, 7, 1, 2, 4, 3};

        int[] target = new int[intArray2.length];
        int tIndex = 0;
        for (int i = 0; i < intArray2.length; i++) {
            if (i >= intArray2.length - k) {
                target[tIndex] = intArray2[i];
                tIndex++;
            } else {
                target[k + i] = intArray2[i];
            }
        }
        System.out.println("target table:" + Arrays.toString(target));

        // simple solution
        int[] target2 = new int[intArray2.length];
        for (int i = 0; i < intArray2.length; i++) {

            target2[(i + k) % intArray2.length] = intArray2[i];
        }
        System.out.println("target 2: " + Arrays.toString(target2));

        //[Q-1548]

        int[][][] array3d = {{{1, 2}, {1, 2, 3}, {1}}, {{1}}, {{1, 2, 34, 5,}}};
        Arrays.asList(array3d).forEach(x -> {
            Arrays.asList(x).forEach(y -> System.out.println(Arrays.toString(y)));
        });

        //[Q-1559]
        List<Integer> integerList = Arrays.asList(1, 2, 2, 2, 4, 5, 7, 8, 9, 9);

        Map<Integer, Integer> myMap = IntStream.range(0, integerList.size())
                .boxed()
                .collect(Collectors.toMap(Function.identity(), integerList::get));

        System.out.println(myMap);

        // [Q-1652]
        Stream<String> stream = Stream.of("apple", "banana", "cherry");
        String[] myArray = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(myArray));

        // [Q-1557]
        Set<String> set = new HashSet<>(Arrays.asList("1", "two", "xyz"));

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String val = iterator.next();
            System.out.println("val: " + val);
        }

        // [Q-1556]
        LinkedList<String> linked = new LinkedList<>(Arrays.asList("1", "two", "5"));
        linked.add(1, "2");
        System.out.println("linked: " + linked);

        // [Q-0101]

        Set<String> unmodifable = Collections.unmodifiableSet(set);
        // unmodifable.remove("1"); // error
        System.out.println("unmodifable: " + unmodifable);

        // [Q-1564]
        List<String> stringList = Arrays.asList("1", "2", "2", "2", "4");

        Function<String, Integer> convert = Integer::parseInt;

        List<Integer> convertedTo = stringList.stream()
                .map(convert).collect(Collectors.toList());
        System.out.println(convertedTo);

        // [Q-1653]
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        int random = randomGenerator.nextInt();
        System.out.println("random int: " + random);

        // [Q-1559]
        String[][] array = {{"one", "1"}, {"two", "2"}};
        Map<String, Integer> arrayMap = Arrays.stream(array)
                .collect(Collectors.toMap(data -> data[0], data -> Integer.parseInt(data[1])));
        System.out.println(arrayMap);

        Short[] shortArray = {3, 1, 4, 1, 5, 9, 2, 6};

        Arrays.sort(shortArray, Comparator.reverseOrder());

        short[] primitiveArray2 = {3, 1, 4, 1, 5, 9, 2, 6};
        Arrays.sort(primitiveArray2);

        System.out.println(Arrays.toString(primitiveArray2));

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        //deque.removeFirst();





    }

    static void myAnswers2() {


    }


}
