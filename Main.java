public class Main {
    public static void main(String[] args) {
        int [] a = {8,4,2,1} ;
        int app1 = countInversionApproach1(a) ;
        int n = a.length ;
        System.out.println(app1);
        for (int i: a){
            System.out.print(i + " ");
        }
        mergeSort(a,0,n - 1);
        System.out.println();
        for (int i: a){
            System.out.print(i + " ");
        }
    }

    public static int countInversionApproach1(int [] a){
        int cnt = 0 ;
        for (int i = 0 ; i < a.length; i++){
            for (int j = i ; j < a.length; j++){
                if (a[i] > a[j]){
                    cnt++ ;
                }
            }
        }
        return cnt ;
    }
    public static void mergeSort(int [] A, int left, int right){
        // to perform sorting array required more than one element
        int mid = 0 ;
        if(left >= right) return;
            // iska matlab array mai more than one element exist

            //  Mid calculate kr lete hai
             mid = left + ( right - left) / 2 ;

            // first wala, 0 index se mid index tak sort kr dega
            mergeSort(A,left,mid);
            // second wala, mid + 1 index se right index tak sort kr dega
            mergeSort(A,mid+1,right);
            // merge function, ye suppose lekr chal ta hai ki left array and right array sorted hai
            // aur mujhe sirf merge kr na hai
            merge(A,left,mid,right);

    }
    public static void merge(int[] A ,int left, int mid, int right){


          int merged [] = new int[right - left + 1] ;

          int idx1 = left ;
          int idx2 = mid + 1 ;
          int x = 0 ;

          while ((idx1 <= mid) && (idx2 <= right)){
              if (A[idx1] <= A[idx2]){
                  merged[x++] = A[idx1++] ;
              }else{
                  merged[x++] = A[idx2++] ;
              }
          }
        while (idx1 <= mid){
            merged[x++] = A[idx1++] ;
        }
        while (idx2 <= right){
            merged[x++] = A[idx2++] ;
        }

        for (int i = 0, j = left; i < merged.length; i++,j++){
            A[j] = merged[i] ;
        }
    }
}

/*
8 4 2 1
1 2 4 8
 */