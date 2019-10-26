package com.codewithme;

abstract class Writer{
    public abstract void write();
}

class Pen extends Writer{
    public void write(){
        System.out.println("i am a Pen");
    }
}
class Pencil extends Writer{
    public void write(){
        System.out.println("i am a Pencil");
    }
}
class Dotpen extends Writer{
    public void write(){
        System.out.println("i am a Dotpen");
    }
}
class Kit{
    public void display(Writer p){
        p.write();
    }
}
public class AbstractExample{
    public static void main(String args[]){
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();
        Writer dp = new Dotpen();
        k.display(p);
    }
}