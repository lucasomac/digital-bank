abstract class Account implements IAccount {
    protected int agency = 1;
    protected int number;
    protected double balance;
    private static int SEQUENCE = 1;
    protected Client client;

    Account(Client client) {
        this.client = client;
        number = SEQUENCE++;
    }

    @Override
    public void toWrest(double value) {
        this.balance -= value;
    }

    @Override
    public void toTransfer(double value, Account destination) {
        this.toWrest(value);
        destination.toDeposit(value);
    }

    @Override
    public void toDeposit(double value) {
        this.balance += value;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    protected void printAccountData() {
        System.out.printf("Titular ==> %s%n", client.getName());
        System.out.printf("Agência ==> %d%n", agency);
        System.out.printf("Múmero ==> %d%n", number);
        System.out.printf("Saldo ==> %f%n", balance);
    }
}
