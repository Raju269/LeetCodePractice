package Lecture10;

public class Inseration {
    public static void main(String[] args) {
        System.out.println("Inseration Sort");
        int[] arr = {1,2,7,8,9,11,4};
//        InserationSort(arr, arr.length-1);
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
        }
    }
    public  static   void Sort(int[] arr){
        for(int i =1; i<arr.length;i++){
            InserationSort(arr,i);
        }
    }
    public  static  void InserationSort(int[] arr, int i){
        int item = arr[i];
        int j = i-1;
        while(j>=0&&arr[j]>item){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
    
    }
}
