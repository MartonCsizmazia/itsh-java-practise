package com.codecool;

import java.util.Arrays;

class GapInPrimes {

    public static boolean isPrime(int number){
        for(int i = 2; i<=number; i++){
            if (i==number){
                return true;
            } else if(number%i==0){
                return false;
            }
        }
        return false;
    }


    public static long[] gap(int g, long m, long n) {
        // your code
        long[] longArray = new long[2];
        boolean isFilled = false;

        for(long i = m; i<=n- (long) g; i++){
            if(isPrime((int)i)){
                if(isPrime((int)i+g)){
                    for(int j = (int) i+1; j<=i+g; j++){
                        if (j == (int) (i+g)){
                            longArray[0]=i;
                            longArray[1]=i+ (long) g;
                            isFilled = true;
                        } else if (isPrime(j)){
                            break;
                        }
                    }
                    if(isFilled){
                        break;
                    }
                }
            }
        }
        if(!isFilled){
            return null;
        } else {
            return longArray;
        }

    }
}
