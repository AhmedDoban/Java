import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Clint {
    public static void main(String[] args) {
        try {
            Socket clintSocket = new Socket("localhost" , 12);
            DataOutputStream output = new DataOutputStream(clintSocket.getOutputStream());
            DataInputStream inputStream= new DataInputStream(clintSocket.getInputStream());


            loop: while (true) {
                    Scanner input = new Scanner(System.in);
                System.out.println("*******                   Welcome in crona test                       ******\n");
                System.out.println("                   1-are you want to add  medicene                   * ");
                System.out.println("                   2-are you want to remove  medicene               **");
                System.out.println("                   3-are you want to update  medicene              ***");
                System.out.println("                   4-are you want to read  medicene               ****");
                System.out.println("                   5-do you want to test your crona persent      *****");
                System.out.println("                   6-locking for nerby pharmacy                 ******");
                System.out.println("                   7-locking for nerby hospital                *******");
                System.out.println("                   8- do you want to exit crona test          ********\n");
                System.out.print("please chose   : ");
                int secletion = input.nextInt();
                System.out.println("************************************************************");
                output.writeInt(secletion);
                switch (secletion) {
                    case 1:
                        //taking input
                        System.out.print("enter the name of medicine :  ");
                        String name= input.next();
                        System.out.print("enter the  medicine for what  :  ");
                        String forwhat= input.next();
                        System.out.print("enter pharmacy  :  ");
                        String phar = input.next();
                        System.out.print("enter the location of pharmacy :  ");
                        String location= input.next();
                        //sending input to server
                        output.writeUTF(name);
                        output.writeUTF(forwhat);
                        output.writeUTF(phar);
                        output.writeUTF(location);

                        System.out.println("************************************************************");
                        break ;
                    case 2 :
                        //showing avalible medicene
                        String mediciner =inputStream.readUTF();

                        if(!mediciner.isEmpty()){
                            System.out.println("The Available Medicines are : \n "+mediciner);
                            System.out.print("enter the number of medicine you want to removre  :  ");
                            Scanner scanner=new Scanner(System.in);
                            int remove=scanner.nextInt();
                            remove--;
                            output.writeInt(remove);
                            System.out.println("************************************************************");
                            //show medicing ofter remove
                            System.out.println("the remaining medicines are :");
                            mediciner = inputStream.readUTF();
                            System.out.println(mediciner);
                            System.out.println("************************************************************");
                        }
                           else
                              mediciner= inputStream.readUTF();
                              System.out.println(mediciner);
                              System.out.println("************************************************************");
                        break ;
                    case 3 :
                        //update

                        String up =inputStream.readUTF();
                        if(!up.isEmpty()){
                        System.out.println(up);
                        System.out.print("enter the number you want to update it : ");
                        Scanner updatee=new Scanner(System.in);
                        int update=updatee.nextInt();
                        update--;
                        output.writeInt(update);
                        System.out.print("enter the update name of medicine :  ");
                        String nameee= input.next();
                        System.out.print("enter the  update medicine for what  :  ");
                        String forwhate= input.next();
                        System.out.print("enter update pharmacy  :  ");
                        String phare = input.next();
                        System.out.print("enter the new location of pharmacy :  \n");
                        String locatione= input.next();
                        output.writeUTF(nameee);
                        output.writeUTF(forwhate);
                        output.writeUTF(phare);
                        output.writeUTF(locatione);
                        System.out.println("the list before and after update : \n");
                        String updateee =inputStream.readUTF();
                        System.out.println(updateee);
                        }
                        else
                            up= inputStream.readUTF();
                        System.out.println(up);
                        System.out.println("************************************************************");
                        break;
                    case 4 :
                        //reqwest data from server
                        String medicine =inputStream.readUTF();
                        System.out.println(medicine);
                        System.out.println("************************************************************");
                        break;
                    case 5:
                        //taking input
                        System.out.print("enter the name of you :  ");
                        String namee= input.next();
                        System.out.print("enter your tempreture  :  ");
                        int tempreture= input.nextInt();
                        System.out.print("do you have any bain in stomic  enter 0 if you didnt have enter 1 if you have  :  ");
                        int  stomic = input.nextInt();
                        System.out.print("do you have any bain in fever  enter 0 if you didnt have enter 1 if you have  :  ");
                        int  fever = input.nextInt();
                        System.out.print("do you have any bain in hedic  enter 0 if you didnt have enter 1 if you have  :  ");
                        int  hedic = input.nextInt();
                        //here iam sending data to server

                        output.writeUTF(namee);
                        output.writeInt(tempreture);
                        output.writeInt(stomic);
                        output.writeInt(fever);
                        output.writeInt(hedic);

                        //here iam wrinting patiant helsy from server

                        String pat =inputStream.readUTF();
                        System.out.println(pat);
                        String tempreture1 =inputStream.readUTF();
                        System.out.println(tempreture1);
                        String stomic1 =inputStream.readUTF();
                        System.out.println(stomic1);
                        String Fever1 =inputStream.readUTF();
                        System.out.println(Fever1);
                        String hedic1 =inputStream.readUTF();
                        System.out.println(hedic1);

                           //here iam find the % of corona

                          test(stomic,tempreture,fever,hedic);

                          //showing some advance

                        String advance =inputStream.readUTF();
                        System.out.println(advance);
                        System.out.println("************************************************************");
                        break ;
                    case 6:

                        Socket s =new Socket("localhost" , 8989);
                        BufferedReader inpute=new BufferedReader(new InputStreamReader(s.getInputStream()));
                        String answer=inpute.readLine();
                        System.out.println(answer);

                        System.out.print(" please chose :  ");
                        Scanner inputm=new Scanner(System.in);
                        int v= inputm.nextInt();
                        output.writeInt(v);

                        BufferedReader inputo=new BufferedReader(new InputStreamReader(s.getInputStream()));
                        String answe= inputo.readLine();
                        System.out.println(answe);
                        System.out.println("************************************************************");
                        break ;
                    case 7:
                        Socket y =new Socket("localhost" , 8989);
                        BufferedReader inputu=new BufferedReader(new InputStreamReader(y.getInputStream()));
                        String answeree=inputu.readLine();
                        System.out.println(answeree);
                        System.out.print(" please chose :  ");
                        Scanner hospital =new Scanner(System.in);
                                int x=hospital.nextInt();
                                output.writeInt(x);
                        BufferedReader inputl=new BufferedReader(new InputStreamReader(y.getInputStream()));
                        String answev= inputl.readLine();
                        System.out.println(answev);
                        System.out.println("************************************************************");
                                break ;

                    case 8:
                     break loop;

                }
            }



        } catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
public static void case5(int x){
        switch (x){
            case 1:
                System.out.println(" لجامعه  :  you mast go to the nearest pharmacy ");
                System.out.println("   مستشفى الجامعه  :  you mast go to the nearest hospital  ");
                break;
            case 2 :
                System.out.println("الشعب : you mast go to the nearest pharmacy");
                System.out.println("مستشفى زفتى العام   :  you mast go to the nearest hospital ");
                break;
            case 3 :
                System.out.println("you mast go to the nearest pharmacy: 19190 ");
                System.out.println("عمر ابن الخطاب    :  you mast go to the nearest hospital ");
                break;
        }

}
public static void test(int stomic,int tempreture, int fever,int hedic){
    if (stomic!=0    ||    tempreture!=37    ||  fever!=0 || hedic!=0 ){
        System.out.println("please enter the your location \n طنطا - 1  \n زفتى  - 2 \n المنصوره - 3 ");
        System.out.print("please chose  : ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        case5(r);
        if(stomic==1){
            stomic=25;
        }
        if(tempreture!=37){
            tempreture=25;
        }
        if(fever==1 ){
            fever=25;
        }
        if(hedic==1 ){
            hedic=25;
        }
        if (tempreture==37){
            tempreture=0;
        }
        int persent;
        persent=stomic+tempreture+fever+hedic;
        System.out.println("your crona persent is : " + persent+"%");
    }
  }

}
