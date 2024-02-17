import java.util.Arrays;
import java.util.Scanner;

public class Jinhyeongpark_2750 {
    //수 오름차순 정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for(int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        Arrays.sort(nums);
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
        sc.close();
    }
}
