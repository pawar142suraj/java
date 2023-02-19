import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = { 100, 76, 98 };
		Student student = new Student("Ranga", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("sum of marks: " + sum);

		int maximumMark = student.getMaximumMarks();
		System.out.println("maximumMark of marks: " + maximumMark);

		int mininmumMark = student.getMinimumMarks();
		System.out.println("mininmumMark of marks: " + mininmumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average of marks: " + average);

	}

}
