package lab21;
import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
int num1=sc.nextInt();
int num2=sc.nextInt();
int Q=num1/num2;
int R=num1%num2;
System.out.println("quoitient is"+Q);
System.out.println("remainder is "+R);

	}

}
