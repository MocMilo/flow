package com.example.demo.model.inheritance;

import com.example.demo.model.staticexperiments.Some;

public class MyBase {

    int someInt = 10;
    public static void changeIt(int a){
        a = 20;
    }

    public static void changeIt(Some s){
        s.setSomeInt(20);
    }

    public void main(String[] args){
        changeIt(someInt);
        System.out.println(someInt);
    }


}
