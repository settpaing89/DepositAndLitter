/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author aungsettpaing
 */
import java.util.Scanner;

public class DepositAndLitter {
    private int males;
    private int females;
    private int malesDoNotDepositAndLitter;
    private int femalesDoNotDepositAndLitter;

    public void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of males: ");
        males = input.nextInt();
        System.out.print("Enter the total number of females: ");
        females = input.nextInt();
    }

    public void calculate() {
        malesDoNotDepositAndLitter = (int) (0.75 * males);
        femalesDoNotDepositAndLitter = (int) (0.25 * females);
    }

    public void displayOutput() {
        System.out.println("Number of males who do not deposit and litter: " + malesDoNotDepositAndLitter);
        System.out.println("Number of females who do not deposit and litter: " + femalesDoNotDepositAndLitter);
    }

    public static void main(String[] args) {
        DepositAndLitter depositAndLitter = new DepositAndLitter();
        depositAndLitter.getInput();
        depositAndLitter.calculate();
        depositAndLitter.displayOutput();
    }
}

