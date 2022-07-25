public class CheckingAccount extends Account {

    CheckingAccount(Client client) {
        super(client);
    }
    @Override
    public void printExtract() {
        System.out.println("*** Extrato conta Corrente*** ");
        printAccountData();
    }
}
