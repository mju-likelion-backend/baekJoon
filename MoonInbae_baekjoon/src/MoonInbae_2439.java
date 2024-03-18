import java.util.Scanner;

public class MoonInbae_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int a=1; a<=n; a++) {
            for(int b=n-a; b>0; b--) System.out.print(" ");
            for(int c=1; c<=a; c++)  System.out.print("*");
            System.out.println();
        }
    }
}