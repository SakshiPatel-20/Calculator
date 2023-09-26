import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no: ");
		int no = sc.nextInt();
		c1.setNo(no);
		
		System.out.println("Enter no: ");
		int no1 = sc.nextInt();
		c1.setNo1(no1);
		c1.setSname("Calculator");
		System.out.println(c1.toString());
		System.out.println(c1.getAdd());
		System.out.println(c1.getSub());
		System.out.println(c1.getMul());
		System.out.println(c1.getDiv());
	}
}

