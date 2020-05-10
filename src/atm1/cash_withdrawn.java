
package atm1;



import java.util.Scanner;


public class cash_withdrawn {
     int balance=1000;
    
    int i=0;
    
    void getdata()
    {
        if(i==0)
        {
           System.out.print("Enter the amount of wishdrawal");
           Scanner scan1=new Scanner(System.in);
           int cal=scan1.nextInt(); 
            if(cal<=1000)
            {
               System.out.println("Amount withdrawn is"+cal);
               cal=balance-cal;
               System.out.println("Now your balance is:"+cal);
            }
            else
            {
                System.out.println("Withdrawal money should be less than main balance(1000)");
            }
        }  }
    public static void main(String arg[])
    {
        cash_withdrawn b=new cash_withdrawn();
        b.getdata();
        
        
    }
}

