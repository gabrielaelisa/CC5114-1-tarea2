package perceptronapp;

/**
 * Class for NAND circuit which adds two bits
 * 
 * @author Gabriela
 *
 */
public class SummingBitGate {
	private Perceptron n1 = new NAND();
	private Perceptron n2 = new NAND();
	private Perceptron n3 = new NAND();
	private Perceptron n4 = new NAND();
	private Perceptron n5 = new NAND();
	private double carry;

	/**
	 * this method reproduces the 5 NAND circuit which solves the carry and
	 * summing gate
	 * 
	 * @param x1
	 *            int (binary)
	 * @param x2
	 *            int
	 *
	 */
	public double summinggate(double x1, double x2) {
		double x3 = n1.output(x1, x2);
		double carry = n2.output(x3, x3);
		double x4 = n3.output(x1, x3);
		double x5 = n4.output(x2, x3);
		return n5.output(x4, x5);

	}
}