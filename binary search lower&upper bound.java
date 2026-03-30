import java.util.*;
class Main{
    public static int lowerbound(int arr[],int find,int n){
        int low =0;
        int high =n-1;
        int lb=1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==find){
                lb=mid;
                high=mid;
            }
            else if(arr[mid]<find){
                high=mid+1;
            }
            else{
                high = mid;
            }
        }
        return lb;
    }
    public static void main(String args[] ){
        Scanner s = new Scanner(System.in);
        int l= s.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++){
            arr[i]=s.nextInt();
        }
        int find=s.nextInt();
        int lb=lowerbound(arr,find,l);
        System.out.println("the lower bound is : "+lb);
        }
}