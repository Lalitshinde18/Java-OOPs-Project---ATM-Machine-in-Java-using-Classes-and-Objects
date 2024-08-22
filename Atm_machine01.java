package Atm_Machine;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class ATM {
     float Balance ;
     int PIN = 1187;

     public void checkpin(){
         System.out.println("Enter  Your Pin:");
         Scanner sc =new Scanner(System.in);
         int enterdpin =sc.nextInt();
         if(enterdpin==PIN){
             menu();
         }
         else {
             System.out.println("Enter a Valid Pin");
             menu();
         }
     }
     public void menu(){
         System.out.println("Enter Your Choice:");
         System.out.println("1. Check A/C Balance");
         System.out.println("2. Withdraw Money");
         System.out.println("3.Deposite Money");
         System.out.println("4.EXIT");


         Scanner sc = new Scanner(System.in);
         int opt=sc.nextInt();

         if(opt==1){
             checkBalance();
         }
         else if(opt==2){
             WithdrawMoney();

         }
         else if(opt==3){
             DepositMoney();

         } else if (opt==4) {
             return;
         }
         else{
             System.out.println("Enter a Valid Choice");

         }
     }
     public void checkBalance(){
         System.out.println("Balance " + Balance);
         menu();

     }
    public void WithdrawMoney(){
        System.out.println("enter Amount to Withdraw:");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        if(Amount>Balance){
            System.out.println("Insufficint balance");

        }
        else {
            Balance = Balance - Amount;
            System.out.println("Money Withdraw Successful");


        }
        menu();
    }
    public  void DepositMoney(){
        System.out.println("Enter The Amount:");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        Balance = Balance  + Amount;
        System.out.println("Money Deposited Successfully");
    menu();
    }




}




public class Atm_machine01 {

    public static void main(String[] args) {

    ATM obj =new ATM();
    obj.checkpin();
    }
}
