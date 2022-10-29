public class Main {
    public static void main(String[] args) {

        String s1 = "cat" ;
        String s2 = "act" ;

       boolean result =  isPermutated(s1,s2);
        System.out.println(result);
    }
    public static boolean isPermutated(String s1, String s2) {
        boolean[] flag = new boolean[s1.length()] ;

        for (int i = 0 ; i < s1.length(); i++){
            for(int j = 0 ; j < s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    flag[i] = true ;
                    break ;
                }
            }
        }

        if (!checkBooleanArray(flag)){
            return false ;
        }
        return true ;
    }

    public static boolean checkBooleanArray(boolean[] a){
       boolean tracker = true ;
        for (int i = 0 ; i<a.length; i++){
            if (a[i] == false){
                tracker = false ;
                break ;
            }
        }
        return tracker ;
    }
}
