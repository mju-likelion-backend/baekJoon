import java.util.Arrays;
import java.util.Scanner;

public class MoonInbae_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++)
            arr[i] = sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        for(int j=0; j<len; j++)
            System.out.println(arr[j]);
    }
}