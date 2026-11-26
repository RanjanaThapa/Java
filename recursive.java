class recursive{
    public static void show(int n)
    {
        if(n>1)
        {
            show(n-1);
        }
        System.out.println("computer");
    }
    public static void main(String[] args) {
        show(5);
    }
}
