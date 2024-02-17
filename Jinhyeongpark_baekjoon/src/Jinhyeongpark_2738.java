import java.util.Scanner;

public class Jinhyeongpark_2738 {
    //행렬 덧셈
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //행렬의 크기
        int N = sc.nextInt(); 
        int M = sc.nextInt();
        int A[][] = new int[N][M]; //A행렬
        int B[][] = new int[N][M]; //B행렬

        //각 행렬에 저장
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                int n = sc.nextInt();
                A[i][j] = n;
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                int n = sc.nextInt();
                B[i][j] = n;
            }
        }
        sc.close();
        //더하면서 출력
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(A[i][j]+B[i][j] + " ");
            }
            System.out.println();
        }


    }
}
