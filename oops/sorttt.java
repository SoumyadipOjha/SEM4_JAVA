
// import java.util.*;
// public class sorttt{
// public static int search(int[] arr,int t){
// int st=0;
// int end=arr.length;
// while(st<end){
// int mid=st+(end-st)/2;
// if(t==arr[mid]){
// return mid;
// }
// if(t<arr[mid]){
// end=mid-1;
// }
// else if(t>arr[mid]){
// st=mid+1;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// int[] arr=new int[4];
// Scanner sc=new Scanner(System.in);
// // int a=sc.nextInt();
// for(int i=0;i<arr.length;i++){
// arr[i]=sc.nextInt();
// }
// for(int i=0;i<arr.length;i++){
// for(int j=i+1;j<arr.length;j++){
// if(arr[i]>arr[j]){
// int temp=arr[i];
// arr[i]=arr[j];
// arr[j]=temp;
// }
// }
// }
// for(int i=0;i<arr.length;i++){
// System.out.println(arr[i]);
// }
// int ans=search(arr,20);
// System.out.print(ans);
// }
// }
// import java.util.*;

import java.util.*;

public class sorttt {
    public static int search(int[] arr, int t) {    
        int st = 0;
        int end = arr.length;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (t == arr[mid]) {
                return mid;
            }
            if (t < arr[mid]) {
                end = mid - 1;
            } else if (t > arr[mid]) {
                st = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {    
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int ans = search(arr, 20);
        System.out.print(ans);
        sc.close();
    }
}