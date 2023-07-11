import java.util.Scanner;

class sumoffivenum{
	public static void main(String args[]){
		int num1,num2,num3,num4,num5,result;
		System.out.println("Enter any 5 integers ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		num5 = in.nextInt();
	    result=num1+num2+num3+num4+num5;
		System.out.println("The result after addition is "+result);
	}
}
