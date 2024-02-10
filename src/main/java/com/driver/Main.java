package com.driver;

public class Main {

    public static class A{
        public String meth(){
            return str;
        }

        String ans = meth();
    }
    
    public static class B extends A{
        public String meth(){
            return str;
        }
    }

    public static void main(String[] args) {
        
        B obj = new B();
        String ans = obj.meth();/////
        String ans1 = obj.meth();/////

    }
}