package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    int counter = 0;

    public static void main(String[] args) {
        //initialize
        App SimpleMath = new App();

        //get integers for arithmetic use
        int numOne = SimpleMath.get_int();
        int numTwo = SimpleMath.get_int();

        //do and print each math problem
        int addition = SimpleMath.Addition(numOne, numTwo);
        int subtraction = SimpleMath.Subtraction(numOne, numTwo);
        int multiplication = SimpleMath.Multiplication(numOne, numTwo);
        int division = SimpleMath.Division(numOne, numTwo);

        //generate and print output
        SimpleMath.out(addition, subtraction, multiplication, division, numOne, numTwo);
    }

    public int get_int()
    {
        //create local variable
        String str = " ";

        //prompt for input if counter is 0 meaning no numbers have been selected yet
        if(counter == 0) {
            System.out.print("What is your first number? ");
            str = input.next();
            counter ++;
        }

        //prompt for input if counter is 1 meaning only one number has been selected
        else if(counter == 1) {
            System.out.print("What is your second number? ");
            str = input.next();
        }

        int num = convert_to_int(str);
        return num;
    }

    //keeps conversion separate from input and output
    public int convert_to_int(String str)
    {
        int num = Integer.parseInt(str);
        return num;
    }

    //doing each math problem and returning int value
    public int Addition(int numOne, int numTwo)
    {
        int output;
        output = numOne + numTwo;
        return output;
    }
    public int Subtraction(int numOne, int numTwo)
    {
        int output;
        output = numOne - numTwo;
        return output;
    }
    public int Multiplication(int numOne, int numTwo)
    {
        int output;
        output = numOne * numTwo;
        return output;
    }
    public int Division(int numOne, int numTwo)
    {
        int output;
        output = numOne / numTwo;
        return output;
    }

    //single output that is seperate from input, conversion and processes
    public void out(int addition, int subtraction, int multiplication, int division, int numOne, int numTwo)
    {
        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n",
                numOne, numTwo, addition,numOne, numTwo, subtraction,numOne, numTwo, multiplication,numOne, numTwo, division);
    }
}

