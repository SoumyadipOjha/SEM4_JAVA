import java.util.*;
public class loop{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // String a= sc.nextLine();
        // for(int i=0;i<3;i++){
        //             System.out.println(a);

        // }


        //1d array


        // int[] arr=new int[5];
        // arr[0]=1;
        // arr[2]=2;
        // arr[3]=3;
        // // for(int i=0;i<5;i++){
        // //     System.out.print(arr[i]+" ");
        // // }
        // for(int var:arr){
        //     System.out.println(var);
        // }

        //2d array
        int[][] arr=new int[2][3];
        arr[0][0]=1;
        arr[0][1]=11;
        arr[0][2]=111;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}