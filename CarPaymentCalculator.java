import javax.swing.JOptionPane;
import java.util.Scanner;

public class CarPaymentCalculator {
//main method
	public static void main(String[] args) {
   //scanner object to take input
    Scanner scanner = new Scanner(System.in);
    String loanAmount = JOptionPane.showInputDialog("Enter the loan amount: ");
    double carLoan = Double.parseDouble(loanAmount);
    
    
    String loanLen = JOptionPane.showInputDialog("Enter the loan length in months: ");
    Double loanLength = Double.parseDouble(loanLen);
    
    String rate = JOptionPane.showInputDialog("Enter the loan interest rate for the loan: ");
    Double interestRate = Double.parseDouble(rate);
    
    String down = JOptionPane.showInputDialog("Enter the amount for any down payment: ");
    Double downPayment = Double.parseDouble(down);
    
    //if statement to test conditions
    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }
    else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }
    else {
      double remainingBalance = carLoan - downPayment;
      double months = loanLength * 12;
      double monthlyBalance = remainingBalance/ loanLength;
      double interest = (monthlyBalance * interestRate)/100;
      double monthlyPayment = monthlyBalance + interest;
      JOptionPane.showMessageDialog(null,"Your monthly payment: " + monthlyPayment);
    }

	}
}