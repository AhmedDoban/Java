import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        loop:while (true){
            System.out.println("1- Admin ?");
            System.out.println("2- Clint ?");
            System.out.println("3- Exit ?");
            System.out.print("Enter your Choice :  ");
            Scanner Result = new Scanner(System.in);
            int Admin_Clint = Result.nextInt();

            System.out.println("*********************************************");

            switch (Admin_Clint){
                case 1:
                    System.out.print("Enter Admin UserName :  ");
                    Scanner AdminUSername=new Scanner(System.in) ;
                    int USERNAME=AdminUSername.nextInt();
                    System.out.print("Enter Admin password :  ");
                    Scanner AdminPAssword=new Scanner(System.in) ;
                    int password=AdminPAssword.nextInt();
                    System.out.println("*********************************************");
                    Admin.ChkAdmin(USERNAME,password);
                    System.out.println("*********************************************");
                    break ;
                case 2:
                    System.out.print("Enter your id : ");
                    Scanner ID=new Scanner(System.in);
                    int Client_ID=ID.nextInt();
                    Client_page.ChkUser(Client_ID);
                    System.out.println("*********************************************");
                    break ;
                case 3:
                    System.out.println("See You Again ❤️");
                    System.out.println("*********************************************");
                    break loop;

            }
        }
    }
}
