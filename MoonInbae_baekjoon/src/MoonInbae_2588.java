import java.util.Scanner;

public class MoonInbae_2588 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int c,d,e;
        c=b/100;
        d=(b/10)%10;
        e=b%10;
        System.out.println(a*e);
        System.out.println(a*d);
        System.out.println(a*c);
        System.out.print(a*b);
    }
}