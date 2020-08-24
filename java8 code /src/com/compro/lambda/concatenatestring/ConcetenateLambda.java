package com.compro.lambda.concatenatestring;

public class ConcetenateLambda {

    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (a,b) -> a + " " + b;
        System.out.println(concatenateInterface.sconcat("Hello", "World : Welcome to india"));
    }
}
