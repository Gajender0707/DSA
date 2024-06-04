import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        System.out.println("Enter the n: ");
//        int n=scn.nextInt();
//        System.out.println("Enter the r: ");
//        int r=scn.nextInt();
//        int result=factorial(n)/(factorial(r)*factorial(n-r));
//        System.out.println("The result of ncr  is " + result);
//        int res=sum(2,39);
        System.out.println("Enter the Number: ");
        int num= scn.nextInt();
        int res=add(num,cube(num));
        System.out.println(res);



    }
    public static int cube(int a){
        return a*a*a;
    }
    public static int add(int n1, int n2){
        return n1+n2;
    }


    public static int factorial( int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;

    }

    public static int sum(int a, int b){
        int add =a+b;
        return add;
    }
}
