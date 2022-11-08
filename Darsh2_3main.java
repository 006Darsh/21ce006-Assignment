// Name :- Aswani Darsh
// Roll-no :-21ce006
// Aim :-Use the Account class created in Programming Exercise 1 to simulate an ATM machine. 
// • Create 10 accounts in an array with id 0, 1, . . . , 9, and an initial balance of $100. 
// • The system prompts the user to enter an id. If the id is entered incorrectly, ask the user to enter a correct id. 
// • Once an id is accepted, the main menu is displayed. 
// • You can enter choice 1 for viewing the current balance, 2 for withdrawing money, 3 for depositing money, and 4 for exiting the main menu. 
// • Once the system starts, it will stop by entering number 99.

import java.util.*;
    
    public class Darsh2_3main
     {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String id = "";
            String id2 = "";
            boolean flag = true;
            int choice;
            double amt;
            ArrayList<Atm> people = new ArrayList<Atm>();//creating an arraylist named people and using it to acccess the class Atm's constructor creating the default account 
            for (int i = 1; i <= 10; i++) {
                people.add(new Atm());//creates 10 account
            }
            System.out.print("Enter Your Account Number (ex:AC00x): ");
            id = sc.next();
            int userNumber = userID(id, people);
    
            while (flag) {//asking the tasks of the Atm to user until user exits.
                System.out.println();
                System.out.println("Make a choice......");
                System.out.println("1.Balance inquiry ");
                System.out.println("2.Withdraw money ");
                System.out.println("3.Deposit money");
                System.out.println("99.Exit ");
                choice = sc.nextInt();//asking user to make choice for using functions of the atm
                switch (choice) {//accordingly using the metods created in the ATm class.
                    case 1 -> {
                        System.out.println("Account Number : " + id);
                        System.out.println("Current Balance : " + people.get(userNumber).getBalance());
                    }
                    case 2 -> {
                        System.out.print("Enter Amount To Withdraw : ");
                        amt = sc.nextDouble();
                        people.get(userNumber).withdraw(amt);
                    }
                    case 3 -> {
                        System.out.print("Enter Amount To Deposit : ");
                        amt = sc.nextInt();
                        people.get(userNumber).deposit(amt);
                    }
                    case 99 -> {
                        flag = false;
                        System.out.println("---------------------------Thank you-------------------------------");
                    }
                    default -> System.out.println("Make a valid choice..");
                }
            }
    
        }
    
        public static int userID(String id, ArrayList<Atm>people) {//checks if the entered userId exists or not if yes the return the an number which assigned to a specific entered
                                                                   //userId and helps to use the account accordingly.
            Scanner s = new Scanner(System.in);
            int user = 10000;
            int i;
            for (i = 0; i < people.size(); i++) {
                if (id.equals(people.get(i).getId())) {
                    user = i;
                    break;
                }
            }
            if (i == people.size()) {
                System.out.println("No Such Account Exists.\nTry Again..");
                System.out.print("Enter your account id :");
                id = s.next();
                return userID(id, people);
            } 
            else 
            return user;
        }
    }
