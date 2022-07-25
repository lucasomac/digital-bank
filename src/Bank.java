import java.util.List;

public class Bank {
    private String name;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    private List<Account> accounts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void listClients() {
        accounts.stream().map(account -> account.client).forEach(this::printClient);
    }

    private void printClient(Client client) {
        System.out.printf("%s%n", client.getName());
    }
}
