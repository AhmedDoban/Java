import java.util.Scanner;

public class Admin {
   public static Clint_transactions Client=new Clint_transactions();
    static void ChkAdmin(int username,int password){

        if(username==123 && password==123){
            loop:while (true){
                System.out.println("Welcome Admin what do you want to Do 😊");
                System.out.println("1- Add New client");
                System.out.println("2- Remove client");
                System.out.println("3- upDate client Data");
                System.out.println("4- Display All Clients");
                System.out.println("5- Back");
                System.out.print("Enter your Choice :  ");
                Scanner AdminInput= new Scanner(System.in);
                int AdminData=AdminInput.nextInt();

                switch (AdminData){
                    case 1:
                        System.out.println("Add Clint option");
                        System.out.print("Enter the Client name : ");
                        Scanner ClientName =new Scanner(System.in);
                        String Client_Name=ClientName.next();
                        System.out.print("enter the Client ID : ");
                        Scanner id =new Scanner(System.in);
                        int Client_Id=id.nextInt();
                        System.out.print("enter the Client Code (3 code req): ");
                        Scanner CardCode =new Scanner(System.in);
                        int Card_Code=CardCode.nextInt();
                        Clint Clint= new Clint(Client_Name,Client_Id,Card_Code);
                        Client.ADD_Clint(Clint);
                        System.out.println("*********************************************");
                        break ;
                    case 2:
                        System.out.println("remove Client option");
                        String Cli=Client.Display_Clints();
                        System.out.println(Cli+"\n");
                        if(Cli.isEmpty()){
                            break ;
                        }
                        System.out.print("enter the Client Number you want to remove : ");
                        Scanner str=new Scanner(System.in);
                        int NumberClient=str.nextInt();
                        NumberClient--;
                        Client.remove(NumberClient);
                        System.out.print( "   is removed \n");
                        String stu1=Client.Display_Clints();
                        System.out.println(stu1+"\n");
                        System.out.println("*********************************************");

                        break ;
                    case 3:
                        System.out.println("update Clint option");
                        String Clients=Client.Display_Clints();
                        System.out.println(Clients+"\n");
                        System.out.print("Enter The Num of Client you want to update : ");
                        Scanner up=new Scanner(System.in);
                        int update= up.nextInt();
                        update--;
                        System.out.print("enter the new Client name : ");
                        Scanner Client_name =new Scanner(System.in);
                        String name_of_updateCli=Client_name.next();
                        System.out.print("enter new the Client ID : ");
                        Scanner id_of_cli =new Scanner(System.in);
                        int client_ID=id_of_cli.nextInt();
                        System.out.print("enter new the Client Code : ");
                        Scanner COde_of_Client =new Scanner(System.in);
                        int Code=COde_of_Client.nextInt();
                        Clint new_Client= new Clint(name_of_updateCli,client_ID,Code);
                        Client.update(update,new_Client);
                        String Display_new_client=Client.Display_Clints();
                        System.out.println(Display_new_client+"\n");

                        System.out.println("*********************************************");
                        break ;
                    case 4:
                        System.out.println("display Clint option");
                        String Clients_display=Client.Display_Clints();
                        System.out.println(Clients_display+"\n");
                        System.out.println("*********************************************");
                        break ;
                    case 5:
                        break loop;


                }
            }

        }
        else{
            System.out.println("You Are not an Admin 😒");
        }
    }
}
