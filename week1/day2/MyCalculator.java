package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		obj.add(23,24,25);
		System.out.println("Addition of two numbers is : "+obj.addition);
		//System.out.println(add);
		obj.sub(35,10);
		System.out.println("Subtraction of two numbers is : "+obj.subtraction);
		//System.out.println(sub);
		obj.mul(23,23);
		System.out.println("Multiplication of two numbers is : "+obj.multiplication);
		//System.out.print(mul);
		obj.divide(200,10);
		System.out.println("Division of two numbers is : "+obj.division);
	}

}
