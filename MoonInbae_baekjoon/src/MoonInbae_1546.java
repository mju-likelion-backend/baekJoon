import java.util.Scanner;

public class MoonInbae_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double max = 0;
        double sum = 0;
        for(int i=0; i<n; i++) {
            double input = sc.nextInt();
            if(max < input) max = input;
            sum += input;
        }
        sc.close();
        System.out.println(sum/max*100/n);
    }
}