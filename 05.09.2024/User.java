public class User extends Bank{
    private String userName;
    private int userAge;
    private String userType;
    private int userId;
    private String netBankingPwd;
    public String userAddress;

    //private constructor

    private User(String userName,int userAge,String userType){
        this.userName = userName;
        this.userAge = userAge;
        this.userType = userType;
    }

    //Factory method

    public static User createVipCustomer(String userName,int userAge,String userType){
        if(userType == "NRI"){
            return new User(userName,userAge,"VIP NRI customer");
        }
        else{
            return new User(userName,userAge,userType);
        }
    }
    
    //setter

    public void setUserId(int userId){
        this.userId = userId;
    }
    public void setNetBankingPwd(String pwd){
        this.netBankingPwd = pwd;
    }

    //getter

    public int getUserId(){
        return userId;
    }
    public String getnetBankingPwd(){
        return netBankingPwd;
    }
    public String getUserName(){
        return userName;
    }
    public int getUserAge(){
        return userAge;
    }
    public String getUserType(){
        return userType;
    }
}
