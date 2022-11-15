public class Main {


    public static void main(String[] args) {

        // Find Minimum in Rotated Sorted Array
        int[] a = { 11, 12,15,18,2,5,6,8};
        int n = a.length ;
        int ans = findMin(a, n) ;
        System.out.println(ans);
    }

    public static int findMin(int[] arr, int n) {
        int start = 0, end = n - 1;
        while (start <= end) {

            // if first element is mid or
            // last element is mid
            // then simply use modulo so it
            // never goes out of bound.
            int mid = start + (end - start) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;

            if (arr[mid] <= arr[prev]
                    && arr[mid] <= arr[next])
                return mid;
            else if (arr[mid] <= arr[end])
                end = mid - 1;
            else if (arr[mid] >= arr[start])
                start = mid + 1;
        }
        return 0;
    }
}