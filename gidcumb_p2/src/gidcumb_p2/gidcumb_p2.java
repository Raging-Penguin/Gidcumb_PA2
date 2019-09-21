package gidcumb_p2;

import java.util.Scanner;

public class gidcumb_p2 {

	public static double metricFormula(double h, double w)
	{
		double BMI = w / (h * h);
		return BMI;
	}
	public static double imperialFormula(double h, double w)
	{
		double BMI = (703 * w) / (h * h);
		return BMI;
	}
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			int formulaChoice=0;
			double weight;
			double height;
			double bmi;
			System.out.println("Input 1 for Metric units, 0 for Imperial Standard units: ");
			formulaChoice = input.nextInt();
			if (formulaChoice==1)
			{
				System.out.println("Enter your height in Meters: ");
				height = input.nextDouble();
				System.out.println("Enter your weight in Killograms: ");
				weight = input.nextDouble();
				bmi = metricFormula(height, weight);
				System.out.println("Your BMI is: " + bmi);
			}else
			{
				System.out.println("Enter your height in inches: ");
				height = input.nextDouble();
				System.out.println("Enter your weight in Pounds: ");
				weight = input.nextDouble();
				bmi = imperialFormula(height, weight);
				System.out.println("Your BMI is: " + bmi);
				
			}
			System.out.println("BMI chart according to the National Heart Lung and Blood Institute: ");
			System.out.println("Underweight: < 18.5");
			System.out.println("Normal Weight: 18.5-24.9");
			System.out.println("Overweight: 25-29.9");
			System.out.println("Obesity: > 30");

	        input.close();


		
		


}
}
