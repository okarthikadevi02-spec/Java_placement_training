package classwork1;

import java.util.Scanner;

public class Factors_of_number {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i;
        for(i=1;i*i<=n;i+=1){
            if(n%i==0){
                System.out.println(i);
                sum+=i;
                if(i!=n/i){
                    System.out.println(n/i);
                    sum+=n/i;
                }
            }

        }
        int factors_sum;
        factors_sum=sum-n;
        if(factors_sum==n){
            System.out.println("Perfect number: "+n);
        }
        else if(factors_sum>n){
            System.out.println("Abundant number: "+n);
        }
        else{
            System.out.println("Deficient number: "+n);
        }
    }
}
