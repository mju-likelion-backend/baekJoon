import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MoonInbae_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        a = a.toUpperCase();
        char[] arr = a.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:arr)
            if(map.containsKey(c)) map.replace(c, map.get(c)+1);
            else map.put(c, 1);
        int max = 0;
        int idx = 0;
        int ridx = 0;
        boolean b = false;
        for(int i:map.values()) {
            if(i>max) {
                max = i;
                b = false;
                ridx = idx;
            }
            else if(i == max) b = true;
            idx+=1;
        }
        if(b) System.out.println("?");
        else System.out.println(new ArrayList<Character>(map.keySet()).get(ridx));
    }
}