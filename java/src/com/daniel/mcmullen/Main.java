package com.daniel.mcmullen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(multiplesOf3and5(1000L));
    }

    //EULER 1
    static long multiplesOf3and5(long input){
        long res = 0;
        for(int i = 0; i < input; i++){
            if(i % 3 == 0 || i % 5 == 0){
                res += i;
            }
        }
        return res;
    }

}
