package test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Random;

import perceptronapp.*;
import org.junit.Before;
import org.junit.Test;

public class TrainTest {
	private ArrayList<Point> list = new ArrayList<Point>();
	private Perceptron p;
	private double result=0;

	@Before
	public void Setup() {
		for (int i = 0; i < 50; i++) {
			Random r = new Random();
			double Low = -10;
			double High = 10;
			double xi = r.nextDouble() * (High - Low) + Low;
			double yi = r.nextDouble() * (High - Low) + Low;
			double label;
			if (xi > 0) {
				label = 1;

			} else {
				label = 0;
			}
			list.add(new Point(xi, yi, label));
		}
		// random values between -1 and 1
		p = new Perceptron(0.43, 0.821, -0.23);
	}

	@Test
	public void test() {
		
		for(int i=0; i<100; i++){
				p.ArrayTrain(list, 0.64);
			}
		
		//after 100 trainings test that perceptron learnt the correct output
		for(Point pi :list){
			if(p.Compare(pi)){
				result+=1;
		}
			
		}
		assertTrue(result/ list.size()==1);

	}

}
