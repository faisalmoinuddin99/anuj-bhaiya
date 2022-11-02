import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        [-1,0,0,3,3,3,0,0,0]
6
[1,2,2]
3
         */
        int a[] = {-1,0,0,3,3,3,0,0,0};
        int b[] = {1,2,2};
       merge (a,a.length,b, b.length);
    }

    public  static  void merge(int[] a, int m, int[] b, int n) {
        int temp = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == 0 || b[j] == 0) {
                    continue;
                } else {
                    if (a[i] > b[j]) {
                        temp = a[i];
                        a[i] = b[j];
                        b[j] = temp;
                    }
                }
            }

        }
        int index = 0;
        for (int i = 0; i < a.length ; i++){
            if (a[i] == 0 && index != b.length) {
                a[i] = b[index];
                index++;
            }
        }
        for (int i : a){
            System.out.println(i);
        }

    }
}