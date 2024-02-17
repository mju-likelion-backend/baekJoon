import java.util.Scanner;

public class Jinhyeongpark_10809 {
    //알파벳 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 생성 후 -1로 초기화
        int[] num = new int[26];
        for(int k = 0; k < 26; k++) {
            num[k] = -1;
        }
        //문자열 입력
        String word = sc.next();
        for(int i = 0; i < word.length(); i++) {
            char c = 'a';
            for(int j = 0; j < 26; j++) {
                if(word.charAt(i) == c) { //문자 하나씩 알파벳과 비교
                    if(num[j] == -1) num[j] = i; //처음 등장하는 인덱스
                } c++;
            }
        }
        for(int n:num) { //출력
            System.out.print(n + " ");
        }
        sc.close();
    }
}
