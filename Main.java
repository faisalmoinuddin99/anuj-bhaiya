import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
            Important Properties:
            Bit Hacks — Part 4 (Playing with letters of the English alphabet)
         */

        // Trick 1. Convert uppercase character to lowercase
        char ch = 'n' ;
        char lowerCh = upperToLower(ch) ;
        System.out.println(lowerCh);
    }
    public static char upperToLower(char ch){
        int ans = ch | ' ' ;

        return (char) ans ;
     }
}
