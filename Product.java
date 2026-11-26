import java.util.Scanner;
class Product{
    int id,price;
    String pName;

    public Product()
    {
        id=0;
        price=0;
        pName=null;
    }
    public void getProduct()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter product id");
        id=ob.nextInt();
        System.out.println("Enter product name and string");
        price=ob.nextInt();
        pName=ob.next();
    }
    public void showProduct(){
        System.out.println("id="+id);
        System.out.println("pName="+pName);
        System.out.println("Price="+price);
    }

}
    class Productmain{
        public static void main(String[] args) {
            Product P=new Product ();
            P.getProduct();
            P.showProduct();
        }
    }

