package com.exercises

public class CalculatorHomework{
	
		public static void main (String[] args) {
			string operator = "";
			double a = 4, b = 2
				switch (operator) {
					case "+":
					calculateSum(a, b);
						break;
					case "-":
					calculateDif(a, b);
						break;
					case "*":
					calculateProd(a, b);
						break;
					case "/":
					calculateDiv(a, b);
						break;
					default:
						break
					}
		}

		private static void calculateDiv(double a, double b) {
			double result3=a/b;
			System.out.println(result3);
		}

		private static void calculateProd(double a, double b) {
			double result2=a*b;
			System.out.println(result2);
		}

		private static void calculateSum(double a, double b) {
			double result=a+b;
			System.out.println(result);
		}

		private static void calculate(double a, double b) {
			double result1=a-b;
			System.out.println(result1);
		}
}
