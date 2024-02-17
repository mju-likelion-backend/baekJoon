import java.util.Scanner;

public class Jinhyeongpark_2439 {
    //별찍기 -2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) { //N번 반복을 위함
            for (int j = 1; j < N-i; j++) { //공백 출력용, 줄어들어야 함
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) { //별 출력용, 늘어나야 함
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
