import java.util.Scanner;
class Account  {
    int ano,balance;
    String name;

    public Account()
    {
        ano=0;
        balance=0;
        name=null;
    }

    public Account(int a,int b,String x)
    {
        ano=a;
        balance=b;
        name=x; 
    }

    public Account(Account a)
    {
        ano=a.ano;
        balance=a.balance;
        name=a.name; 
    }

    public void createAccount()
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("enter account number");
        ano=ob.nextInt();
        System.out.println("enter balance");
        balance=ob.nextInt();
        System.out.println("enter name");
        name=ob.next();
    }
    public void deposite(int amt){
        balance=balance+amt;
    }
    public void withdraw(int amt){
        balance=balance-amt;
    }


    public void show()
    {
        System.out.println("ano"+ano);  
        System.out.println("balance"+balance);  
        System.out.println("name"+name);  
    }
}
 class AccountMain {
{
    public static void main(String[]args)
    {
Account a1=new Account();
Account a2=new Account(101,5000,"Ram");
Account a3=new Account(a2);
a1.createAccount();
a1.show();
a2.show();
a3.show();
a1.deposite(1000);
a1.show();
a2.deposite(1000);
a2.show();
a3.deposite(a2);
a3.show();






    }
}
    
    

