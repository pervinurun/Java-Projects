
import java.util.Scanner;


public class Login {
    public boolean login (Account account ){
        Scanner scanner = new Scanner (System.in);
        String user_Name;
        String password;
        
            System.out.println("Kullanıcı adı:");
            user_Name = scanner.nextLine();
            
            System.out.println("Parola:");
            password =scanner.nextLine();
            
            if(account.getUser_Name().equals(user_Name)&& account.getPassword().equals(password)){
                
                return true;
                
            }else{
                return false;
            }
        
    }
}
