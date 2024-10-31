package studio7;

public class Fraction {
		private int Numerator;
		private int Denominator;
	
		public Fraction (int Numerator, int Demoninator) {
			this.Numerator = Numerator;
			this.Denominator = Denominator;
			
		}
		public double Fractions () {
			double completedFraction = Numerator / Denominator;
			return completedFraction;
		}
		
		public double Sum (Fraction other) {
			double finishedFraction = this.Fractions() - other.Fractions();
			return finishedFraction;
			
		}
		public double Multiply (Fraction other) {
			double finishedMultiplication = this.Fractions() * other.Fractions();
			return finishedMultiplication;
		}
		
		
		
		
}
