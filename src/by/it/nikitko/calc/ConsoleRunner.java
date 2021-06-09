package by.it.nikitko.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String enteredString;
        Parser parser = new Parser();
        Printer printer = new Printer();


        while (!(enteredString=input.nextLine()).equals("end")){

            try {
               Var result = parser.calc(enteredString);
                printer.print(result);
            } catch (CalcException e) {
                System.out.println(e.getMessage());
            }

        }
    }

}
