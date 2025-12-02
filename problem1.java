package day_1;

import java.util.Scanner;
 
public class problem1 {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        
        int k,w,n;
        k=in.nextInt();
        n=in.nextInt();
        w=in.nextInt();
        int sum=0;
        for (int i=0; i<=w; i++){
            sum+=i*k;
        }
        int borrow = sum - n;
        if(borrow<0)
        borrow=0;
        System.out.println(borrow);
    }
}