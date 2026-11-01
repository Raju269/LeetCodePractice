package Lecture9;

public class LeetcodeQuestion3 {
    public static void main(String[] args) {
        System.out.println("915. Partition Array into Disjoint Intervals ");
        int [] arr = {5,0,3,8,6};
//        Disjoint_Intervals(arr);
        System.out.println(Disjoint_Intervals(arr));
    }
    public static int Disjoint_Intervals(int[] arr){
        int n = arr.length;
//        prefix
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
//        suffix
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            right[i] = Math.min(right[i+1],arr[i]);
        }
//        answer 
        for(int i=0;i<n;i++){
            if(left[i]<=right[i+1]){
                return i+1;
            }
        }
        return 0;
    }
}
