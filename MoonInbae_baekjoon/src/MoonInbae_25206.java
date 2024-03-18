import java.util.ArrayList;
import java.util.Scanner;

public class MoonInbae_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> point = new ArrayList<>();
        ArrayList<Float> grade = new ArrayList<>();
        int idx = 0;
        while(idx < 20) {
            sc.next();
            point.add((int) sc.nextFloat());
            switch(sc.next()) {
                case "A+":
                    grade.add((float) 4.5);
                    break;
                case "A0":
                    grade.add((float) 4);
                    break;
                case "B+":
                    grade.add((float) 3.5);
                    break;
                case "B0":
                    grade.add((float) 3.0);
                    break;
                case "C+":
                    grade.add((float) 2.5);
                    break;
                case "C0":
                    grade.add((float) 2.0);
                    break;
                case "D+":
                    grade.add((float) 1.5);
                    break;
                case "D0":
                    grade.add((float) 1.0);
                    break;
                case "F":
                    grade.add((float) 0);
                    break;
                case "P":
                    grade.add((float) -1);
                    break;
            }
            idx++;
        }
        sc.close();
        int maxPoint = 0;
        float sumPG = 0;
        for(int i=0; i<point.size(); i++) {
            if(grade.get(i) != -1) {
                maxPoint += point.get(i);
                sumPG += point.get(i)*grade.get(i);
            }
        }
        float result = sumPG / maxPoint;
        System.out.printf("%.6f", result);
    }
}