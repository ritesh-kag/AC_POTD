import java.util.Scanner;
 
public class A_Theatre_Square{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long m = in.nextInt();
        long a = in.nextInt();
        int result = (int)(Math.ceil((double)n/a)*Math.ceil((double)m/a));
        System.out.println((result));
    }
}
