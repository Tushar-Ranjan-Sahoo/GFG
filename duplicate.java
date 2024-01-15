import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicate {
//   public static int removedup(int a[], int n ){
//       if(n== 0 || n == 1){
//           return n;
//       }
//       int[] temp = new int[n];
//       int j = 0 ;
//       for(int i = 0 ; i<n-1;i++){
//           if(a[i] != a[i+1]){
//               temp[j++] =  a[i];
//           }
//       }
//       temp[j++] = a[n-1];
//       for(int i = 0 ; i< j; i++){
//           a[i] = temp[i];
//       }
//       return j;
//   }
//
//    public static void main(String[] args) {
//        int a[] = {1,1,1,2,2,3};
//        int n = a.length;
//        n = removedup(a,n);
//        for(int  i = 0 ; i <n ; i++){
//            System.out.print(a[i]+" ");
//        }
//    }

    //using hashset
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = {5,2,6,8,6,7,5,2,8};

        // Function call
        removeDuplicates(a);
    }
}