package bank.invoker;

import command.Command;

public class BankApp {
    private Command OpenAccount;
    private Command CloseAccount;
    public BankApp(Command openAccount, Command closeAccount) {
    this.OpenAccount = openAccount;
    this.CloseAccount = closeAccount;
    }

    public void clickOpenAccount() {
        System.out.println("User click open an account");
        OpenAccount.execute();
    }

    public void clickCloseAccount() {
        System.out.println("User click close an account");
        CloseAccount.execute();
    }
}
