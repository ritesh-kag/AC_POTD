import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] t = new int[100];
        int n = in.nextInt();
        for (int i=0; i<n; i++){
            t[i]=in.nextInt();
        }
        int result=0;
        for(int i=0; i<n; i++){
        if(t[i]%2!=0){
            result = 0;
        }
        else{
                result=t[i]/4+1;
            }
        System.out.println(result);
        }
        in.close();
    }
}
