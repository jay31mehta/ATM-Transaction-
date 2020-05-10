
package atm1;



import java.util.Scanner;


public class cash_deposite{

    int balance =1000;
    
    int i;
    
    
    void getdata1()
    {
        System.out.println("You have 1000rs");
        System.out.println("Enter the amount to deposite the money upto 1000 or less");
        Scanner scan2=new Scanner(System.in);
        i=scan2.nextInt();
        if(balance<=1000)
        {
            
            i=balance+i;
            System.out.println("Your New amount is:"+i);
        }
    }
}