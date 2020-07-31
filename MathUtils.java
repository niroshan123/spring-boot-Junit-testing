package net.codegen.practice.models;

public class MathUtils {

    public int add(int a, int b){
        return a+b;
    }

    public  double computeCircleArea(double radius){
        return Math.PI * radius * radius;
    }

    public double divide(int a, int b){
        return (double)(a/b);
    }

    public int multiply(int x, int y){
        return x*y;
    }

    public int substitute(int p, int q){
        return p-q;
    }

}
