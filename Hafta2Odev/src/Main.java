import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new User("kullanici", "123456", false);
        users[1] = new User("sirket", "123456", true);

        Arac[] aracs = new Arac[3]; // katsayısı olmayanlar true
        aracs[0] = new Arac(true,true,"SUV",10,false,10, false,true, 1.5);
        aracs[1] = new Arac(true,true,"Sedan",10,true,10, false, true);
        aracs[2] = new Arac(false,true,"Hatchback",10,true,10, true, true);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String kullanici_adi = scanner.nextLine();

        System.out.print("Pass: ");
        String pass = scanner.nextLine();

        User login_user = login(kullanici_adi, pass, users);
        if(login_user != null){

        }else{
            System.out.println("Kullanıcı adı veya parola yanlış");
        }

    }

    private static User login(String kullanici_adi, String pass, User[] users) {

        return;

        //yapım aşamasında
    }
}
