import java.util.Arrays;
import java.util.Scanner;

public class MoonInbae_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int[] alphabet = new int['z'-'a'+1];
        for(int i=0; i<alphabet.length; i++)
            alphabet[i] = -1;
        for(int i=0; i<arr.length; i++)
            alphabet[arr[i]-'a'] = (alphabet[arr[i]-'a'] == -1) ? i : alphabet[arr[i]-'a'];
        for(int i : alphabet)
            System.out.print(i+" ");
    }
}