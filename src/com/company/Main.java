package com.company;

public class Main {

    public static void calcFactorial(int n){
        int sum=1;
        for (int k=n; k>0; k--){
            sum=sum*k;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
	    for (int j=1; j<=10;j++){
	        calcFactorial(j);
        }
	    System.out.println();
        for (int j=1; j<=20;j++){
            calcFactorial(j);
        }
    }
}
