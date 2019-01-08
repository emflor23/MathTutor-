import java.util.Scanner;
// By: Emil Flores / Assignment 2 / CSD 141
public class MathTutor {
    public static void main(String... args) {
        // integer variable to store the choice
        int choice = 0;
        // scanner to get the user input
        Scanner scanner = new Scanner(System.in);
        do {
            // print the menu
            System.out.println("1.\tAddition problem\n" +
                    "2.\tSubtraction problem\n" +
                    "3.\tQuit\n" +
                    "\n" +
                    "Enter your choice (1 – 3):\n");
            choice = scanner.nextInt();
            if(choice == 1 || choice == 2) {
                // variable to store op1 random number between 0 and 999
                Integer op1 = (int) (Math.random() * 1000);
                // variable to store op2 random number between 0 and 999
                Integer op2 = (int) (Math.random() * 1000);


                String sOp1 = op1.toString();
                String sOp2 = op2.toString();
                // swap numbers if op1 has smaller length
                if (sOp1.length() < sOp2.length()) {
                    String temp = sOp1;
                    int tmp = op1;
                    op1 = op2;
                    op2 = tmp;
                    sOp1 = sOp2;
                    sOp2 = temp;
                }
                if (sOp1.length() == sOp2.length()) {
                    sOp1 = " " + sOp1;
                }
                System.out.println(sOp1);

                if (choice == 1) {
                    System.out.print("+");
                    for (int i = 0; i < (sOp2.length() - sOp1.length() - 1); i++) {
                        System.out.print(" ");
                    }
                    System.out.println(sOp2);
                    System.out.println("----");
                    System.out.println("Enter your answer: ");//Get user input
                    int x = scanner.nextInt();
                    if(x == (op1 + op2)){
                        System.out.println("You are correct!");//Inform user they are correct
                    }
                    else{
                        System.out.println("You are wrong!");//Inform user they are incorrect
                        System.out.println("Correct answer is " + (op1 + op2)); //Inform user they are correct
                    }
                } else if (choice == 2) {
                    System.out.print("-");
                    for (int i = 0; i < (sOp2.length() - sOp1.length() - 1); i++) {
                        System.out.print(" ");
                    }
                    System.out.println(sOp2);
                    System.out.println("----");
                    System.out.println("Enter your answer: "); //Get user input
                    int x = scanner.nextInt();
                    if(x == (op1 - op2)){
                        System.out.println("You are correct!"); //Inform user they are correct
                    }
                    else{
                        System.out.println("You are wrong!");//Inform user they are incorrect
                        System.out.println("Correct answer is " + (op1 - op2)); //Inform user they are correct
                    }
                }
            }else if (choice < 1 || choice > 3) {//Inform user they chose an invalid selection
                System.out.println("Not a valid choice");
                return;
            }
        } while (choice != 3);
        scanner.close();
    }
}
