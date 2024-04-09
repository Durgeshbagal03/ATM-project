package AtmMachineProject;

import java.awt.*;
import java.util.Scanner;

public class Functions {
    float balance;
    int pin=5454;
    Scanner sc=new Scanner(System.in);


    public void checkpin()
    {
        System.out.println("Enter your Pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin==pin)
        {
            Menu();
        }
        else{
            System.out.println("Enter a valid Pin");
            checkpin();
        }
    }
    public void Menu()
    {
        System.out.println("Enter your Choice: ");
        System.out.println("1.Check A/C balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposite Money");
        System.out.println("4.Exit");

        int opt=sc.nextInt();
        if (opt == 1) {
            CheckBalance();
        }
        else if(opt==2)
        {
            WithdrawMoney();
        }
        else if(opt==3)
        {
            DepositeMoney();
        }
        else if(opt==4)
        {
            Exit();
        }
        else{
            System.out.println("Enter a Valid Choice");
            Menu();
        }

    }

    public void CheckBalance()
    {
        System.out.println("Balance :" + balance);
        Menu();
    }

    public void WithdrawMoney()
    {
        System.out.println("Enter the amount to withdraw");
        float amount=sc.nextFloat();
        if(amount<=balance)
        {
            System.out.println("Money Withdraw Succesfully");
            balance=balance-amount;
            Menu();
        }
        else {
            System.out.println("Insufficient balance in your account");
            Menu();
        }
    }

    public void DepositeMoney()
    {
        System.out.println("Enter the Amount");
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposited Succefully");
        Menu();
    }
    public void Exit()
    {
        System.out.println("Thank you for visiting our ATM");
    }



}


