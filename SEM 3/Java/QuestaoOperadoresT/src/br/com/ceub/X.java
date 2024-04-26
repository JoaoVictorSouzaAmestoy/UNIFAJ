package br.com.ceub;

/********* CLASSE X **********/

public class X {

    public void op1() {

        System.out.print("|X|Z");

        op2();

    }

    public void op2() {

        System.out.print("||X||");

    }

    public static void main(String args[]) {
        X x = new X();
        x.op1();
        X y = new Y();
        y.op1();

    }

}