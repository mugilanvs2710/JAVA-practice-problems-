// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;

        }
        System.out.println("Array after sorting");
        for(int a=0;a<n;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
