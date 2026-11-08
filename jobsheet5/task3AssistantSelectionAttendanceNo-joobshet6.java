package jobsheet5;

import java.util.Scanner;

public class task3AssistantSelectionAttendanceNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Is the student active? (true/false): ");
        boolean isActiveStudent = sc.nextBoolean();

        System.out.print("Is the student under academic sanction? (true/false): ");
        boolean isSanctioned = sc.nextBoolean();

        System.out.print("Enter Fundamentals of Programming grade: ");
        int programmingGrade = sc.nextInt();

        System.out.print("Does the student have a programming competency certificate? (true/false): ");
        boolean hasCertificate = sc.nextBoolean();

        System.out.print("Enter interview score: ");
        int interviewScore = sc.nextInt();

        if (isActiveStudent && !isSanctioned) {

            if (programmingGrade >= 80 || hasCertificate) {

                if (interviewScore >= 75) {
                    System.out.println("Accepted as Lab Assistant");
                } else {
                    System.out.println("Rejected: interview score is below 75");
                }

            } else {
                System.out.println("Rejected: programming grade is below 80 and no competency certificate");
            }

        } else {
            System.out.println("Rejected: student is not active or is under academic sanction");
        }
    }
}