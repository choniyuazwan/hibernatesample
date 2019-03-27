import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cif")
    private int cif;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "primaryAccount")
    private int primaryAccount;

    @Column(name = "primaryWallet")
    private int primaryWallet;

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(int primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public int getPrimaryWallet() {
        return primaryWallet;
    }

    public void setPrimaryWallet(int primaryWallet) {
        this.primaryWallet = primaryWallet;
    }
}
