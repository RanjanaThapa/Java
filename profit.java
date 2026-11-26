// import java.util.Scanner;
// class profit {
// public static void main(String[] argv)
// {
//     int cp,sp;
//     Scanner ob = new Scanner("system.in");
//     System.out.println("enter selling price");
//     sp=ob.nextInt();
//     System.out.println("enter cost price");
//     cp=ob.nextInt();
//     if(sp>cp)
//     {
//         System.out.println("profit="+(sp-cp));
//     }
// else{
//     System.out.println("loss="+(cp-sp));
// }
// }
// }  

import java.util.Scanner;

class profit {
    public static void main(String[] argv) {
        int cp, sp;
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter selling price:");
        sp = ob.nextInt();
        
        System.out.println("Enter cost price:");
        cp = ob.nextInt();
        
        if (sp > cp) {
            System.out.println("Profit = " + (sp - cp));
        } else {
            System.out.println("Loss = " + (cp - sp));
        }
        
    }
}
