import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String student_name;
	private int[] marks;

	public Student(String string, int... marks) {

		this.student_name = string;
		this.marks = marks;

	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}

		return sum;
	}

	public int getMaximumMarks() {

		int max = Integer.MIN_VALUE;

		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}

		return max;
	}

	public int getMinimumMarks() {

		int min = Integer.MAX_VALUE;

		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}

		return min;
	}

	public BigDecimal getAverageMarks() {

		int sum = getTotalSumOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(marks.length), 3, RoundingMode.UP);
	}

}
