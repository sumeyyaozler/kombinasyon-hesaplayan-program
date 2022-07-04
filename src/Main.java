import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalr,total3,r,b,n;
        Scanner num =new Scanner(System.in);
        System.out.print("enter number of n :");
        n= num.nextInt();
        System.out.print("enter number of r :");
        r=num.nextInt();
        b=n-r;

        int totaln=1;
        for(int i=1;i<=n;i++){
            totaln = totaln*i;
        }


        totalr=1;
        for(int x=1;x<=r;x++){
            totalr=totalr*x;
        }


        total3=1;
        for(int y=1;y<=b;y++){
            total3=total3*y;
        }

       /* n!/(r!*(n-r)!)*/

        double result =0;
        result = result +(totaln/(totalr*total3));
        System.out.println("C(n,r):"+result);
    }
}
