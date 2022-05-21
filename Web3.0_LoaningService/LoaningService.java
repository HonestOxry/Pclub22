import java.util.*;
public class LoaningService {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        lender lr=new lender();                     //object lr of class lender
        
        System.out.println("Enter the details ");    // to enter details
        
        System.out.println("Enter the Name ");
        String name=sc.nextLine();
       
        System.out.println("Enter the Age ");
        int age=sc.nextInt();
        
        System.out.println("Enter the Contact Number ");
        String contactno=sc.next();
      
        System.out.println("Enter the Bank Name  ");
        String bankname=sc.next();
       
        System.out.println("Enter the Loan Amount ");
        float loan_amount=sc.nextFloat();
      
        System.out.println("Enter the Credit Score ");
        int creditscore=sc.nextInt();
       
        System.out.println("Enter the Account Number ");
        String acountnumber=sc.next();
       
        System.out.println("Enter the Annual Income ");    
        long income=sc.nextLong();
        
     lr.enter_detalis(name, age, contactno, bankname, loan_amount, creditscore, acountnumber, income);  
      // lr.enter_detalis("Keval", 20, 9632587410, "Sbi Bank", 500000, 700, 3652147852362589, 400000);
        lr.check_for_loan();        //checks whether loan can be granted or not

    }


    
}


    
