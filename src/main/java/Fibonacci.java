import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int firstElement = 0;
        int secondElement = 1;

        printFirstElementsOfFibonacciArray(firstElement,secondElement);

        for(int i=0;i<n;i++){
            int tempNumber = firstElement + secondElement;
            System.out.print(tempNumber + " ");
            firstElement = secondElement;
            secondElement = tempNumber;
        }
    }

    private static void printFirstElementsOfFibonacciArray(int firstElement,int secondElement){
        System.out.print(firstElement + " " + secondElement + " ");
    }
}
