package Lecture10;

public class min_form_ith_index {
    public static void main(String[] args) {
        System.out.println("min_form_ith_index");
       
        int[] arr = {4,-1,5,3,2,1,7};
         SelectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public  static  void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int mini = min_form_ith_index_2(arr, i);
            int swap = arr[i];
            arr[i] = arr[mini];
            arr[mini] = swap;
        }
    }
    public static int min_form_ith_index_2(int[] arr, int i){
        int mini = i ; 
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini = j;
            }
        }
        return  mini;
    }
}
