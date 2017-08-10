package perceptronapp;

public class Point {
	private double x;
	private double y;
	private double label;

	public Point(double px, double py, double label) {
		this.x = px;
		this.y = py;
		this.label = label;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getLabel() {
		return this.label;
	}
}
