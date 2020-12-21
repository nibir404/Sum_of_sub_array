public class SUB_SUM {
    public static void main(String[] args) {
        int a[] = {-2,3,5,-5,7,1};
        System.out.println("Maximum contagious sum is "+maxSubSUmArray(a));
    }

    static int maxSubSUmArray(int[] a){
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending=0;

        for(int i=0; i<size; i++){
            max_ending = max_ending + a[i];
            if (max_so_far < max_ending)
                max_so_far = max_ending;
            if (max_ending < 0)
                max_ending = 0;
        }
        return max_so_far;
    }
}
