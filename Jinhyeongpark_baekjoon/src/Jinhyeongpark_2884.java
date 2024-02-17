import java.util.Scanner;

public class Jinhyeongpark_2884 {
    //알람 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine(); //시간을 받음
        String nums[] = num.split(" "); //공백 기준으로 배열에 나눠 담기

        //숫자로 바꿔서 각각에 저장
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        num2 -= 45; //45분 일찍

        if(num2 < 0) { //분이 음수로 떨어질 경우
            num1 -= 1; //시간 -1
            num2 += 60; //분 +60
        }
        if(num1 < 0) { //시간이 음수로 떨어지는 경우
            num1  += 24; //시간 +24
        }
        System.out.println(num1 + " " + num2);
    }
}
