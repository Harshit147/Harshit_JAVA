import java.util.Scanner;
class MultiplicativeGCD{
    public static void main(String[]args){
        int a,b,q,r,t1,t2,t, z=0;
        int temp=r1;
        int r1,r2;
        Scanner Scan= new Scanner(System.in);
        System.out.println("enter first number a");
        a=Scan.nextInt();
        System.out.println("enter first number b");
        b=Scan.nextInt();
        r1=a;
        r2=b;
        while(r2>0){
            q=r1/r2;
            r=r1-(q*r2);
            r1=r2;
            r2=r;
            t=t1-(q*t2);
            t1=t2;
            t2=t;
        }
        if(r1==1){
            z=t1;
        }
        if(t1<temp){
            t1=t1+temp;

        }

        
        System.out.println("GCD=" +r1+ "t="+t1);

        System.out.println("MultiplicativeGCD " +z);
    }
}
 

