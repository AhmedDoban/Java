public class Clint {
    private String ClintName;
    private  int USER_ID;
    private int CardCode;
    private long balance;

    public Clint(String UserName,int userID,int CarDcode){
        setUserName(UserName);
        setUserID(userID);
        setCardCode(CarDcode);
    }

    /*Get the privete ClintName and set it to constrancor*/
    public void setUserName(String ClintName) {
        if(!ClintName.isEmpty())
            this.ClintName = ClintName;
        else
            System.out.println("you must type a name ");
    }
    public String getName() {
        return ClintName;
    }
    /*Get the privete user id and set it to constrancor*/

    public void setUserID(int USER_ID){
        this.USER_ID=USER_ID;
    }
    public int GETUserID(){
        return USER_ID;
    }

    /*Get the privete CardCode and set it to constrancor*/

    public void setCardCode(int CardCode){
        this.CardCode=CardCode;
    }
    public int GETCardCode(){
        return CardCode;
    }

            //balance
    public void setBalance(long balance){
        this.balance=balance;
    }
    public long GETbalance(){
        return balance;
    }


}
