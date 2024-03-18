import java.util.Scanner;

public class MoonInbae_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        int ans = 1;
        for(int i = 0; i<a.length()/2; i++)
            if(a.charAt(i) != a.charAt(a.length()-1-i)) {
                ans = 0;
                break;
            }
        System.out.println(ans);
    }
}