package ATMMachine;


import java.util.Scanner;

class ATMM {
    float Balance;
    int  PIN  = 1234;

    public void checkPin(){
        System.out.println("Enter Your PIN: ");
        Scanner sc=new Scanner(System.in);

        int enterredPin=sc.nextInt();
        if (enterredPin==PIN){
            menu();
        }

        else
            System.out.println("Enter The valid PIN...");
       // menu();
    }
    public void menu(){
        System.out.println("Enter Your  Choice:  ");
        System.out.println("1.Check A/C Balance");
        System.out.println("2.Withdrow Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");

        Scanner  sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if (opt==1){
            checkBalance();
        }
        else if (opt==2){
          withdrawMoney();
        } else if (opt==3) {
            depositMoney();
        } else if (opt==4) {
            return;
        }
        else
            System.out.println("Enter a valid  choice..");

    }


    public void  checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successful. ");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the ammount: ");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully  ");

        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
ATMM obj=new ATMM();
obj.checkPin();
    }
}
