import java.util.Scanner;
class ExtendedGCD{
    public static void main(String[]args){
        int a,b,q,r,s1,s2,s,t1,t2,t;
        int r1,r2,gcd1;
        Scanner Scan= new Scanner(System.in);
        System.out.println("enter first number a");
        a=Scan.nextInt();
        System.out.println("enter first number b");
        b=Scan.nextInt();
        r1=a;
        r2=b;
        s1=1;
        s2=0;
        t1=0;
        t2=1;

        while(r2>0){
            q=r1/r2;
            r=r1-(q*r2);
            r1=r2;
            r2=r;
            s=s1 - (q*s2);
            s1=s2;
            s2=s;
            t=t1-(q*t2);
            t1=t2;
            t2=t;
        }
        gcd1=r1;
        s=s1;
        t=t1;
        System.out.println("GCD="+gcd1+"  s= "+s1+"t="+t1+"" );
    }
}
 

