import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        String s = "US POLO DESIGN UK                 ";
        spaceManipulation(s.toCharArray(),s.trim().length());
    }
    public static void spaceManipulation(char[] s, int trueLength){
        System.out.println("trueLength " + trueLength);
      // step 1: calculate white space
        int countSpace = 0 ;
        for (int i = 0 ; i < trueLength; i++){
            if (s[i] == ' '){
                countSpace++ ;
            }
        }
        // pattern = FFFF (n) = 4 = 4 - 1
        int index = trueLength + countSpace * 3 ;
        System.out.println("total index: " + index);
        System.out.println("character array length: " + s.length);
        if (trueLength < s.length){
            s[trueLength] = '\0' ;
        }
        // iterating string in reverse order and find the white space and add our pattern
        for (int i = trueLength - 1; i >= 0; i--){
            if (s[i] == ' '){
                s[index - 1] = 'F' ;
                s[index - 2] = 'F' ;
                s[index - 3] = 'F' ;
                s[index - 4] = 'F' ;
                index = index - 4 ;
            }else{
                s[index - 1] = s[i] ;
                index-- ;
            }
        }
        System.out.println(s);
    }
}

/*
trueLength 17
total index: 26
character array length: 34
USFFFFPOLOFFFFDESIGNFFFFUK
 */