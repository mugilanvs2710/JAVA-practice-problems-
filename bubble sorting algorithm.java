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
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        System.out.println("Array after "+(i+1)+" step: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
        }
        System.out.println("Array after sorting");
        for(int a=0;a<n;a++){
            System.out.print(arr[a]+" ");
        }
    }
}