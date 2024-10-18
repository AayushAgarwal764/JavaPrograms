
import java.util.Scanner;

public class restaurantMenu {

    public static void main(String[] args) {
        int typeOfMealChoice = 0;

        int breakfastChoice = 0;
        int lunchChoice = 0;
        int dinnerChoice = 0;

        int requiredQuantityOfBreakfast = 0;
        int requiredQuantityOfLunch = 0;
        int requiredQuantityOfDinner = 0;

        int totalBillAmount = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("**********Welcome to Code Restaurant!!!**********");
            System.out.println("What would you like to have?");
            System.out.println("1. Breakfast");
            System.out.println("2. Lunch");
            System.out.println("3. Dinner");
            System.out.println("0. Exit\n");
            System.out.println("Enter your choice:");
            typeOfMealChoice = sc.nextInt();

            if (typeOfMealChoice == 1) {
                int currentSelectedItemPrice = 0;
                System.out.println("You selected Breakfast.\nWhat would you like to order");
                System.out.println("1. Dosa     Price: Rs.20");
                System.out.println("2. Idli     Price: Rs.25");
                System.out.println("3. Poha     Price: Rs.30");
                System.out.println("0. Exit\n");

                System.out.println("Enter you choice:");
                breakfastChoice = sc.nextInt();

                if (breakfastChoice == 1) {
                    currentSelectedItemPrice = 20;
                }
                if (breakfastChoice == 2) {
                    currentSelectedItemPrice = 25;
                }
                if (breakfastChoice == 3) {
                    currentSelectedItemPrice = 30;
                }

                if (breakfastChoice == 1 || breakfastChoice == 2 || breakfastChoice == 3) {
                    System.out.println("Enter Quantity:");
                    requiredQuantityOfBreakfast = sc.nextInt();
                    System.out.println("Your meal is ready! Enjoy your meal!!\n");
                }

                totalBillAmount = totalBillAmount + (requiredQuantityOfBreakfast * currentSelectedItemPrice);
                String result = "Current Total Bill Amount: " + totalBillAmount;
                System.out.println(result);

                if (breakfastChoice == 0) {
                    System.out.print("Your Total Bill Amount is:");
                    System.out.println(totalBillAmount);
                }
            }

            if (typeOfMealChoice == 2) {
                int currentSelectedItemPrice = 0;
                System.out.println("You selected Lunch.\nWhat would you like to order");
                System.out.println("1. Mattar Paneer   Price: Rs.50");
                System.out.println("2. Sandwich        Price: Rs.60");
                System.out.println("3. Rice Plate      Price: Rs.50");
                System.out.println("0. Exit\n");

                System.out.println("Enter you choice:");
                lunchChoice = sc.nextInt();

                if (lunchChoice == 1) {
                    currentSelectedItemPrice = 50;
                }
                if (lunchChoice == 2) {
                    currentSelectedItemPrice = 60;
                }
                if (lunchChoice == 3) {
                    currentSelectedItemPrice = 50;
                }

                if (lunchChoice == 1 || lunchChoice == 2 || lunchChoice == 3) {
                    System.out.println("Enter Quantity:");
                    requiredQuantityOfLunch = sc.nextInt();
                    System.out.println("Your meal is ready! Enjoy your meal!!\n");
                }

                totalBillAmount = totalBillAmount + (requiredQuantityOfLunch * currentSelectedItemPrice);
                String result = "Current Total Bill Amount: " + totalBillAmount;
                System.out.println(result);

                if (lunchChoice == 0) {
                    System.out.print("Your Total Bill Amount is:");
                    System.out.println(totalBillAmount);
                }

            }
            if (typeOfMealChoice == 3) {
                int currentSelectedItemPrice = 0;
                System.out.println("You selected Dinner.\nWhat would you like to order");
                System.out.println("1. Dosa                Price: Rs.20");
                System.out.println("2. Curry Rice Plate    Price: Rs.30");
                System.out.println("3. Pizza               Price: Rs.90");
                System.out.println("0. Exit\n");

                System.out.println("Enter you choice:");
                dinnerChoice = sc.nextInt();

                if (dinnerChoice == 1) {
                    currentSelectedItemPrice = 20;
                }
                if (dinnerChoice == 2) {
                    currentSelectedItemPrice = 30;
                }
                if (dinnerChoice == 3) {
                    currentSelectedItemPrice = 90;
                }

                if (dinnerChoice == 1 || dinnerChoice == 2 || dinnerChoice == 3) {
                    System.out.println("Enter Quantity:");
                    requiredQuantityOfDinner = sc.nextInt();
                    System.out.println("Your meal is ready! Enjoy your meal!!\n");
                }

                totalBillAmount = totalBillAmount + (requiredQuantityOfDinner * currentSelectedItemPrice);
                String result = "Current Total Bill Amount: " + totalBillAmount;
                System.out.println(result);

                if (dinnerChoice == 0) {
                    System.out.print("Your Total Bill Amount is:");
                    System.out.println(totalBillAmount);
                }

            }
            if (typeOfMealChoice == 0) {
                System.out.print("Your Total Bill Amount is: ");
                System.out.print(totalBillAmount);
                System.out.println(" Please pay at the reception\n");
                totalBillAmount = 0;
            }
        } while (typeOfMealChoice != 0);
        sc.close();
    }
}
