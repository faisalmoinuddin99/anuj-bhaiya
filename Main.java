import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        String s1 = "abcd" ;
        String s2 = "dabc" ;

        boolean check = isPermutatedUsingXOR(s1,s2) ;
        System.out.println(check);

    }
    public static boolean isPermutatedUsingXOR(String s1, String s2){

        String s3 =  s1.concat(s2) ;

        int result = 0 ;

        for (int i = 0 ; i < s3.length(); i++){
            result = result ^ s3.charAt(i) ;
        }
        if (result != 0){
            return false ;
        }
        return true ;
    }
}
