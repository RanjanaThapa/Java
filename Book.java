 class Book {
    int x,y,z;
    public void setBook(int bookname,int author, int price)
    {
        x=bookname;
        y=author;
        z=price;
    }
        public void  show()
        {
            System.out.println("x="+x);
            System.out.println("y="+y);
            System.out.println("z="+z);
        }
        }
        

        class  Bookmain{
            public static void main(String[]args){
                Book p=new Book();
                p.setBook (1, 2, 500);
                p.show();
            }
        }

    
    

