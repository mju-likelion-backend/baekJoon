import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoonInbae_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>(List.of(sc.nextLine().trim().split(" ")));
        sc.close();
        for(int i=0; i<l.size(); i++) {
            if(l.get(i).equals("")) {
                l.remove(i);
            }
        }
        System.out.println(l.size());
    }
}