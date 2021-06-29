package com.company.newjavacode;

import java.util.Scanner;
public class gitjava
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//Scanner
        int min=1000, max=200000;//For Generating Random Number
        int random=(int)Math.floor(Math.random()*(max-min+1)+min);
        int code=4456;
        System.out.println("Welcome To Apna ATM ");
        System.out.println("Choose Your Bank \n\t\t1.State Bank Of India\n\t\t2.Bank Of India\n\t\t3.Union Bank Of India\n\t\t4.Punjab Bank Of India");
        int bank = sc.nextInt();
        switch (bank)
        {
            case 1:
                System.out.println("welcome To, State Bank Of India");
                break;
            case 2:
                System.out.println("welcome To, Bank Of India");
                break;
            case 3:
                System.out.println("welcome To, Union Bank Of India");
                break;
            case 4:
                System.out.println("welcome To, Punjab Bank Of India");
                break;
        }
        if(bank>4)
        {
            System.out.println("Invalid!\nYour Choice Isn't In The LIst");
        }
        else
        {
            System.out.println("Enter Your Atm Code Here");
            int n = sc.nextInt();
            int count = 0;
            while(n !=0)
            {
                n=n/10;
                ++count;
            }
            if (count >4  || count <3 )
            {
                System.out.println("Invalid Code! \nCode Must Be In 4 Digit, Better Luck Next Time !");
            }
            else
            {
                System.out.println("How May I Help you \n\t\t1.Withdraw Money\n\t\t2.Check your Total Amount");
                int services = sc.nextInt();
                switch (services)
                {

                    case 1:
                        System.out.println("Your Total Amount is RS " + random);
                        System.out.println("Enter Amount You Want To Withdraw");
                        int money = sc.nextInt();
                        int rest = random-money;
                        System.out.println("Congratulation! Rs " + money + " Is Withdraw Successfully ");
                        System.out.println("Now,Your Rest Amount Is Rs "+ rest );
                        break;
                    case 2:
                        System.out.println("Your Total Amount is RS " + random);
                        break;
                }
                System.out.println("Thanks For Visiting !");

            }
        }
    }
}
