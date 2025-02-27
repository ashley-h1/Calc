//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        //instantiate a Calc object
        Calc myCalculator = new Calc();
        double n1 = 0;
        double n2 = 0;
        //get user input for two numbers
        Scanner scan = new Scanner(System.in);
        int score = 0;
        //input for num1
        while (score == 0){
            System.out.println("Please enter the first number: ");
            String input1 = scan.nextLine();
            if (checkInput(input1) == false){
                System.out.println("Numbers only");
            } 
            else{
                n1 = Double.parseDouble(input1);
                score = 1;
            }
        //input for num2
        }
        while (score == 1){
            System.out.println("Please enter the second number: ");
            String input2 = scan.nextLine();
            if (checkInput(input2) == false){
                System.out.println("Numbers only");
            }
            else{
                n2 = Double.parseDouble(input2);
                score = 3;
            }
        }
        scan.close();

        //pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        //output from Calc instance
        System.out.println(myCalculator);

        //examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        //calling Calc methods directly
        //can use a local variable for sum if you need that value for another calculation
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        //or if you don't, then just display the difference, product and quotient
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
    public static boolean checkInput(String str){ 
        boolean validInput = false;
        try{
            Double.parseDouble(str);
            validInput = true;
            return validInput;
        } 
        catch (NumberFormatException e){
            validInput = false;
            return validInput;
        }
    }
}
