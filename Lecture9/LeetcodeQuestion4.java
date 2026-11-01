package Lecture9;

public class LeetcodeQuestion4 {
    public static void main(String[] args) {
        System.out.println("Disjoint_Intervals ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(SubArraySum(arr));
    }
    public static int SubArraySum(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j = i; j<arr.length;j++){
                sum += arr[j];
                ans = Math.max(ans,sum);
            }
        }
        return  ans;
    }
}
