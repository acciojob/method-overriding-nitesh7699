package com.driver;

class A{
    public String meth(String str){
        return str;
    }
}

class B extends A{
    public String meth(String str1){
        return str1;
    }
}

public class Main {
    public static void main(String[] args) {
        
        B obj = new B();
        String ans = obj.meth("hello");
        String ans1 = obj1.meth();

    }
}