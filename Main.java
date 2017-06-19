/*
* This application is designed to output the
* list of corrupt Philippine govt officials
* once the user entered the name of the
* official it will output his or her position
* and the pocketed money.
* Created by lbabay on 6/18/2017.
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to the top three most corrupt " +
                "official in the Philippines");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String again = "y";


            while (again.equalsIgnoreCase("y")) {
                System.out.print("Enter the official's name: ");
                String kurakoteers = sc.nextLine();

                Culprits culprits = CulpritsCollection.getCulprits(kurakoteers);

                String output = "\nKurakot ng bayan\n" +
                        "Name: " + kurakoteers + "\n" +
                        "Position: " + culprits.getPosition() + "\n" +
                        "Stolen money: " + culprits.getPocketedMoneyFormatted() + "\n";
                System.out.println(output);

                System.out.print("Enter another name? (y/n)");
                again = sc.nextLine();
                System.out.println();
            }

            sc.close();
            System.out.println("Magnanakaw!!!");
        }
    }


