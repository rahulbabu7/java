package lab21;
import java.util.*;
public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int temp;
temp=n1;
n1=n2;
n2=temp;
System.out.println("swap is "+n1);
System.out.println("swap is "+n2);
	}

}
