import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n=scn.nextInt();
        System.out.println("Enter the r: ");
        int r=scn.nextInt();
        int result=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("The result of ncr  is " + result);

    }

    public static int factorial( int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;

    }
}
