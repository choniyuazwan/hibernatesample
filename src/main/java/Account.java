import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "accountNumber")
    private int accountNumber;

    @Column(name = "accountName")
    private String accountName;

    @Column(name = "openDate")
    private String openDate;

    @Column(name = "balance")
    private int balance;

    @Column(name = "cif")
    private int cif;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }
}
