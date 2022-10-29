import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        String s = "Mr John Smith          ";
        replaceWhiteSpace(s.toCharArray(), s.trim().length());

    }

    public static void replaceWhiteSpace(char[] str, int trueLength) {
        System.out.println(trueLength);
        // calculate whiteSpace in true length string
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        int index;
        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) {
            str[trueLength] = '\0';
        }
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        System.out.println(str);
    }
}
/*
Mr%20John%20Smith
 */