package com.example.demo.primitives;

public class Primitives {


    public static void main(String[] args) {

        int n = 10;
        n++;
        System.out.println(n);

        int x = 10;
        int y = 5;
        x -= y;                   // x = x - y
        System.out.println(x);    // 5

        double d = 1.3d;
        int i = 5;
        // i = i + d;      // this will not compile: double -> int
        i = i + (int) d;   // explicit casting

        System.out.println(i);  // 6  (fraction removed)

        Double dd = 5.3d;
        Integer ii = 1;

        // ii += dd;            // equivalent of "ii = ii + dd" , but it will not compile
        // ii += (Integer) dd;    // explicit casting? This will also fail

        ii += dd.intValue();  // this compiles and is a proper casting for wrapper objects

        System.out.println(ii);  // 6


        int myVal = 50;
        myVal -= 5;
        System.out.println(myVal);  // 45

        int myVal2 = 53;
        myVal2 %= 5;
        System.out.println(myVal2);    // 3

        int result = 700;
        int val1 = 5;
        int val2 = 10;
        result /= val2 + val2 * val1;
        System.out.println(result);   // 700/(10+(5*10)) = 11  (11.66.. ->int-> 11)

        Double ddd = 100.03d;
        Float fff = ddd.floatValue();
        Long lll = fff.longValue();
        Integer iii = lll.intValue();
        Short sss = iii.shortValue();
        Byte bbb = sss.byteValue();

        System.out.println(ddd); // prints "100.03"
        System.out.println(bbb); // prints "100"


       // Integer number = new Integer();  // will not compile
       // Integer myNumber1 = new Integer(100); // will not compile deprecated since java 9
        Integer myNumber2 = Integer.valueOf(100); // unnecessary boxing
        Integer myNumber3 = 100; // simple and works

       // Float fNumber = new Float(); // will not compile
       // Float fNumber1 = new Float(10.5f); // will not compile deprecated since java 9
        Float fNumber2 = Float.valueOf(10.5f); // unnecessary boxing
        Float fNumber3 = 100f;

        //Double dNumber = new Double(); // will not compile
       // Double dNumber1 = new Double(1.03d); // will not compile deprecated since java 9
        Double dNumber2 = Double.valueOf(1.03d); // unnecessary boxing

        Double dNumberOrig = 1000000000d;
        Short converted = dNumberOrig.shortValue();
        System.out.println("before convert: " + dNumberOrig + " after convert: " + converted);
        // prints "1.0E9 after convert: -13824"



       // Boolean bool1= new Boolean(); // will not compile
       // Boolean bool2 = new Boolean(true); // will not compile deprecated since java 9
        Boolean bool3 = Boolean.valueOf(true); // unnecessary boxing
        Boolean bool4 = true;

       // Character character = 'abc'; // will not compile
        Character character1 = 'a';
        Character character2 = '5';
        Byte myByte = 12;

        Short myShort = 123;


    }
}
