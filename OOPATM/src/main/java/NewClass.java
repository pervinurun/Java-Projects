
public class NewClass {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Account account =new Account ("Pervin Ürün" , "654321",2000);
        
        atm.calis(account);
        System.out.println("Programdan çıkış yapılıyor...");

    }
    
}
