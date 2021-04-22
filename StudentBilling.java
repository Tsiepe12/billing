/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentbilling;
import java.util.Scanner;

/**
 *
 * @author tsiepe
 */
public class StudentBilling {
//}
//private class calculateBill{
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
    }
    //private class calculateBill{
        public static double Tax_Rate = 14;

double tuitionFee;
double textBooksFee;
double cuponValue;
double Total;


Scanner keyboard = new Scanner(System.in);

System.out.println("Enter tuition fee: ");
tuitionFee = keyboard.nextDouble();
}
static double calculateTax ( double tuitionFee){
	return tuitionFee * Tax_Rate;


public double calculateTax ( double tuitionFee, double textBooksFee double Tax_Rate){
	return tuitionFee + textBooksFee * Tax_Rate;

// calcutes the tuition and textbook fee  plus the tax then subtracts the cupon value and displays the total
static double calculateTax ( double tuitionFee, double textBooksFee, double cuponValue double Tax_Rate){
	return tuitionFee + textBooksFee - cuponValue * Tax_Rate;

        
tuitionFee = calculate();

textBooksFee = calculate();

Tax_Rate = calculate();

System.out.println("The tuition fee is: " + tuitionFee);
System.out.println("The textbooks fee is:" + textBooksFee);
System.out.println("The cupon value is:" + cuponValue);
System.out.println("The total is:" + Total);


    }
}

