import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class common_element {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n;
        //Enter length of first array
        System.out.println("Enter length of 1st array");
        n = s.nextInt();

        int[] a = new int[n];
//Enter first array
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        //Enter length of second array
        System.out.println("Enter length of 2nd array");
        n = s.nextInt();

        int[] b = new int[n];
//Enter second array
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
        //sorting both array
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        //important case
        //Enter length of 1st array
        //8
        //Enter array elements
        //1 1 2 5 5 6 6 6
        //Enter length of 2nd array
        //4
        //Enter array elements
        //3 6 8 8
        //6


        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                //making sure index dont disturb with same value
                i++;
            } else if (a[i] > b[j]) {
                j++;

            } else if (a[i] == b[j]) {
                list.add(a[i]);
                j++;
                i++;

            }

        }
        //Printing arraylist
        for (int q = 0; q < list.size(); q++) {
            System.out.print(list.get(q) + " ");
        }

        }

    }



