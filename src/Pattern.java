import java.util.*;
public class Pattern {
    public static void main(String[] args) {

//        Ques1: Point N in a Single how where n is 4;
//        System.out.println("Enter the Number: ");
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1; i<=n; i++){
//            System.out.print("*");
//        }

        //Ques2: Given Integer N Point square of Ntn using "*";
//        System.out.println("Enter the Number: ");
//        Scanner scn= new Scanner(System.in);
//        int n =scn.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Ques3: Print the Triangle pattern;

//        System.out.println("Enter the Number: ");
//        Scanner scn= new Scanner(System.in);
//        int n=scn.nextInt();
//        int nst=1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nst; j++){
//                System.out.print("*");
//
//            }
//            nst++;
//            System.out.println();
//        }

//        System.out.println("Enter the Number: ");
//        Scanner scn= new Scanner(System.in);
//        int n=scn.nextInt();
//
//        int nst=1;
//        int nsp=n/2;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nsp; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=nst; k++){
//                System.out.print("*");
//            }
//            if(i<=n/2){
//                nsp--;
//                nst=nst+2;
//            }
//            else{
//                nsp++;
//                nst=nst-2;
//            }
//            System.out.println();
//        }


//    Ques5: Print the pattern

//    System.out.println("Enter the Number: ");
//    Scanner scn= new Scanner(System.in);
//    int n= scn.nextInt();
//
//    int nsp=1;
//    int nst=n/2+1;
//    for(int i=1; i<=n; i++){
//        for(int j=1; j<=nst; j++){
//            System.out.print("*");
//        }
//        for(int k=1; k<=nsp; k++){
//            System.out.print(" ");
//        }
//        for(int j=1; j<=nst; j++){
//            System.out.print("*");
//        }

//        if(i<=n/2){
//            nst--;
//            nsp=nsp+2;
//        }
//        else{
//            nst++;
//            nsp=nsp-2;
//        }
//        System.out.println();
//    }



        //Ques6: print the Triangle pattern with number;

        System.out.println("Enter the Number: ");
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int count=1;
        int val=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=count; j++){
                System.out.print(val+" ");
                val++;
            }
            count++;
            System.out.println();
        }













    }
}
