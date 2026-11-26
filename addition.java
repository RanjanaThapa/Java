import java.util.Scanner;
class addition{
    public static void main(String[]args)
    {
        int a,b,add;

        Scanner ob=new Scanner (System.in);
        System.out.println("enter a value of a");
        a=ob.nextInt();
         System.out.println("enter a value of b");
        b=ob.nextInt();
        add=a+b;
        System.out.println("add="+add);

    }
}