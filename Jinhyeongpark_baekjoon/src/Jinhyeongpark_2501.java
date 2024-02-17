import java.util.Scanner;

public class Jinhyeongpark_2501 {
    //약수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //약수를 구할 대상
        int K = sc.nextInt(); //k번째로 작은 약수를 구하기 위함
        sc.close();
        int cnt = 0;
        boolean flag = true; //k번째 약수 부재 여부


        for(int i = 1; i <= N; i ++) {
            if(K == 1) { //k가 1일 경우
                System.out.println(1); //모든 수의 가장 작은 약수 1 출력
                flag = false; //약수 존재
                break; //루프 탈출
            }
            if(N % i == 0){
                cnt++; //약수인 경우 카운트 업
            }
            if(cnt == K) { //해당 루프의 카운트와 k가 일치할 경우
                System.out.println(i); //그때의 i가 k번째 약수
                flag = false; //약수 존재
                break; //루프 탈출
            }
        }
        if (flag) System.out.println(0); //약수 부재의 경우

    }
}
