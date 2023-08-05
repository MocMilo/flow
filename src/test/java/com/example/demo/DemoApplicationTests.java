package com.example.demo;

import com.example.demo.ankicrackcode.model.Person;
import com.example.demo.inheritance.MyBase;
import com.example.demo.model.staticexperiments.Some;
import com.example.demo.inheritance.SubBase;
import com.example.demo.model.staticexperiments.Wrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testTables() {

        // simple operations on tables
        // populate table, empty table of strings, of int etc.

        String[] a = new String[2];
        new MyBase().main(a);
        Some some = new Some();
        MyBase.changeIt(some);
        System.out.println("some changed: " + some.getSomeInt());
        System.out.println("test xxx");

        int i = 10;
        i = 20;
        System.out.println("changed i " + i);

        System.out.println("from empty table: a) length:" + a.length + "b) value " + a[0]);


        // java.lang.ArrayIndexOutOfBoundsException
        //System.out.println("c) out of index:" + a[2]);


        int[] ints = new int[3];
        System.out.println("first element of empty int table " + ints[0]);


        if (true)
            if (false)
                System.out.println();

        String example = "blooper";
        System.out.println("substring " + example.substring(4)); // removes first 4 characters


        // ten sam a inny obiekt w pamięci
        MyBase my = new MyBase();
        System.out.println(my);
        System.out.println(my);
        System.out.println(new MyBase());
    }


    @Test
    void testMultiDimensionTables() {
        int ia[][] = {{1, 2}, {5, 3}, null};

        System.out.println("how data is stored");
        System.out.println("1) print by explicit calls...");
        System.out.println(ia[0][0]);  // 1
        System.out.println(ia[0][1]);  // 2     // loop następnie poleci po [0][2]  czyli trzeci element
        System.out.println(ia[1][0]);  // 5
        System.out.println(ia[1][1]);  // 3
        //System.out.println(ia[2][0]);  // null pointer ex
        //System.out.println(ia[3]);     // index out of bounds

        int tableLength = ia.length;
        int maxDimensionIndex = 2;
        System.out.println("table length:" + tableLength);
        System.out.println("table max index:" + maxDimensionIndex);

        System.out.println("2) print by loops...");

        for (int i = 0; i < tableLength; i++) {
            System.out.println("outer loop i:" + i);

            for (int j = 0; j < maxDimensionIndex; j++) {
                System.out.println("nested loop j:" + j);
                System.out.println(ia[i][j]);
            }
        }
    }

    @Test
    void testArraySizeAndDedicatedForLoop() {
        int size = 10;   // jeszcze to przemyśl z testem powyżej, bo czemu tu nie trzeba od size -1 ustalać max index?
        int[] arr = new int[size];

        for (int i = 0; i < size; ++i)
            System.out.println(arr[i]);
    }


    @Test
    void testStringsAndNull() {

        String value1 = null;
        String value2 = "test";

        String concat = value2.concat(value1);

        System.out.println(concat);

    }

    @Test
    void testClassAndSubclass() {

        MyBase myBase = new SubBase();
        SubBase subBase = new SubBase();
        // SubBase subBase = new MyBase();          // this will not compile
        SubBase subBase2 = (SubBase) new MyBase();   // this will compile / if it will not be true (this cast), different object, then ClassCassException

        myBase = (MyBase) subBase;
    }

    @Test
    void strangeLoops() {
        int i;
        int j;
        for (i = 0, j = 0; j < i; ++j, i++) {  // no iteration will be executed in this loop, condition is always false
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);  // this will print only once
    }

    @Test
    void testWrapperClass() {
        Wrapper w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        w.w += 30;
        System.out.println(w.w); // 50
        w = changeWrapper(w);
        System.out.println(w.w); // 19
    }

    static Wrapper changeWrapper(Wrapper w) {
        w = new Wrapper();
        w.w += 9;
        return w;
    }

    @Test
    void testSortingHashSet() {

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("d");
        set.add("b");
        set.add("c");
        set.add("e");
        set.add("g");
        set.add("f");
        set.add("z");

        Set<String> sorted = set.stream()
                .sorted()
                .collect(Collectors.toCollection(HashSet::new));

        sorted.forEach(x -> System.out.println(x));

        Stream.of(1, 2, 3, 4, 5).filter(x -> x % 2 == 0).sorted().collect(Collectors.toList()).forEach(x -> System.out.println("filtred" + x));


        String str1 = new String("ggg");
        String str2 = new String("ggg");

        boolean equal = str1 == str2;
        System.out.println(equal);

        Predicate<Person> isName = person -> person.getAge().equals("20");

        isName.test(new Person("Antek", "20"));


        int i = 2;
        int y = 3;

        System.out.println("How modulo division works:");
        System.out.println(0 % 3);     // 0     -> 0 and remainder is 0  (deviding by 0 is always 0, reminder always 0)
        System.out.println(1 % 3);     // 1     -> 0 and remainder is 1  (note devided number less ther devider)
        System.out.println(2 % 3);     // 2     -> 0 and remainder is 2  (note devided number less ther devider)
        System.out.println(3 % 3);     // 0     -> 1 and remainder is 0
        System.out.println(4 % 3);     // 1     -> 1 and remainder is 1
        System.out.println(5 % 3);     // 2     -> 1 and remainder is 2
        System.out.println(6 % 3);     // 0     -> 2 and remainder is 0
        System.out.println(7 % 3);     // 1     -> 2 and remainder is 1

        System.out.println("with negative values:");
        System.out.println(-7 % 3);    // -1     -> -2 and remainder is -1 (devision of negative value)
        System.out.println(-7 % -3);   // -1     ->  2 and remainder is -1
        System.out.println(7 % -3);    //  1     -> -2 and remainder is  1
        System.out.println(2 % -3);    //  2     ->  0 and remainder is  2
        System.out.println(-1 % 3);    // -1     ->  0 and remainder is -1


        Map<String, Integer> map = Stream.of(new String[][]{
                {"one", "1"},
                {"two", "2"},
                {"three", "3"},
                {"four", "4"}
        }).collect(Collectors.toMap(data -> data[0], data -> Integer.parseInt(data[1])));


        System.out.println("Map collected from String[][] 2D array:");
        map.forEach((k, v) -> System.out.println("key:" + k + " value:" + v));
    }


}
