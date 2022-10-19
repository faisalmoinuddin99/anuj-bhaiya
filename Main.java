import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        /*
            Important Properties:
          Bit Hacks – Part 5 (Find the absolute value of an integer without branching)
         */
        int n = -18 ;
        int mask = Integer.SIZE * 8 - 1  ;
        int abs = (n + mask) ^ mask ;
        System.out.println("abs(" + n +")= " + abs);

        System.out.println("Integer size: "+Integer.SIZE);
        System.out.println("Long size: "+Long.SIZE);


    }

}

/*
OUTPUT:
abs(-18)= 18
Integer size: 32
Long size: 64

 */