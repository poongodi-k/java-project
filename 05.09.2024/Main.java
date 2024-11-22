public class Main {
    public static void main(String[] args) {
        User u1 =  User.createVipCustomer("Sumithra",25,"NRI");
        u1.bankName = "SBI";
        u1.bankAddress = "Puducherry";
        u1.branchName = "Lawspet";
        u1.setBranchManager("Kavirajan");
        u1.setIfscCode("SBI0056957");
        u1.setUserId(12345678);
        u1.setNetBankingPwd("abcdefg@1234");
        u1.userAddress = "Muthialpet";
        System.out.println("User name:" + u1.getUserName());
        System.out.println("User age:" + u1.getUserAge());
        System.out.println("User address:" + u1.userAddress);
        System.out.println("User Id:" + u1.getUserId());
        System.out.println("User Type:" + u1.getUserType());
        System.out.println("Net banking pwd:" + u1.getnetBankingPwd());
        System.out.println("Bank name:" + u1.bankName);
        System.out.println("Bank address:" + u1.bankAddress);
        System.out.println("Branch name:" + u1.branchName);
        System.out.println("Branch manager:" + u1.getBranchManager());
        System.out.println("Ifsc code:" + u1.getIfscCode());
    }
}
