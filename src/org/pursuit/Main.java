package org.pursuit;

public class Main {
//main method
    public static void main(String[] args) {
//	// write your code here
//        Apple apple = new Apple();
//        //apple.iAmAnApple();
//
//        Apple apple2 = new Apple(){
//
//
//        }; //denotes an annon class still creting object but adding xtra code
//        System.out.println(apple.getClass());
//        System.out.println(apple2.getClass()); //tells u dnamic class type for the objet .getclass

        Mogwai mogwai = new Mogwai();
        mogwai.isGremlin();


        Mogwai gremlin = new Mogwai() {
            @Override
            public boolean isGremlin() {
                System.out.println(" I am a Parrot, and I fly with colorful feathers on my wings! But I'm anonymous, so you probably didn't know that....\n");
            return true;
            }

        };

        Parrot bird  = new Parrot() {


            @Override
            public void fly() {
                System.out.println("I am a Parrot, and I fly with colorful feathers on my wings! But I'm anonymous, so you probably didn't know that....\n");

            }
        };
        bird.fly();
//        SomeInt someInt = new SomeInt() {
//            @Override
//            public void pleaseOverrideMe() {
//                System.out.println("overriding this method once, just want to create this instance rn, can use obj mult times, don't need to use a subclass ver in future ");
//            // is a use case - annon class
//                thisIsWeird();
//
//            }
//            public void thisIsWeird() {
//                System.out.println("This is weird though, right? " + this.getClass().toString());
//            }
//        };


//
//        someInt.pleaseOverrideMe();
////        ((SomeInt) someInt).thisIsWeird();
//


        //want to access methods from another

        //compile time - all the parent classes and the mthods and runtime runs the extended classe and interfaces and abstract? and annonymosu
    }
}