public class stability {
    public static void main(String[] args) {
        int[] arr={7,3,4,7,8,1};
        //applying bubble sort
        //Bubble sort

        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1]){
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


//        for (int i=0;i<arr.length-1;i++)
//        {
//            int ind=0;
//            int min=Integer.MAX_VALUE;
//            for (int j=i;j<arr.length;j++)
//            {
//                if (arr[j]<min)
//                {
//                    min=arr[j];
//                   ind=j;
//                }
//
//            }
//            int temp=arr[i];
//            arr[i]=arr[ind];
//            arr[ind]=temp;
//        }
//        for (int element:arr)
//        {
//            System.out.print(element+" ");
//        }

    }

}
