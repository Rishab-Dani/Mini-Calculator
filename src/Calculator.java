import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
                System.out.println(" *********** Mini Calculator ************* ");
                while(true){
                        System.out.println();
                        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Exit");
                        System.out.print("Choice : ");
                        int Choice=0;
                        try{
                                Choice = sc.nextInt();
                        }catch (InputMismatchException e){
                                System.out.println("Enter in Digit !");
                        }sc.nextLine();

                        switch (Choice){

                                case 1 -> addition();
                                case 2 -> subtraction();
                                case 3 -> multiplication();
                                case 4 -> division();
                                case 5 -> {
                                        System.out.println("Exiting ....");
                                        System.out.println("Exited Successfully !");
                                        return;
                                }
                                default -> System.out.println("Invalid Operations !");

                        }
                }
        }

        static void addition(){
                try {
                        System.out.print("Number 1: ");
                        int num1 = sc.nextInt();
                        System.out.print("Number 2: ");
                        int num2 = sc.nextInt();
                        int result = num1 + num2;
                        System.out.println("Result :" + result);
                }catch (InputMismatchException e){
                        System.out.println(" Enter in Digits !");
                }
        }

        static void subtraction(){
                try {
                        System.out.print("Number 1: ");
                        int num1 = sc.nextInt();
                        System.out.print("Number 2: ");
                        int num2 = sc.nextInt();
                        int result = num1 - num2;
                        System.out.println("Result :" + result);
                }catch (InputMismatchException e){
                        System.out.println("Enter in Digits !");
                }
        }

        static void multiplication(){
                try {
                        System.out.print("Number 1: ");
                        int num1 = sc.nextInt();
                        System.out.print("Number 2: ");
                        int num2 = sc.nextInt();
                        int result = num1 * num2;
                        System.out.println("Result :" + result);
                }catch (InputMismatchException e){
                        System.out.println("Enter in Digits !");
                }
        }

        static void division(){
                try {
                        System.out.print("Number 1: ");
                        int num1 = sc.nextInt();
                        System.out.print("Number 2: ");

                        try {
                                int num2 = sc.nextInt();
                                double result = (double) num1 / num2;
                                System.out.println("Result :" + result);
                        } catch (ArithmeticException e) {
                                System.out.println("❌ Error: Division by zero is not allowed.");
                        }
                }catch (InputMismatchException e){
                        System.out.println("Enter in Digits !");
                }

        }
        }

