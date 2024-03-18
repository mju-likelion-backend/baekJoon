import java.util.Scanner;

public class MoonInbae_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] chars = new char[5][15];
        for(int i=0; i<chars.length; i++) {
            String str = sc.nextLine();
            for(int j=0; j<str.length(); j++) {
                chars[i][j] = str.charAt(j);
            }
        }
        sc.close();
        for(int k=0; k<15; k++) {
            for(int l=0; l<5; l++) {
                if(chars[l][k] != '\0') System.out.print(chars[l][k]);
            }
        }
    }
}