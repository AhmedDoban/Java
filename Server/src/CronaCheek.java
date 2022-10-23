public class CronaCheek {
    private String name ;
    private int Temperature;
    private int Stomic;
    private int Fever;
    private int hedic;


public CronaCheek(String pa,int te,int st,int fe,int he){
    setName(pa);
    setTemperature(te);
    setStomic(st);
    setFever(fe);
    setHedic(he);
}
    public int getHedic() {
        return hedic;
    }

    public void setHedic(int hedic) {
        String stomic1="you are not good you must go to doctor";
        String stomic2="you are good man";
        if(hedic==0){
            System.out.println(stomic2);
            this.hedic=hedic;
        }
        else
            System.out.println(stomic1);
            this.hedic=hedic;
    }
    public int getFever() {
        return Fever;
    }

    public void setFever(int fever) {
        String stomic1="you are not good you must go to doctor";
        String stomic2="you are good man";
        if(fever==0){
            System.out.println(stomic2);
            this.Fever=fever;
        }
        else
            System.out.println(stomic1);
        this.Fever=fever;
    }
    public int getStomic() {
        return Stomic;
    }

    public void setStomic(int stomic) {
    String stomic1="you are not good you must go to doctor";
    String stomic2="you are good man";
        if(stomic==0){
            System.out.println(stomic2);
            this.Stomic=stomic;
        }
        else
            System.out.println(stomic1);
             this.Stomic=stomic;
    }


    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int temperature) {
    String te="you are not good you must go to doctor \n you must take برامول or بروفين";
        if(temperature<37){
             System.out.println(te);
             this.Temperature=temperature;
        }

        else if(temperature==37){
            String te2="you are good man";
            System.out.println(te2);
            this.Temperature=temperature;
        }
        else
            System.out.println("you are not good you must go to doctor \n you must take برامول or بروفين");
            this.Temperature=temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
        else
            System.out.println("you must type a name ");
    }
}