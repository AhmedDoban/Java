import java.util.ArrayList;

public class Cronaa {
    private ArrayList<CronaCheek> Crona = new ArrayList<>();

    //add
    public void add2(CronaCheek x) {
        Crona.add(x);
    }

    //display
    public String displayy() {
        String display = "";
        for (int i = 0; i < Crona.size(); i++) {
            display += "hi my paitant : " + Crona.get(i).getName() + "     ||      " +
                    Crona.get(i).getStomic() + "    ||     " +
                    Crona.get(i).getTemperature() + "     ||     " +
                    Crona.get(i).getFever() + "    ||     " +
                    Crona.get(i).getHedic() + "\n";
        }

        return display;
    }

    public String display_tempreture() {
        String te1="you are not good you must go to doctor \n you must take برامول or بروفين\n";
        String te2="حراه زى الفل ";
        for (int z = 0; z < Crona.size(); z++) {
            if (Crona.get(z).getTemperature() == 37) {
                System.out.println("your tempereture is good ");
                return te2;
            } else
                System.out.println("you are not good you must go to doctor \n you must take برامول or بروفين");
            return te1;
        }
        return display_tempreture();
    }
    public String display_stomic() {
        String te1="you are not good you must go to doctor";
        String te2="بطنك زى الفل اهه يءمر";
        for (int z = 0; z < Crona.size(); z++) {
            if (Crona.get(z).getStomic() == 0) {
                System.out.println("مانت زى الفل اهه يءمر");
                return te2;
            } else
                System.out.println("you are not good you must go to doctor");
            return te1;
        }
        return display_stomic();
    }
    public String display_fever() {
        String te1="you are not good you must go to doctor";
        String te2="سخونيتك زى الفل اهه يءمر";
        for (int z = 0; z < Crona.size(); z++) {
            if (Crona.get(z).getFever() == 0) {
                System.out.println("مانت زى الفل اهه يءمر");
                return te2;
            } else
                System.out.println("you are not good you must go to doctor");
            return te1;
        }
        return display_fever();
    }
    public String display_hedic() {
        String te1="you are not good you must go to doctor";
        String te2="صداعك زى الفل اهه يءمر";
        for (int z = 0; z < Crona.size(); z++) {
            if (Crona.get(z).getHedic() == 0) {
                System.out.println("مانت زى الفل اهه يءمر");
                return te2;
            } else
                System.out.println("you are not good you must go to doctor");
            return te1;
        }
        return display_hedic();
    }


    //ارشادات
    public String advance(){
        String advanece="\n للمساعدة في منع انتشار مرض كوفيد-19: \n" +
                "    1-  اغسِل يديك باستمرار. واستخدِم الماء والصابون أو محلولاً كحولياً لتعقيم اليدين.    \n " +
                "       2 - ابتعِد مسافةً آمنة عن أي شخص يسعل أو يعطس.    \n " +
                "3  - ضَع كمامة عندما لا يكون التباعد الجسدي ممكناً.   \n  " +
                "     4- لا تلمس عينيك أو أنفك أو فمك.   \n  " +
                "     5- احرص على تغطية أنفك وفمك بكوعك أو بمنديل ورقي عند السعال أو العطس.   \n  " +
                "   6 - ابقَ في المنزل إذا شعرت بالمرض.    \n  " +
                "   7 -  اطلب الرعاية الطبية إذا كنت مصاباً بالحمى والسعال وصعوبة التنفس.    \n   ";
        return advanece;
    }

    //delete
    public void remove_pa(){
        for(int i=0;i< Crona.size();i++){
            if (!Crona.isEmpty()){
                Crona.remove(i);
            }
        }
    }
}

