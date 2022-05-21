import java.util.*;

public class borrow {
    //private members
    private String name;
    private int age;
    private String contactno;

    public void details(String name,int age,String contactno){
        this.name=name;
        this.age=age;
        this.contactno=contactno;
    }
    public void show(){
        System.out.println("Details of Borrower are given below");
        System.out.println("Name :"+name+"Age :"+age+"Contact Number"+contactno);
    }

    
}
class lender extends borrow{        //class lender inherits class borrow
      //private members
    private String bankname;                             
    private float loan_amount;
    private int creditscore;
    private String acountnumber;
    private long income ;
    
     // function to get details
    public void enter_detalis(String name,int age,String contactno,String bankname,float loan_amount,int creditscore,String acountnumber,long income) {
        details(name,age,contactno);
        this.bankname = bankname;
        this.loan_amount = loan_amount;
        this.creditscore = creditscore;
        this.acountnumber = acountnumber;
        this.income = income;
    }
    //check function to grant or not-> loan 
   public void check_for_loan(){
       if(creditscore<600 && income < 200000){
           System.out.print("Loan cannot be granted");
       }
       else if(income>300000 || creditscore >600){
           System.out.print("Loan can be granted");
       }
   }

}