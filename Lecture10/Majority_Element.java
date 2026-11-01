package Lecture10;

public class Majority_Element {
    public static void main(String[] args) {
        System.out.println("Majority_Element");
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(Moore_voting(arr));
    }
    public static int Moore_voting(int[] arr){
        int e = arr[0];
        int v = 1; 
        for(int i=1;i<arr.length;i++){
            if(e==arr[i]){
                v++;
            }else{
                v--;
                if(v==0){
                    e = arr[i];
                    v = 1;
                }
            }
        }
        return  e; 
    }
}
