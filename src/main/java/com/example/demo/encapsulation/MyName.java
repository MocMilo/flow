package com.example.demo.encapsulation;

public class MyName {

    public class InnerClass{
        // this one is valid because it is public and embeded (can have different name then java file)
    }}

abstract class ValidClassBecauseNotPublic {

    // this one is valid because it is not public, note it is not embeded
    // (can have different name then java file)
}
