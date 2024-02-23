package newBank.Model;
import lombok.Data;
import lombok.ToString;

import java.util.*;
@Data
@ToString

public class Account {
    private String accountNumber;
    private Person person;
    private double balance;
    private List<Transaction> transactionHistory;

//    private ArrayList<String> transactionalRegister = new ArrayList<>();
//    private ArrayList<String> codeNumberList = new ArrayList<>();
//    private static Set<String> associatedUsers = new HashSet<>();

    public Account(Person person, double balance) {
        this.accountNumber = generateAccountNumber();
        this.person = person;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public Account( Person person, double balance, List<Transaction> transactionHistory) {
        this.accountNumber = generateAccountNumber();
        this.person = person;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    private String generateAccountNumber() {
        List<String> accountNumbers = new ArrayList<>();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }
        for (String accountNumber : accountNumbers) {
            if (accountNumber.equalsIgnoreCase(sb.toString())) {
                generateAccountNumber();
            }
        }
        accountNumbers.add(sb.toString());
        return sb.toString();
    }

    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }


//    // Method to generate a unique account number
//    private String generateAccountNumber() {
//        Set<String> existingAccountNumbers = new HashSet<>();
//        for (Account account : Bank.accountList) {
//            existingAccountNumbers.add(account.getAccountNumber());
//        }
//
//        Random random = new Random();
//        String newAccountNumber;
//        do {
//            StringBuilder accountNumberBuilder = new StringBuilder();
//            for (int i = 0; i < 10; i++) {
//                accountNumberBuilder.append(random.nextInt(10));
//            }
//            newAccountNumber = accountNumberBuilder.toString();
//        } while (existingAccountNumbers.contains(newAccountNumber));
//
//        return newAccountNumber;
//    }
//------------------------------------------------------
    // Method to add transaction to transaction history


//    //C-R-U-D
//    // Create
//    public boolean addNewAccount(Account account) {
//        for (Account a : Bank.accountList) {
//            if (a.getAccountNumber().equals(account.getAccountNumber())) {
//                return false;
//            }
//        }
//        Bank.accountList.add(account);
//        return true;
//    }
//    public boolean checkBalance(Account account) {
//        if (Bank.accountList != null)
//            for (Account a : Bank.accountList) {
//                System.out.println("account = " + a);
//                return true;
//            }
//        return false;
//    }
//
//    public double quiryBalance(String idNumber, String password) {
//        for (Account a : Bank.accountList) {
//            if (a.getOwner().getIdNumber().equals(idNumber) && a.getOwner().getPassword().equals(password)) {
//
//                return a.getBalance();
//            }
//        }
//        return 0;
//    }
//    Consultar las transacciones que tuvo una cuenta en un periodo determinado.
//    Obtener un porcentaje de gastos y de ingresos dado el mes. A la vez debe discriminar los gastos según la categoría.


//    // Method to calculate total expenses
//    public long getTotalExpenses() {
//        long totalExpenses = 0;
//        for (Transaction transaction : transactionHistory) {
//            if (transaction.getOriginAccount().equals(accountNumber)) {
//                totalExpenses += transaction.getBalanceAmount();
//            }
//        }
//        return totalExpenses;
//    }
//
//    // Method to calculate total income
//    public long getTotalIncome() {
//        long totalIncome = 0;
//        for (Transaction transaction : transactionHistory) {
//            if (transaction.getOriginAccount().equals(accountNumber)) {
//                totalIncome += transaction.getBalanceAmount();
//            }
//        }
//        return totalIncome;
//    }
//
//    // Method to calculate expense percentage
//    public double getExpensePercentage() {
//        long totalExpenses = getTotalExpenses();
//        long totalIncome = getTotalIncome();
//
//        if (totalIncome == 0) {
//            return 0; // Avoid division by zero
//        }
//
//        return (double) totalExpenses / totalIncome * 100;
//    }
//
//    // Method to calculate income percentage
//    public double getIncomePercentage() {
//        long totalIncome = getTotalIncome();
//        long totalExpenses = getTotalExpenses();
//
//        if (totalIncome == 0) {
//            return 0; // Avoid division by zero
//        }
//
//        return (double) totalIncome / (totalIncome + totalExpenses) * 100;
//    }

}

