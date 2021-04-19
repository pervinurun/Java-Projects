
import java.util.Scanner;


public class ATM {
    public void calis(Account account ){
        Login login =new Login();
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Bankamıza Hoigeldiniz..");
        
        System.out.println("--------------------------");
        System.out.println("Kullnıcı girişi");
        System.out.println("--------------------------");
        int giris_hakkı= 3;
        
        while (true){
            if(login.login(account)){
                System.out.println("Giriş Başarılı ");
                break;
            }else{
                System.out.println("Giriş bAŞARISIZ ");
                giris_hakkı -=1;
                System.out.println(giris_hakkı +"giriş hakkınız kaldı");
            }
            if(giris_hakkı == 0){
                System.out.println("Giriş hakkınız bitti");
                return;
            }
        }
        System.out.println("-----------------");
        String islemler = "1. Bakiye görüntüleme \n"
                + "2. Para yatırma \n"
                + "3.Para çekme \n"
                + "Çıkış için p ye basınız...";
        System.out.println(islemler);
        System.out.println("---------------------------------");
        
        while (true){
            System.out.println("İşleminizi seçiniz....");
            String islem =scanner.nextLine();
            
            if(islem.equals("p")){
                break;
            }
            switch(islem){
                case "1" :
                    System.out.println("Bakiyeniz :"+account.getBalance());
                    break;
                case "2":
                    System.out.println("Yatırmak istdiğiniz tutarı giriniz ");
                    int tutar =scanner.nextInt();
                    scanner.nextLine();
                    account.paraYatir(tutar);
                    break;
                case "3":
                    System.out.println("çekmek istediğiniz miktarı giriniz");
                    int miktar = scanner.nextInt();
                    scanner.nextLine();
                    account.paraCek(miktar);
                    break;
                default :
                    System.out.println("Geçersiz işlem");
                    
            }
        }
        
    }
    
}
