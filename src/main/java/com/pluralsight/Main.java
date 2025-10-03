package com.pluralsight;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] inventory = new Vehicle[20];

        int[] numbers = new int[20];
        numbers[0] = 5;
        numbers[1] = 19;

        inventory[0] = new Vehicle(2135432,"Blue", "Jeep Liberty", 250000, 7000);
        inventory[1] = new Vehicle(98676,"Black", "Chevy Impala", 120000, 2000);
        inventory[2] = new Vehicle(123456789,"Pink","Toyota Supra",120000,30000);
        inventory[3] = new Vehicle(231435648, "Emerald","Mazda MX-5",98000,10000);
        inventory[4] = new Vehicle(12893467,"Chrome Metallic","Honda S2000",28000, 45000);
        inventory[5] = new Vehicle(888888,"Charcoal","Scion TC", 223000,4000);



        int quantityOfVehicles = 0;
        int command;

       // boolean isRunning = true;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");

            command = scanner.nextInt();

            switch(command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    //cases
                    findVehiclesByPrice();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:

                    System.out.println("Have a great day!");
                 //   isRunning = false;
                    return;
                default:
                    System.out.println("INVALID ENTRY");
            } // end of switch statement

        } while(command!=6); // you can put isRunning withing the params of the while loop and that
         //while(isRunning)
        //end of do-while
        //aka end of the program



    } // end of the main method the real end of the program



    private static void listAllVehicles(){
        System.out.println("Listing out vehicles....");
        //todo: list all vehicles here...
    }
    private static void findVehiclesByPrice() {

    }

    private static void addAVehicle() {
    }


}//end of the Main class