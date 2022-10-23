import java.util.ArrayList;
public class CronaBrain {
    private ArrayList<Pharmacy> pharmacieslist=new ArrayList<Pharmacy>();

    //add
    public void add (Pharmacy medi ){
        pharmacieslist.add(medi);
    }
    //delete
    public void remove(int medicine){
        pharmacieslist.remove((medicine));
    }
    //display
    public  String display(){
        String display="";
        for(int i=0;i< pharmacieslist.size();i++){
            display+=(i+1)+"-"+pharmacieslist.get(i).getName()+"||"+
                    pharmacieslist.get(i).getFor()+"||"+
                    pharmacieslist.get(i).getLocation()+"||"+
                    pharmacieslist.get(i).getPharmacy()+"\n";
        }

        return display;
    }
    //update
    public void update (int x ,Pharmacy newPharmacy){
        pharmacieslist.set(x,newPharmacy);
    }

}
