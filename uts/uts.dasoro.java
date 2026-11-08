public class uts.dasoro.java
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter body weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter running duration (minutes): ");
        double runDuration = input.nextDouble();
        System.out.print("Enter running speed (km/h): ");
        double runSpeed = input.nextDouble();
        System.out.print("Enter running altitude (meters): ");
        double runAltitude = input.nextDouble();

        System.out.print("Enter swimming duration (minutes): ");
        double swimDuration = input.nextDouble();
        System.out.print("Enter swimming speed (km/h): ");
        double swimSpeed = input.nextDouble();
        System.out.print("Enter swimming altitude (meters): ");
        double swimAltitude = input.nextDouble();

        System.out.print("Enter cycling duration (minutes): ");
        double cycleDuration = input.nextDouble();
        System.out.print("Enter cycling speed (km/h): ");
        double cycleSpeed = input.nextDouble();
        System.out.print("Enter cycling altitude (meters): ");
        double cycleAltitude = input.nextDouble();

        System.out.print("Enter daily calorie target: ");
        double calorieTarget = input.nextDouble();

        if (calorieTarget <= 0) {
            System.out.println("Calorie target must be greater than zero.");
        } else {
            double runCalories = (runDuration * 0.05 * weight) + (runSpeed * 0.5) + (runAltitude * 0.01);
            double swimCalories = (swimDuration * 0.04 * weight) + (swimSpeed * 0.5) + (swimAltitude * 0.01);
            double cycleCalories = (cycleDuration * 0.03 * weight) + (cycleSpeed * 0.5) + (cycleAltitude * 0.01);
            double totalCalories = runCalories + swimCalories + cycleCalories;
            double totalDuration = runDuration + swimDuration + cycleDuration;
            double avgCaloriesPerMin;
            if (totalDuration > 0) {
                avgCaloriesPerMin = totalCalories / totalDuration;
            } else {
                avgCaloriesPerMin = 0;
            }

            System.out.println("\n===== TRIATHLON TRAINING MENU =====");
            System.out.println("1. Display calories burned for each activity");
            System.out.println("2. Display total calories burned");
            System.out.println("3. Display average calories burned per minute");
            System.out.println("4. Display daily calorie target status");
            System.out.print("Choose a menu (1-4): ");
            int menuChoice = input.nextInt();

            System.out.println();

            if (menuChoice == 1) {
                System.out.printf("Running Calories  : %.2f kal%n", runCalories);
                System.out.printf("Swimming Calories : %.2f kal%n", swimCalories);
                System.out.printf("Cycling Calories  : %.2f kal%n", cycleCalories);
            } else if (menuChoice == 2) {
                System.out.printf("Total Calories Burned: %.2f kal%n", totalCalories);
            } else if (menuChoice == 3) {
                System.out.printf("Average Calories Burned per Minute: %.2f kal/min%n", avgCaloriesPerMin);
            } else if (menuChoice == 4) {
                double targetPercentage = (totalCalories / calorieTarget) * 100;
                System.out.printf("Target Percentage: %.2f%%%n", targetPercentage);

                if (targetPercentage >= 100) {
                    System.out.println("Status: Target achieved");
                } else if (targetPercentage >= 80) {
                    System.out.println("Status: Almost achieved");
                } else {
                    System.out.println("Status: Far below target");
                }
            } else {
                System.out.println("Invalid menu selection");
            }
        }

        input.close();
    }
}