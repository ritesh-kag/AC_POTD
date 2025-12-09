import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        int x =0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i = 0; i< str.length; i++){
            str[i]=in.next();
        }
        for(int i = 0; i< str.length; i++){
            if(str[i].equals("++X")||(str[i].equals("X++"))){
                    ++x;
            }
            if(str[i].equals("--X")||(str[i].equals("X--"))){
                    --x;
            }
        }
        System.out.println(x);
    }
}
