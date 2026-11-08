import java.util.Scanner;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variables for athlete information
        double bodyWeight, altitude, dailyTarget;
        double runningDuration, runningSpeed;
        double swimmingDuration, swimmingSpeed;
        double cyclingDuration, cyclingSpeed;

        // Input athlete information
        System.out.print("Enter body weight (kg): ");
        bodyWeight = input.nextDouble();

        System.out.print("Enter altitude (m): ");
        altitude = input.nextDouble();

        System.out.print("Enter daily calorie target: ");
        dailyTarget = input.nextDouble();

        // Input running information
        System.out.print("Enter running duration (minutes): ");
        runningDuration = input.nextDouble();

        System.out.print("Enter running average speed (km/h): ");
        runningSpeed = input.nextDouble();

        // Input swimming information
        System.out.print("Enter swimming duration (minutes): ");
        swimmingDuration = input.nextDouble();

        System.out.print("Enter swimming average speed (km/h): ");
        swimmingSpeed = input.nextDouble();

        // Input cycling information
        System.out.print("Enter cycling duration (minutes): ");
        cyclingDuration = input.nextDouble();

        System.out.print("Enter cycling average speed (km/h): ");
        cyclingSpeed = input.nextDouble();

        // Calculate calories for each activity
        double runningCalories =
                (runningDuration * 0.05 * bodyWeight)
                + (runningSpeed * 0.5)
                + (altitude * 0.01);

        double swimmingCalories =
                (swimmingDuration * 0.04 * bodyWeight)
                + (swimmingSpeed * 0.5)
                + (altitude * 0.01);

        double cyclingCalories =
                (cyclingDuration * 0.03 * bodyWeight)
                + (cyclingSpeed * 0.5)
                + (altitude * 0.01);

        // Calculate total calories
        double totalCalories =
                runningCalories + swimmingCalories + cyclingCalories;

        // Calculate total duration
        double totalDuration =
                runningDuration + swimmingDuration + cyclingDuration;

        // Calculate average calories per minute
        double averageCaloriesPerMinute =
                totalCalories / totalDuration;

        // Calculate percentage of daily target achieved
        double percentageAchieved =
                (totalCalories / dailyTarget) * 100;

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Running calories: " + runningCalories);
        System.out.println("Swimming calories: " + swimmingCalories);
        System.out.println("Cycling calories: " + cyclingCalories);

        System.out.println("Total calories burned: " + totalCalories);
        System.out.println("Average calories per minute: "
                + averageCaloriesPerMinute);

        System.out.println("Daily calorie target achieved: "
                + percentageAchieved + "%");

        input.close();
    }
