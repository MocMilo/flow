package com.example.demo.model.statictest;

public class Some {

    int someInt = 5;


    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }





    // 1) consider methods
    void myMethod(){

    }

    // 2) this will not compile, because method name already exists, and adding static will not change anything
/*    static void myMethod(){

    }*/

}
