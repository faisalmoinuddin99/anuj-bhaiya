public class Main {
    public static void main(String[] args) {
        int [] a = {8,4,2,1} ;
        int app1 = countInversionApproach1(a) ;
        System.out.println(app1);
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
}