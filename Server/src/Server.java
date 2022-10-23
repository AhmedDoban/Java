import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
    public static void main(String[] args) {
        try {
            int port=12;
            CronaBrain brain= new CronaBrain();
            Cronaa ch=new Cronaa();
            ServerSocket ServerSocket = new ServerSocket(port);
            System.out.println("wating for client connetion");
            Socket connectionSoket = ServerSocket.accept();
            System.out.println("connected");
            DataInputStream input = new DataInputStream(connectionSoket.getInputStream());
            DataOutputStream outputStream=new DataOutputStream(connectionSoket.getOutputStream());
       loop: while (true){
                int message = input.readInt();
                switch (message) {
                    case 1:
                        // add
                        System.out.println("what is the medicine do you want to add it ?");
                        //taking input from clint
                        String name= input.readUTF();
                        String forwhat= input.readUTF();
                        String phar = input.readUTF();
                        String location= input.readUTF();
                        //add it to array
                        Pharmacy newbrain=new Pharmacy(name,forwhat,phar,location);
                        brain.add(newbrain);
                        break;
                    case 2:
                        //remove
                        System.out.println("what is the medicine do you want to remove it ?");
                        // display items to user
                        String mediciner= brain.display();
                        outputStream.writeUTF(mediciner);
                        if(!mediciner.isEmpty()){
                            DataInputStream remove = new DataInputStream(connectionSoket.getInputStream());
                            int me=remove.readInt();
                            //remove the item
                            brain.remove(me);
                            String afre= brain.display();
                            outputStream.writeUTF(afre);
                        }
                        else
                            outputStream.writeUTF("the list is empty add some of medicine and try again");
                        break;
                    case 3:
                        //update
                        String up= brain.display();
                        outputStream.writeUTF(up);
                        if(!up.isEmpty()){
                        DataInputStream update = new DataInputStream(connectionSoket.getInputStream());
                        int updatee=update.readInt();
                        String namee= input.readUTF();
                        String forwhate= input.readUTF();
                        String phare = input.readUTF();
                        String locatione= input.readUTF();
                        Pharmacy newbraine=new Pharmacy(namee,forwhate,phare,locatione);
                        brain.update(updatee,newbraine);
                        String updateee= brain.display();
                        outputStream.writeUTF(updateee);
                        }
                        else
                            outputStream.writeUTF("the list is empty add some of medicine and try again");
                        break;
                    case 4:
                        //reade the medicine  sending data to user
                        System.out.println("what is the medicine do you want to read it ?");
                        String medicine= brain.display();
                        if(medicine.isEmpty()){
                            medicine="the list is empty add some of medicine and try again ";
                        }
                        outputStream.writeUTF(medicine);
                        break;
                    case 5:
                        //testing
                        System.out.println("we will test your crona persent  ");
                        //taking input from user
                        String patint= input.readUTF();
                        int tempreture= input.readInt();
                        int stomic = input.readInt();
                        int Fever= input.readInt();
                        int hedic= input.readInt();
                        //add it  to array
                        CronaCheek newee=new CronaCheek(patint,tempreture,stomic,Fever,hedic);
                        ch.add2(newee);
                        // display the patiant information
                        String pat= ch.displayy();
                        outputStream.writeUTF(pat);
                        //the result of test
                        String tempreture1=ch.display_tempreture();
                        outputStream.writeUTF(tempreture1);
                        String stomic1=ch.display_stomic();
                        outputStream.writeUTF(stomic1);
                        String Fever1=ch.display_fever();
                        outputStream.writeUTF(Fever1);
                        String hedic1=ch.display_hedic();
                        outputStream.writeUTF(hedic1);
                        String advance=ch.advance();
                        //remove the patiant data
                        outputStream.writeUTF(advance);
                        ch.remove_pa();
                        break;
                    case 6:
                        //sening data to user about near farmacy
                        System.out.println("please enter the your location ");
                        Socket socket = ServerSocket.accept();
                        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
                        out.println("please enter the your location  طنطا - 1  \t زفتى  - 2 \t المنصوره - 3 ");
                        //takin input
                        DataInputStream pharmacy = new DataInputStream(connectionSoket.getInputStream());
                        int x = pharmacy.readInt();
                        switch (x) {
                            case 1:
                                out.println("الجامعه  :  the nearest pharmacy is");
                                break;
                            case 2:
                                 out.println("الشعب :  the nearest pharmacy is");
                                break;
                            case 3:
                                out.println("the nearest pharmacy is : 19190 ");
                                break;
                        }
                        break;
                    case 7:
                        //sening data to user about near hospital
                        System.out.println("please enter the nearest hospital");
                        Socket sockete = ServerSocket.accept();
                        PrintWriter oute=new PrintWriter(sockete.getOutputStream(),true);
                        oute.println("please enter the your location  طنطا - 1  \t زفتى  - 2 \t المنصوره - 3 ");
                        //takin input
                        DataInputStream hospital = new DataInputStream(connectionSoket.getInputStream());
                        int y = hospital.readInt();
                        switch (y) {
                            case 1:
                                 oute.println("   مستشفى الجامعه  :  the nearest hospital is  ");
                                break;
                            case 2:
                                 oute.println("مستشفى زفتى العام   :  the nearest hospital is ");
                                break;
                            case 3:
                                 oute.println("عمر ابن الخطاب    :  the nearest hospital is ");
                                break;
                        }

                        break;
                    case 8 :
                        break loop;
                }
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }


}