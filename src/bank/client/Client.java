package bank.client;

import bank.concretecommand.CloseAccount;
import bank.concretecommand.OpenAccount;
import bank.invoker.BankApp;
import bank.receiver.Account;
import command.Command;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("ABC");
        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);
        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
