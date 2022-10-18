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

        //  1. Convert uppercase character to lowercase
        char ch = 'd' ;
        System.out.println("Input from use: " + ch);
        char lowerCh = upperToLower(ch) ;
        char upperCh = lowerToUpper(ch) ;
        System.out.println("Converted from upper to lower: "+lowerCh);
        System.out.println("Converted from lower to upper: "+upperCh);

        char invertAlpha = invertAlphabet(ch) ;
        System.out.println("Invert the alphabet: "+ invertAlpha);

        int positionOfAlpha = positionOfAlphabet(ch) ;
        System.out.println("Position: " + positionOfAlpha);
    }
    public static char upperToLower(char ch){
        int ans = ch | ' ' ;

        return (char) ans ;
     }
    //  2. Convert lowercase character to uppercase

    public static char lowerToUpper(char ch){
        int ans = ch & '_' ;

        return (char) ans ;
    }
    // 3. How can we invert the alphabet’s case?

    public static char invertAlphabet(char ch){
        int ans = ch ^ ' ' ;
        return (char) ans ;
    }

    // 4. Find a letter’s position in alphabet
    public static int positionOfAlphabet(char ch){
        int position = ch & 31 ;
        return position ;
    }
}
/*
Input from use: j
Converted from upper to lower: j
Converted from lower to upper: J
Invert the alphabet: J
 */