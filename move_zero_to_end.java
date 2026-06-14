import java.util.Scanner;

public class move_zero_to_end {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Taking length of array as input
        System.out.println("enter length of array");
        int n=s.nextInt();

        int []arr=new int[n];
        //optimised approach time complexity is o(n)
        //Taking array input
//        class Solution {
//            void pushZerosToEnd(int[] arr) {
//                // code here
//                int n=arr.length;
//                int num=0;
//                ArrayList <Integer> list=new ArrayList<>();
//                for(int i=0;i<n;i++){
//                    if(arr[i]!=0){
//                        list.add(arr[i]);
//
//
//
//                    }
//                }
//
//                for(int i=0;i<n;i++)
//                {
//                    if(arr[i]==0){
//
//                        list.add(arr[i]);
//                    }
//
//                }
//
//                for(int i = 0; i < n; i++) {
//                    arr[i] = list.get(i);
//                }
//            }
//        }

        System.out.println("enter array");
        for (int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        //first is used to pass no of passes
        //in second loop we are checking if zero swap it and take it to last index
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (arr[j]==0)
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for (int element:arr)
        {
            System.out.print(element+" ");
        }

    }
}
