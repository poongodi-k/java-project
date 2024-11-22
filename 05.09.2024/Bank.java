public class Bank{
    public String bankName;
    public String bankAddress;
    public String branchName;
    private String branchManager;
    private String ifscCode;

    //setter

    public void setBranchManager(String branchManager){
        this.branchManager = branchManager;
    }
    public void setIfscCode(String ifscCode){
        this.ifscCode = ifscCode;
    }

    //getter

    public String getBranchManager(){
        return branchManager;
    }
    public String getIfscCode(){
        return ifscCode;
    }
}