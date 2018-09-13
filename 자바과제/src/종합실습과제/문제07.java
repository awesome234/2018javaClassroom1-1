package 종합실습과제;

import java.util.Scanner;

public class 문제07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("A AND B : %d\n",a&b);
		System.out.printf("A OR B : %d\n",a|b);
		System.out.printf("NOT a : %d\n",~a);
		System.out.printf("A XOR B : %d\n",a^b);
		System.out.printf("A NAND B : %d\n",(~(a&b)));
		System.out.printf("A NOR b : %d\n",(~(a|b)));
		
		
		
	}

}
