public interface IAccount {

    void toWrest(double value);

    void toTransfer(double value, Account destination);

    void toDeposit(double value);

    void printExtract();
}
