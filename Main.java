import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
        Sort Integers by The Number of 1 Bits
         */
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        Integer[] wrapperArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(wrapperArray, (x, b) -> Integer.bitCount(x) == Integer.bitCount(b) ? x - b :
                Integer.bitCount(x) - Integer.bitCount(b)
        );

        int p[] = Arrays.stream(wrapperArray).mapToInt(Integer::intValue).toArray() ;
        for(int i = 0; i<p.length; i++){
            System.out.println(p[i]);
        }


    }
}
