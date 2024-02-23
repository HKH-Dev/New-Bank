package newBank.Model;

import lombok.Data;
import lombok.ToString;
import newBank.Enum.Category;

import java.util.Scanner;

@Data
@ToString

public class Transaction {
//    private ArrayList transaction;
//    private LocalDate date;
//    private ArrayList category;
    private String originAccount;
    private String destinationAccount;
    private double balanceAmount;
        private final int tax = 200;
    private Category category;

    public Transaction(Bank bankApp, String originAccount, String destinationAccount, double balanceAmount) {
        if(verifyTransaction(bankApp, originAccount, destinationAccount, balanceAmount, tax)){
            this.originAccount = originAccount;
            this.destinationAccount = destinationAccount;
            this.balanceAmount = balanceAmount;
            this.category = category;
            System.out.println("Transaction successful");
        }else{
            System.out.println("Transaction failed");
        }

    }


    public Boolean verifyTransaction(Bank bankApp, String originAccount, String destinationAccount, double balanceAmount, int tax) {
        for (Account account : bankApp.accountList) {
            if (account.getAccountNumber().equals(originAccount)) {
                for (Account account1 : bankApp.accountList) {
                    if (account1.getAccountNumber().equals(destinationAccount)) {
                        if(account.getBalance() > (balanceAmount + tax)) {
                            for (Account account2 : bankApp.accountList) {
                                if (account2.getAccountNumber().equals(destinationAccount)) {
                                    account2.setBalance(account1.getBalance() + balanceAmount);
                                }
                                if (account2.getAccountNumber().equals(originAccount)) {
                                    account2.setBalance(account2.getBalance() - (balanceAmount + tax));
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }




//    public boolean performTransaction(double amount, Account originAccount, Account destinationAccount, Category category) {
//        Scanner scanner = new Scanner(System.in);
//        // Step 1: Check if the balance is not zero
//        if (originAccount.getBalance() == 0) {
//            System.out.println("Cannot perform transaction. Balance is zero.");
//            return false;
//        }
//        // Step 2: Request for the amount of money to be transferred
//        System.out.print("Enter the amount to transfer: ");
//        double transferAmount = scanner.nextLong();
//        System.out.println("Enter the Transaction category = " + category);
//        category = Category.valueOf(scanner.next());
//
//        // Step 3: Check if the origin account has sufficient balance
//        if (originAccount.getBalance() < (amount + tax)) {
//            System.out.println("Insufficient balance for this transaction.");
//            return false;
//        }
//
//        // Step 4: Check the account number of the destination account
//        if (destinationAccount == null) {
//            System.out.println("Destination account not found.");
//            return false;
//        }
//
//        //Step 5:  Deduct balance from the origin account
//        originAccount.setBalance(originAccount.getBalance() - (amount + tax));
//
//        //Step 6: Add balance to the destination account
//        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
//
//
////        // Log the transaction
////        Transaction transaction = new Transaction(originAccount.getAccountNumber(), destinationAccount.getAccountNumber(), amount);
////        originAccount.transactionHistory.add(transaction);
////        destinationAccount.transactionHistory.add(transaction);
//
//        // Log the transaction
//        Transaction transaction = new Transaction(originAccount.getAccountNumber(), destinationAccount.getAccountNumber(), amount);
//        originAccount.getTransactionHistory().add(transaction);
//        destinationAccount.getTransactionHistory().add(transaction);
//        originAccount.addTransaction(this);
//        destinationAccount.addTransaction(this);
//
//        System.out.println("Transaction successful.");
//        return true;
//
//    }
}



