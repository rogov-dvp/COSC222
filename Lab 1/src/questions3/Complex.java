package questions3;

public class Complex extends Real {

		private double imaginary;
		
		Complex(double r, double c) {
			super(r);
			imaginary = c;	
		}

		
		public String toString() {			
			return super.toString()+ ((imaginary>0)?"+":"") +String.format("%4.2f",imaginary)+"i";
		}
		
		public double magnitude() {
			return Math.sqrt(Math.pow(super.magnitude(),2) + Math.pow(imaginary,2))	;
		}
}
