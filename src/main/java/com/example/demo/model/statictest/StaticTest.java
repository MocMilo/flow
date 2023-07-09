package com.example.demo.model.statictest;

public class StaticTest {

    void m1(){
        StaticTest.m2();  // 1
        m4();             // 2
        // StaticTest.m3();  // 3    // this will not compile - normal method from static context "StaticTest."
    }

    static void m2(){ }  // 4

    void m3(){
        m1();            // 5
        m2();            // 6
       // StaticTest.m1(); // 7   // this will not compile  - normal method from static context "StaticTest."
    }

    static void m4(){ }



}
