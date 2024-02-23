package newBank.Model;

import lombok.Data;
import newBank.Model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
public class Bank {
    private String bankName;
    public static ArrayList<Person> clientList = new ArrayList<>();
    public static ArrayList<Account> accountList = new ArrayList<>();
    public static ArrayList<Transaction> transactionList = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }


    // Method to add transaction to global transaction list
    public static void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public static Boolean updateUser(String id, Person persona){
        for (Person person : Bank.clientList) {
            if(person.getIdNumber().equals(id)){
                person.update(persona);
                System.out.println("Updated Client");
                return true;
                }
        }
        return false;
    }

    public static Boolean deleteUser(String id){
        for (Person person : Bank.clientList) {
            if(person.getIdNumber().equals(id)) {
                Bank.clientList.remove(person);
                System.out.println("Client removed");
                return true;
            }
        }
        return false;
    }
}
