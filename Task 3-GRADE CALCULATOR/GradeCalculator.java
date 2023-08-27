import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("STUDENT GRADE CALCLATOR");

	
		System.out.println("Enter number of subjects");
	
		int totalMark = 0;
		int NumOfSubj = sc.nextInt();
	
		for (int i = 1; i <= NumOfSubj; i++) {
			System.out.print("Enter the Mark obtained in Subject " + i + " : ");

			int mark = sc.nextInt();
			totalMark += mark;
			System.out.println();
		}
		
		double AverageMarkPercentage = (double) totalMark / (NumOfSubj * 100) * 100;

		char Grade;

		if (AverageMarkPercentage >= 90) {
			Grade = 'A';
		} else if (AverageMarkPercentage >= 80) {
			Grade = 'B';
		} else if (AverageMarkPercentage >= 70) {
			Grade = 'C';
		} else if (AverageMarkPercentage >= 60) {
			Grade = 'D';
		} else if (AverageMarkPercentage >= 50) {
			Grade = 'E';
		} else {
			Grade = 'F';
		}
		System.out.println("Total Number of Mark: " + totalMark);
		System.out.println("Average Mark Percentage: " + AverageMarkPercentage);
		System.out.println("Your Grade: " + Grade);

		sc.close();
	}
}