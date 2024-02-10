package com.driver;

public class Main {

    public static class A{
        String str;
        public String meth(String s){
            return this.str;
        }

        //String ans = meth();
    }
    
    public static class B extends A{//
        String str;
        public String meth(String str){
            return this.str;
        }
    }

    public static void main(String[] args) {
        
        B obj = new B();
        String ans = obj.meth("kk");/////
        String ans1 = obj.meth("ooo");/////

    }
}