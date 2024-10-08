import java.util.*;
           class Int_Operators{
               public static void main(String [] args){
                      Scanner sc = new Scanner(System.in);
                      System.out.print("Enter a:");
                      int a = sc.nextInt();
                      System.out.print("Enter b:");
                      int b = sc.nextInt();
                      System.out.print("Enter c:");
                      int c = sc.nextInt();

                     int m = a+b*c;
                     System.out.println("a + b * c" + "=" + m);
                     int n = a*b+c;
                     System.out.println("a * b + c" + "=" + n);
                     int x = c+a/b;
                     System.out.println("c + a / b" + "=" + x);
                     int y = a%b+c;
                     System.out.println("a % b + c" + "=" + y);


                     }
                  }
