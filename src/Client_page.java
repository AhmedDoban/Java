import java.util.Scanner;

public class Client_page {
        static void ChkUser(int Client_Id) {
            for (int i=0; i<Clint_transactions.Clint_transactions.size();i++) {
                if(Clint_transactions.Clint_transactions.get(i).GETUserID()==Client_Id){
                    loop:while (true) {
                        System.out.println("Welcome Client 😊 "+Clint_transactions.Clint_transactions.get(i).getName());
                        System.out.println("1- transfer to another Client  ");
                        System.out.println("2- Show your balance ");
                        System.out.println("3- add to your balance");
                        System.out.println("4- Back");
                        System.out.print("Enter your Choice :  ");
                        Scanner USerInput = new Scanner(System.in);
                        int USerData = USerInput.nextInt();
                        switch (USerData) {
                            case 1:
                                System.out.print("Enter user id to send money : " );
                                Scanner transfer_USer=new Scanner(System.in);
                                int newUSER=transfer_USer.nextInt();
                                for (int j=0; j<Clint_transactions.Clint_transactions.size();j++) {
                                    if(Clint_transactions.Clint_transactions.get(j).GETUserID()==newUSER){
                                        System.out.println("your balance before : " + Clint_transactions.Clint_transactions.get(i).GETbalance());
                                        System.out.print("Enter the number of money you want to send : ");
                                        Scanner Money=new Scanner(System.in);
                                        int transfare_money=Money.nextInt();

                                        long BeforeMoney=Clint_transactions.Clint_transactions.get(i).GETbalance();
                                        long BeforeMoneyNEWuser=Clint_transactions.Clint_transactions.get(j).GETbalance();

                                        Clint_transactions.Clint_transactions.get(i).setBalance(BeforeMoney-transfare_money);
                                        Clint_transactions.Clint_transactions.get(j).setBalance(transfare_money+BeforeMoneyNEWuser);

                                        System.out.println("your balance after   : " + Clint_transactions.Clint_transactions.get(i).GETbalance());
                                    }
                                }

                                System.out.println("*********************************************");
                                break;
                            case 2:
                                System.out.print("your balance is : " + Clint_transactions.Clint_transactions.get(i).GETbalance());
                                System.out.println();
                                System.out.println("*********************************************");
                                break;
                            case 3:
                                System.out.print("Enter the number you want to add to your Balance : ");
                                    Scanner New_Balance=new Scanner(System.in);
                                    long balance=New_Balance.nextLong();
                                    Clint_transactions.Clint_transactions.get(i).setBalance(balance);
                                System.out.println("*********************************************");
                                break;
                            case 4:
                                break loop;
                        }
                    }
                }
            }

        }
}


