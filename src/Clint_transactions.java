import java.util.ArrayList;
public class Clint_transactions {
    public static ArrayList<Clint> Clint_transactions=new ArrayList<Clint>();
    //Add
    public void ADD_Clint(Clint clint){
        Clint_transactions.add(clint);
    }
    //display
    public String Display_Clints(){

        String display="";
        for(int i=0;i< Clint_transactions.size();i++){
            display+=(i+1)+" - "+Clint_transactions.get(i).getName()+"  -   "+
                    Clint_transactions.get(i).GETUserID()+"  -   "+
                    Clint_transactions.get(i).GETCardCode()+"  * \n "+
                    "balance : "+
                    Clint_transactions.get(i).GETbalance()
            ;
        }
        if(display.isEmpty()) {
            System.out.println("the list is empty add some of Clients \n");
        }
        return display;
    }

    // remove user
    public void remove(int clintID){
        Clint_transactions.remove(clintID);
    }

    //up date
    public void update(int x ,Clint clint){
        Clint_transactions.set(x,clint);
    }
}

