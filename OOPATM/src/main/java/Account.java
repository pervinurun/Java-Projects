
public class Account {
    private String user_Name;
    private String password;
    private int balance ;

    public Account(String user_Name, String password, int balance) {
        this.user_Name = user_Name;
        this.password = password;
        this.balance = balance;
    }

    Account(String pervin_Ürün, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void paraYatir(int tutar ){
        balance +=tutar;
        System.out.println("Yeni bakiyeniz "+balance);
    }
    public void paraCek(int tutar ){
        if (balance - tutar <0 ){
            System.out.println("Yeterli bakiyeniz yok ");
        }
        else {
            balance -=tutar;
            System.out.println("yeni bakiyeniz "+balance);
        }
    }
    
}
