package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

         System.out.println(sqrt().sqrt1(scanner.nextDouble()));

    }

    public static AbleToSqrt<Double> sqrt(){

        return x ->Math.sqrt(x);
    }
}
@FunctionalInterface
interface AbleToSqrt<T>{
    T sqrt1(T x);
}
