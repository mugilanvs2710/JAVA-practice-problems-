// You are using Java
import java.util.*;
class Main{
    static int size=5;
    static int st[]=new int[size];
    static int top =-1;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int st[]=new int[size];
        int top=-1;
        display();
        
    }
    public static void push(int st[],int top,int data,int size){
        if (top==size-1){
            System.out.println("Stack overflow");
            return ;
        }
        top++;
        st[top]=data;
    }
    public static void pop(int st[],int size,int top){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
    }
    public static void peek(int st[],int size,int top){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(st[top]);
    }
    public static void display(){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }
        for (int i=0;i<size;i++){
            System.out.print(st[i]+" ");
        }
    }
}