package com.company;

public class Main {

    public static long calcFactorial(int n){
        long sum=1;
        for (int k=n; k>0; k--){
            sum=sum*k;
        }
        return sum;
    }

    public static double calcE(){
        int counter=1;
        double e=1;
        double olde=0;
        while(e-olde > .0001){
            olde=e;
            e=olde + 1.0/calcFactorial(counter);
            counter++;
            }
        return e;
    }

    public static double calcEX(int x){
        int counter=1;
        double e=1;
        double olde=0;
        while(e-olde > .0001){
            olde=e;
            e=olde + Math.pow(x, counter)/calcFactorial(counter);
            counter++;
        }
        return e;
    }

    public static void main(String[] args) {
	    for (int j=1; j<=10;j++){
	        long a = calcFactorial(j);
	        System.out.println(a);
        }
	    System.out.println();
        for (int j=1; j<=20;j++){
            long b = calcFactorial(j);
            System.out.println(b);
        }

        double e = calcE();
        System.out.printf("e is %2.3f \n", e);

        for (int x = 1; x<=5; x++){
            double c = calcEX(x);
            System.out.printf("e is %2.3f \n", c);
        }


    }
}

