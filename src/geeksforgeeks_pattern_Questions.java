import java.util.Scanner;
public class geeksforgeeks_pattern_Questions {
    public static void main(String[] args) {

        // Ques1: Number Triangle Pattern.
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int count = 1;
//        int nsp = n - 1;
//        for (int i = 1; i <= n; i++) {
//            for (int k = 1; k <= nsp; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= count; j++) {
//                System.out.print(count + " ");
//            }
//            count++;
//            nsp = nsp - 1;
//            System.out.println();


        //3. Number-increasing Pyramid Pattern

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//
//        int count=1;
//        for(int i=1;i<=n; i++) {
//            int num=1;
//            for (int j = 1; j <= count; j++) {
//                System.out.print(num+" ");
//                num++;
//
//            }
//            count++;
//            System.out.println();
//        }


        //4. Number-increasing reverse Pyramid Pattern

//                Scanner scn = new Scanner(System.in);
//                System.out.println("Enter the Number: ");
//                int n = scn.nextInt();
//                int count=n;
//                for(int i=1; i<=n; i++){
//                    int num=1;
//                    for(int j=1; j<=count; j++){
//                        System.out.print(num+" ");
//                        num++;
//                    }
//                    count--;
//                    System.out.println();
//
//                }
//


//        5. Number-changing Pyramid Pattern
//                Scanner scn = new Scanner(System.in);
//                System.out.println("Enter the Number: ");
//                int n = scn.nextInt();
//                int count=1;
//                int num=1;
//                for(int i=1; i<=n; i++){
//                    for(int j=1; j<=count;j++){
//                        System.out.print(num+" ");
//                        num++;
//                    }
//                    count++;
//                    System.out.println();
//                }


        //6.Zero-One Triangle Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int count=1;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=count; j++){
//                if(count%2==0){
//                    if(j%2==0){
//                        System.out.print(1+" ");
//                    }
//                    else{
//                        System.out.print(0+" ");
//                    }
//                }
//                else{
//                    if(j%2==0){
//                        System.out.print(0+" ");
//                    }
//                    else{
//                        System.out.print(1+" ");
//                    }
//                }
//
//            }
//            count++;
//            System.out.println();
//        }


        //7. Palindrome Triangle Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int count = 1;
//        int nsp = n-1;
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int k = 1; k <= nsp; k++) {
//                System.out.print(" ");
//            }
//            int num1=count;
//            for (int j = 1; j <= count; j++) {
//
//                System.out.print(num1);
//                num1--;
//
//        }
//            int num2=2;
//            for(int l=2;l<=count; l++){
//                System.out.print(num2);
//                num2++;
//            }
//
//        count = count + 1;
//        nsp = nsp - 1;
//        System.out.println();
//    }


        // 8. Rhombus Pattern

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nsp=n-1;
//        int nst=n;
//        for(int i=1; i<=n; i++){
//            for(int j=1;j<=nsp; j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=nst; j++){
//                System.out.print("*");
//            }
//
//            nsp--;
//            System.out.println();
//
//        }




        //9. Diamond Star Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nsp=n/2;
//        int nst=1;
//
//        for(int i=1; i<=n; i++){
//            if(n/2>=i){
//                for(int j=1; j<=nsp; j++){
//                    System.out.print(" ");
//                }
//                for(int k=1; k<=nst; k++){
//                    System.out.print("*");
//                }
//                nsp--;
//                nst=nst+2;
//                System.out.println();
//            }
//            else{
//                for(int j=1; j<=nsp; j++){
//                    System.out.print(" ");
//                }
//                for(int k=1; k<=nst; k++){
//                    System.out.print("*");
//                }
//                nsp++;
//                nst=nst-2;
//                System.out.println();
//            }
//        }




        //10. Butterfly Star Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nst=1;
//        int nsp=n-2;
//        for(int i=1; i<=n; i++){
//            if(n/2>i){
//                for(int j=1; j<=nst; j++){
//                    System.out.print("*");
//                }
//                for(int k=1; k<=nsp; k++){
//                    System.out.print(" ");
//                }
//                for(int j=1; j<=nst; j++){
//                    System.out.print("*");
//                }
//
//                nst++;
//                nsp=nsp-2;
//                System.out.println();
//            }
//            else if  (i==n/2) {
//                for(int k=1; k<=n; k++){
//                    System.out.print("*");
//                }
//                System.out.println();
//
//            }
//            else{
//                for(int j=1; j<=nst; j++){
//                    System.out.print("*");
//                }
//                for(int k=1; k<=nsp; k++){
//                    System.out.print(" ");
//                }
//                for(int j=1; j<=nst; j++){
//                    System.out.print("*");
//                }
//
//                nst--;
//                nsp=nsp+2;
//                System.out.println();
//            }
//        }




        //11. Square Fill Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//
//        int nst=n;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }






        //12. Right Half Pyramid Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nst=1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nst; j++){
//                System.out.print("*");
//            }
//            nst++;
//            System.out.println();
//        }







        //13. Reverse Right Half Pyramid Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nst=n;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nst; j++){
//                System.out.print("*");
//            }
//            nst--;
//            System.out.println();
//        }





        //14. Left Half Pyramid Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nsp=n-1;
//        int nst=1;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nsp; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=nst; k++){
//                System.out.print("*");
//            }
//
//            nsp--;
//            nst++;
//            System.out.println();
//        }




        //15. Reverse Left Half Pyramid Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nst=n;
//        int nsp=0;
//
//        for(int i=1; i<=n; i++){
//
//            for(int k=1; k<=nsp; k++){
//                System.out.print(" ");
//            }
//
//            for(int j=1; j<=nst; j++){
//                System.out.print("*");
//            }
//            nst--;
//            nsp++;
//            System.out.println();
//        }





        //16. Triangle Star Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nsp=n-1;
//        int nst=1;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nsp; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=nst; k++){
//                System.out.print("*"+" ");
//            }
//            nsp--;
//            nst++;
//            System.out.println();
//        }





        //17. Reverse number Triangle Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nsp=0;
//        int nst=n;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nsp; j++){
//                System.out.print(" ");
//            }
//            int num=i;
//            for(int k=1; k<=nst; k++){
//                System.out.print(num+" ");
//                num++;
//            }
//            nsp++;
//            nst--;
//            System.out.println();
//        }






        //18. Mirror Image Triangle Pattern
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int n = scn.nextInt();
//        int nsp2=n-1;
//        int count=n;
//
//
//        int nsp=0;
//        int nst=n;
//
//        for(int i=1; i<=n-1; i++){
//            for(int j=1; j<=nsp; j++){
//                System.out.print(" ");
//            }
//            int num=i;
//            for(int k=1; k<=nst; k++){
//                System.out.print(num+" ");
//                num++;
//            }
//            nsp++;
//            nst--;
//            System.out.println();
//        }
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=nsp2; j++){
//                System.out.print(" ");
//            }
//            for(int k=count; k<=n; k++){
//                System.out.print(k+" ");
//            }
//            nsp2--;
//            count--;
//            System.out.println();
//
//        }













    }
}