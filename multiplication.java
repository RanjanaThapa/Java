import java. util. Scanner;

 class multiplication {
    public static void main(String[]argv)
    {
        int i,a,n;
        Scanner ob= new Scanner("system.in");
        System.out.println("enter a number");
        n=ob.nextInt();
        for(i=1;i<=10;i++){
        a=n*i;
        System.out.println(n+"x"+ i+"="+a);}
    
    ob.close();
        }
}
