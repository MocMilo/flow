package com.example.demo.ankicrackcode;


import com.example.demo.ankicrackcode.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// in this class I will store solutions to Anki short tasks
public class Solutions {

    public static void main(String[] args) {
        // sort();
        // convert();
        // arrayReferencesOnPrimitives();
        //arrayReferencesOnObjects();

        //arrayDynamicSizeChange();

        //arrayReferencesOnPrimitives();

        //arrayCopyReferencesOnObjects();
        // arrayReferencesOnPrimitives();

        //distinctArray();

        //subList();

        groups();

    }

    static void sort() {
        int[] array = {1, 4, 7, 3, 6, 2, 4, 9};
        int[] array2 = Arrays.stream(array).sorted().toArray();  // the key is to assign to new array to have effect
        System.out.println(Arrays.toString(array));  // no change
        System.out.println(Arrays.toString(array2)); // sorted

        Arrays.sort(array);
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));  // sorted
    }

    // r-0001 (anki answer reference number)
    static void convert() {

        Object[] array = {0, 5, 4, 38, 6, 3};
        List<Object> objects = Arrays.asList(array);
        Object[] backToArray = objects.toArray();
        System.out.println(Arrays.toString(backToArray));
    }

    static void arrayReferencesOnPrimitives() {

        // r-0004
        Integer[] intArray = {2, 1, 4, 6, 3, 8};
        List<Integer> intList = Arrays.asList(intArray);  // references array and list to the same objects in memory
        intArray[2] = 5; // modify array
        System.out.println(Arrays.toString(intArray)); // modifies original
        System.out.println(intList); // modifies also intList !


        // r-0005
        System.out.println("copy array example");

        Integer[] intArray2 = {1, 2, 3, 4, 5, 6};
        Integer[] copiedArray = Arrays.copyOf(intArray2, intArray2.length);  // different: copy to another place in memory

        intArray2[2] = 88; // modify first array
        System.out.println(Arrays.toString(intArray2)); // copy is not modified !
        System.out.println(Arrays.toString(copiedArray));

    }

    //r-0003
    static void arrayReferencesOnObjects() {
        Person p1 = new Person("name1", "20");
        Person p2 = new Person("name2", "19");

        Person[] personArray = {p1, p2};
        List<Person> prsonList = Arrays.asList(personArray);  // references array and list to the same objects in memory

        System.out.println(prsonList);
        System.out.println(Arrays.toString(personArray));

        p1.setAge("30"); // modify person

        System.out.println(prsonList); // modifies also person in personList !
        System.out.println(Arrays.toString(personArray));

    }

    // r-0006
    static void arrayCopyReferencesOnObjects() {


        Person p1 = new Person("name1", "20");
        Person p2 = new Person("name2", "19");

        Person[] personArray = {p1, p2};
        Person[] copy = Arrays.copyOf(personArray, personArray.length);  // references array and list to the same objects in memory

        System.out.println(Arrays.toString(personArray));
        System.out.println(Arrays.toString(copy));

        p1.setAge("30"); // modify person

        System.out.println(Arrays.toString(personArray)); // modifies also person in personList !
        System.out.println(Arrays.toString(copy));
    }

    // r-0002
    static void arrayDynamicSizeChange() {

        Person p1 = new Person("name1", "20");
        Person p2 = new Person("name2", "19");

        Person[] personArray = {p1, p2};

        List<Person> personList = new ArrayList<>(Arrays.asList(personArray));  // references array and list to the same objects in memory

        Person p3 = new Person("problem", "22");
        personList.add(p3);  // this will fail with UnsupportedOperationException
        // (list was initialized with fixed size array, and list has fixed size, can't add elements)

        System.out.println(personList);
    }

    static void distinctArray() {

        int[] array = {1, 2, 2, 3, 4, 5, 6};

        int[] distinct = Arrays.stream(array).distinct().toArray();

        System.out.println(Arrays.toString(distinct));
    }


    // r-0007
    static void subList() {

        int[] orgArray = {1, 2, 2, 3, 4, 5, 6};

        int formIndex = 1;
        int toIndex = 4;

        int[] sublist = Arrays.stream(orgArray, formIndex, toIndex).toArray();
        int[] sublist1 = Arrays.copyOfRange(orgArray, formIndex, toIndex);
        int[] sublist2 = IntStream.range(formIndex, toIndex)
                .map(i -> orgArray[i])
                .toArray();


        System.out.println(Arrays.toString(sublist));
        System.out.println(Arrays.toString(sublist1));
        System.out.println(Arrays.toString(sublist2));

        System.out.println(Arrays.toString(orgArray));
    }

    // r-0008
    static void groups() {

        int[] orgArray = {1, 2, 2, 3, 4, 5, 6};
        Map<Boolean, List<Integer>> groups = Arrays.stream(orgArray)
                .boxed()
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        groups.forEach((k, v) -> System.out.println("key:" + k + " value:" + v));

        Map<Boolean, List<Integer>> groups2 = Arrays.stream(orgArray)
                .boxed()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));

        groups2.forEach((k, v) -> System.out.println("key:" + k + " value:" + v));
    }
}
