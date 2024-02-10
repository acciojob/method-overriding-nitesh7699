package com.driver;

public class Main {

    public static class A{
        public String meth(String str){
            return str;
        }
    }
    
    public static class B extends A{
        public String meth(String str1){
            return str1;
        }
    }

    public static void main(String[] args) {
        
        B obj = new B();
        String ans = obj.meth("hello");///////
        String ans1 = obj.meth("person");/////

    }
}