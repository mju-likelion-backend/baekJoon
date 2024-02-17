import java.util.HashMap;
import java.util.Scanner;

public class Jinhyeongpark_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //해시맵으로 성적표 생성
        HashMap<String, Double> score = new HashMap<>();
        score.put("A+", 4.5);
        score.put("A0", 4.0);
        score.put("B+", 3.5);
        score.put("B0", 3.0);
        score.put("C+", 2.5);
        score.put("C0", 2.0);
        score.put("D+", 1.5);
        score.put("D0", 1.0);
        score.put("F", 0.0);

        double dSum = 0;
        double gradeSum = 0;

        for(int i = 0; i < 20; i++) {
            String subject = sc.next(); //과목명
            double d = sc.nextDouble(); //배점(비율)
            String grade = sc.next(); //등급
            if(grade.equals("P")) continue; //패스이면 넘어감
            else{
                dSum += d; //배점 더하기
                gradeSum += d * score.get(grade); //해당 등급의 점수 더하기
            }
        }
        sc.close();
        double ans = gradeSum/dSum;
        System.out.printf("%.4f", ans);
    }
}
