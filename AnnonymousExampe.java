package com.codewithme;

class A{
    public void show(){
        System.out.println("display something In Class A...");
    }
}
/*
class B extends A{
    public void show(){
        System.out.println("display something In Class B...");
    }
}

 */

class AnnonymousExample{
    public static void main(String args[]){

        A obj = new A()
                        {
                            public void show(){
                                System.out.println("display something In Class B...");
                            }
                        };
        obj.show();

    }
}