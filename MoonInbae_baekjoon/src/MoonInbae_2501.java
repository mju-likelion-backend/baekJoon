import java.util.Scanner;

public class MoonInbae_2501 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int arr[] = new int[a];
        int idx = 0;
        for(int i=1; i<=a; i++) {
            if(i>a) break;
            if(a%i == 0) arr[idx++] = i;
        }
        System.out.println(arr[b-1]);
    }
}