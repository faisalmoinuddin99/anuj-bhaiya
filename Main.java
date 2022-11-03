import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] interval1 = {1, 3};
        int[] interval2 = {2,6};
        int[] interval3 = {8,10};
        int[] interval4 = {15,18};
//        int[] interval5 = {2, 6};
//[1,3],[2,6],[8,10],[15,18]
        int[][] intervals = {interval1, interval2, interval3, interval4};

        int [][] ans = merge(intervals) ;
        for (int []i :ans){
            for (int j : i){
                System.out.print(j);
            }
        }
    }

    public static int[][] merge(int[][] intervals) {


        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        ArrayList<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {
            if (list.isEmpty()) {
                list.add(interval);
            } else {
                int prevInterval[] = list.get(list.size() - 1);
                if (interval[0] < prevInterval[1]) {
                    // overlapping
                    prevInterval[1] = Math.max(prevInterval[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]) ;
    }
}

// [[1,6][8,10],[15,18]]