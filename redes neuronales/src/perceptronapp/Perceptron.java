package perceptronapp;
import java.util.ArrayList;
/**
 * class Perceptron with de behaviour of OR Nand, AND
 * 
 * @author Gabriela
 *
 */
public class Perceptron {
	protected double weight1;
	protected double weight2;
	protected double bias;

	/**
	 * contructur receives two weights and 1 bias
	 * 
	 * @param w1
	 *            int (first input weight)
	 * @param w2
	 *            int (second input weight)
	 * @param d
	 *            double (bias value)
	 *
	 */
	public Perceptron(double w1, double w2, double d) {
		weight1 = w1;
		weight2 = w2;
		bias = d;

	}

	/**
	 * Output public method receives binary inputs, and returns 1 or 0
	 * 
	 * @param x1
	 *            int
	 * @param x2
	 *            int
	 * @return output int
	 * 
	 */
	public double output(double x1, double x2) {
		/*
		 * shortcut for 2 bit binary input (String) int x1=
		 * Integer.parseInt(s.charAt(0)+""); int
		 * x2=Integer.parseInt(s.charAt(1)+"")
		 */

		double result = (x1 * weight1 + x2 * weight2 + bias);
		System.out.print(result);
		if (result <= 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public void Train(Point p, double rate) {
		if (output(p.getX(), p.getY()) > p.getLabel()) {
			this.weight1 = weight1 - rate * p.getX();
			this.weight2 = weight2 - rate * p.getY();

		}
		if (output(p.getX(), p.getY()) < p.getLabel()) {
			this.weight1 = weight1 + rate * p.getX();
			this.weight2 = weight2 + rate * p.getY();
		}
	}
	public void ArrayTrain(ArrayList<Point> list, double rate){
		int m= list.size();
		for(int i=0; i<m; i++){
			this.Train(list.get(i), rate);
		}
	}
	public boolean Compare(Point p){
		if (this.output(p.getX(), p.getY())==p.getLabel()){
			return true;
	}
		else{
			return false;
		}

	}

}
