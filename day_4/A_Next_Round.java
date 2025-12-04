import java.util.Scanner;

public class A_Next_Round {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] contestans = new int[n];
        for (int i=0; i<n; i++){
            contestans[i]=in.nextInt();
        }
        int finisher = contestans[k-1];
        int count=0;
        for( int i=0; i<n; i++){
            if(contestans[i]>0){
            if(contestans[i]>=finisher){
                count++;
            }
        }

        
    }
    System.out.println(count);
}
}
