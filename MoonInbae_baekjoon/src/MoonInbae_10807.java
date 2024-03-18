import java.util.Scanner;

public class MoonInbae_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int a = sc.nextInt();
        sc.close();
        int num = 0;
        for(int b:arr) if(b==a) num++;
        System.out.println(num);
    }
}