package com.codewithme;

interface A1{
     void show();
}
/*
class B extends A1{
    public void show(){
        System.out.println("display something In Class B...");
    }
}

 */

class LamdaExpression{
    public static void main(String args[]){

        A1 obj = ()-> System.out.println("display something In Class B...");
        obj.show();

    }
}