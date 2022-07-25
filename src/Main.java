public class Main {
    public static void main(String[] args) {
        Client lucas = new Client("Lucas Macedo");
        Account corrente = new CheckingAccount(lucas);
        Account poupanca = new SavingsAccount(lucas);
        corrente.toDeposit(1234);
        poupanca.toDeposit(2345);
        corrente.toTransfer(34, poupanca);
        corrente.toWrest(200);
        poupanca.toWrest(379);
        corrente.printExtract();
        poupanca.printExtract();
    }
}
