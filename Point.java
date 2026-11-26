 class Point {
    int x,y;
    public void setPoint(int a,int b)
    {
        x=a;
        y=b;
    }
    public  void show()
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
class Pointmain{
    public static void main(String[] args) {
        Point P=new Point();
        P.setPoint(100,200);
        P.show();
    }
}
