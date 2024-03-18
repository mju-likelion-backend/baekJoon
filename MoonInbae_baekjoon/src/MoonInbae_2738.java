import java.util.Scanner;

public class MoonInbae_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int h=0; h<2; h++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] += sc.nextInt();
                }
            }
        }
        sc.close();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(j!=0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}