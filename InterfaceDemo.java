package com.codewithme;

interface  Abc{
    void show();
        }

 class Implementor implements Abc{
    public void show(){
        System.out.println(" show...");
    }
 }


class InterfaceDemo{
    public static void main(String args[]){
        Abc abc = new Implementor();
        abc.show();

    }
}