//just a comment for gitpractice
package com.codewithme;

abstract class LivingThings{
    public abstract void walk();
}
class Buffallo extends LivingThings{
    public void walk(){
        System.out.println("Buffallo walks by 4 legs.");
    }
}
class Penguin extends LivingThings{

    public void walk() {
        System.out.println("Penguin walks by two legs.");
    }

}
 class Animal{
    public void display(LivingThings living){
        living.walk();
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("all about animals...");
        Animal an = new Animal();
	    LivingThings penguin = new Penguin();
	    LivingThings buffallo = new Buffallo();
	    penguin.walk();
	    buffallo.walk();
	    an.display(buffallo);
    }
}
