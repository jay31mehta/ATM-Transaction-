
package atm1;

import java.util.Scanner;

class ATM extends cash_withdrawn
{
    
 public static void main(String arg[])
         

{
    System.out.println("Minimum balance is 1000");
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter the PIN:");
    int check=scan.nextInt();
    
    System.out.println("RE-check the PIN:"+check);
    
    int pin=1234;
    
    
    if(pin==check) 
    {
        System.out.println("Enter 1 for cash-withdrawn");
        System.out.println("Enter 2 for wish-deposited");
        System.out.println("Enter 3 exit");
        int a=scan.nextInt();
        switch(a)
        {
            
            case 1:
                   cash_withdrawn b=new cash_withdrawn();
                   b.getdata();
                   
                    break;
            case 2:
                    cash_deposite c=new cash_deposite();
                    c.getdata1();
                    break;
            
            case 3:
                    
                   break;
            default:
                System.out.println("Enter correct number");
                    
        }
    }
    else
    {
        System.out.println("Wrong PIN, please Enter the right PIN");
    }
}
 
 
 
 
 
}    



