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
        char upperCh = lowerToUpper(ch) ;
        System.out.println("Converted from upper to lower: "+lowerCh);
        System.out.println("Converted from lower to upper: "+upperCh);
    }
    public static char upperToLower(char ch){
        int ans = ch | ' ' ;

        return (char) ans ;
     }
    // Trick 2. Convert lowercase character to uppercase

    public static char lowerToUpper(char ch){
        int ans = ch & '_' ;

        return (char) ans ;
    }
}
/*
Converted from upper to lower: n
Converted from lower to upper: N
 */