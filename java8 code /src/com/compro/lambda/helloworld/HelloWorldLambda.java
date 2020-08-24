package com.compro.lambda.helloworld;

public class HelloWorldLambda {
    public static void main(String[] args) {
        
    	//implementing sayHelloWorld Using Lambda
        HelloWorldInterface helloWorldInterface = () -> "Hello World";


        System.out.println(helloWorldInterface.sayHelloWorld());
    }
}
