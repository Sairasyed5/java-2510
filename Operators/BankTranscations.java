package Operators;

public class BankTranscations {
    public static void main(String[] args) {
        String AccountholderName = "saira";
        double AccountBalance = 30000;
        double depositAmount = 5000;
        double withdrawTransaction =500;
        byte numberOfTrasactions =3;
        boolean isAccountActive =true;
        double minimumBalance= 4000;
          
        if(depositAmount>0 && isAccountActive){
            AccountBalance =  AccountBalance + depositAmount;
            numberOfTrasactions++;
        }
        if( numberOfTrasactions > 0 && numberOfTrasactions <= AccountBalance && isAccountActive){
            AccountBalance =AccountBalance -numberOfTrasactions;
            numberOfTrasactions ++;
            
        }
        if(AccountBalance < minimumBalance){
            System.out.println("message: your account balance is very low");
        }
       
       System.out.println("Account Holder: " +AccountholderName);
       System.out.println("Final Account Balance:" + AccountBalance);
       System.out.println("total Transactions:" +numberOfTrasactions);
       
    }

}
