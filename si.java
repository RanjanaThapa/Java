import java.util.Scanner;
class si{
    public static void intrest(){
        Scanner ob = new Scanner(System.in);
        int p,t,r,i;
        System.out.println("Enter principle");
        p=ob.nextInt();
        System.out.println("Enter Time");
        t=ob.nextInt();
        System.out.println("Enter Rate");
        r=ob.nextInt();
        i=p*t*r/100;
        System.out.println("Intrest="+i);
    }
    public static void main(String[] argv){
     intrest();
    }
}