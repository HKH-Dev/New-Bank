package newBank;
import newBank.Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bankApp = new Bank("NewBank");
        initializeTestData(bankApp);


        System.out.println(bankApp.accountList);
        System.out.println(bankApp.transactionList);

        //System.out.println(bankApp.updateUser("05", new Person("fsdfgdgd", "67567", "fsdfsdf", "76767")));

       // System.out.println(bankApp.deleteUser("05"));
    }

    private static void initializeTestData(Bank bankApp) {
        bankApp.clientList.add(new Person("Juan", "cr 12", "01", "juan@gmail.com", "123"));
        bankApp.clientList.add(new Person("Pedro", "cr 56", "02", "pedro@gmail", "123"));
        bankApp.clientList.add(new Person("Maria", "cr 78", "03", "maria@gmail", "123"));

        bankApp.accountList.add(new Account(bankApp.clientList.get(0), 1000.0));
        bankApp.accountList.add(new Account(bankApp.clientList.get(1), 2000.0));
        bankApp.accountList.add(new Account(bankApp.clientList.get(2), 5000.0));

        bankApp.transactionList.add(new Transaction(bankApp, bankApp.accountList.get(1).getAccountNumber(), bankApp.accountList.get(0).getAccountNumber(), 50.0));


    }






}

//        int min = 0;
//        int max = 10;
//        ArrayList<Integer> accountNumbersCode = new ArrayList<>();
//        Set<String> associatedUsers = new HashSet<>();
//
//        // Generate and validate random numbers until a unique and unassociated number is found
//        int randomNumber;
//        do {
//            randomNumber = Account.codeNumber();
//        } while (!Account.validateUniqueNumber(randomNumber, accountNumbersCode, associatedUsers));
//
//        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
//    }
//}
