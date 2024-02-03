// Question 6
public class Tester {

	public static void main(String[] args) {
		// test cases. You can add the cases from hw2 to check your work
		quotientReminder(32, 10); // q = 3, r = 2
		quotientReminder(-32, 10); // q = -4, r = 8
		quotientReminder(71, 16); // q = 4, r = 7
		quotientReminder(-71, 16); // q = -5, r = 9
		quotientReminder(14, 7); // q = 2, r = 0
		quotientReminder(-14, 7); // q = -2, r = 0

	}

	// /**
	//  * Computes the values of the quotient and remainder for all integer n and
	//  * positive integer d
	//  **/
	public static void quotientReminder(int n, int d) {
		qrResult res;
		if (n >= 0) {
			res = naiveQuotientReminder(n, d);
		} else {
			res = nonNaiveQuotientReminder(n, d);

		}

		print(n, d, res);
	}

	/** Compute the quotient and remainder for positive n and positive d **/
	public static qrResult naiveQuotientReminder(int n, int d) {
		return (new qrResult(n / d, n % d));

	}

	public static qrResult nonNaiveQuotientReminder(int n, int d) {
		int newN = -n;
		int newD = d;
		if (newN % newD == 0) {
			return (new qrResult(n / d, n % d));
		} else {
			return (new qrResult((-((newN / newD) + 1)), (d - (newN % newD))));
		}
	}

	/** print quotient and reminder **/
	public static void print(int n, int d, qrResult qr) {
		System.out.println("n: " + n + "\t d: " + d + "\t Quotient: " + qr.quotient + "\t Remainder: " + qr.reminder);
	}

}

/** This record represents the result of integer division **/
class qrResult {
	int quotient;
	int reminder;

	public qrResult(int q, int r) {
		this.quotient = q;
		this.reminder = r;
	}
}

// Quesion 7

// System.out.println(Math.floorMod(-71, 16));
// System.out.println(Math.floorDiv(-71, 16));