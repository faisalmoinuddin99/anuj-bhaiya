import java.util.HashMap;


public class Main {
    public static void main(String[] args) {


        String s1 = "good";
        String s2 = "oodg";

        boolean ans = isPermutated(s1, s2);
        System.out.println(ans);

    }

    public static boolean isPermutated(String s1, String s2) {
        // hash map
        HashMap<Character, Integer> dict = new HashMap<>();
        boolean ans = false;
        for (int i = 0; i < s1.length(); i++) {
            dict.put(s1.charAt(i), i + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (dict.containsKey(s2.charAt(i))) {
                dict.remove(s2.charAt(i));
            }
        }
        if (!dict.isEmpty()) {
            return ans;
        }
        return true;
    }
}
/*
true
 */