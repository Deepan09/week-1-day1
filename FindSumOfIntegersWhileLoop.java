package week1.day1;

public class FindSumOfIntegersWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num = 6787;
int sum=0;
while (num/10!=0) {
	int quotient= num/10;
	int remainder=num%10;
//System.out.println(remainder);

num=quotient;
sum = sum+remainder;
}
sum= sum+ num;
System.out.println("sum of the digits is= " +sum);

	}
}
 
