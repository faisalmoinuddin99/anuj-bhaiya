public class Main {
    public static void main(String[] args) {
        int a[] = {8, 4, 2, 1};
        for (int i: a){
            System.out.print(i + " ");
        }
        System.out.println();
        divide(a, 0, a.length - 1);
        for (int i: a){
            System.out.print(i + " ");
        }

    }

    public static void divide(int[] A, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            divide(A, low, mid);
            divide(A, mid + 1, high);
            conqure(A, low, mid, high);
        }
    }

    public static void conqure(int[] A, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int x = 0;
        int b[] = new int[high - low + 1];
        while ((i <= mid) && (j <= high)) {
            if (A[i] <= A[j]) {
                b[x++] = A[i++];
            } else {
                b[x++] = A[j++];
            }
        }
        while (i <= mid) {
            b[x++] = A[i++];
        }
        while (j <= high) {
            b[x++] = A[j++];
        }
        for(int ii = 0, jj = low; ii < b.length; ii++,jj++){
            A[jj] = b[ii] ;
        }
    }
}