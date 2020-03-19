package proc3_test;
import processing.core.PApplet;

public class processingExamples extends PApplet {
	int currentColor = 0; 
	boolean colorDirection = true; 
	
	public static void main(String[] args) {
		PApplet.main("proc3_test.processingExamples");
	}
	public void settings() {
		size(500,500); 
	}
	public void draw() {
		background(this.currentColor); 
		this.currentColor = this.colorDirection ? this.currentColor +1 : this.currentColor - 1; 
		
		if (this.currentColor >= 255 || this.currentColor <=0) {
			this.colorDirection = !this.colorDirection;
		}
	}
	

}
