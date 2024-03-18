import java.util.Scanner;

public class MoonInbae_2884 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] arr = input.split(" ");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        if(m >= 45) m -= 45;
        else {
            if(h >= 1) h -= 1;
            else h = 23;
            m = 60 + (m - 45);
        }
        System.out.println(h + " " + m);
    }
}