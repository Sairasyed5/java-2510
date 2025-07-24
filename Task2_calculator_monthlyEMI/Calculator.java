package Task2_calculator_monthlyEMI;

public class Calculator {
public static void main(String[] args) {
    double OnRoadprice =2190887;
    double Downpayment =380000;
    double BankinterestRate =9.5;
    Byte Loanperiodinterest = 4;
    
    Double loanAmount =OnRoadprice - Downpayment;
    int annualInterestRate = 0;
    double montlyInterestRate = annualInterestRate/(12*100);
    int numberOfMonths = Loanperiodinterest *12;

  double onePlusPowerN=1;
  for(int i=0;i<numberOfMonths;i++){
    onePlusPowerN *=(1+montlyInterestRate);    //EMI formula  : EMI =[P*r*(1+r)^n]/[(1+r)^n-1]
  }
  double EMI =(loanAmount*montlyInterestRate*onePlusPowerN)/(onePlusPowerN-1);
  System.out.println("monthly EMI:"+Math.round(EMI));
  System.out.println("Total Payable Amount:"+Math.round(EMI*numberOfMonths));
  System.out.println("Total Loan Amount :"+loanAmount);
}
}
