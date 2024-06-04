import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println("Enter the Number for Factorial: ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int f=factorial(n);
        System.out.println("Factorial is " + f);

    }

    public static int factorial( int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;

        }
        return fact;

    }
}
