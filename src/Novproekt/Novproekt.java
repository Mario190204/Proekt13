package Novproekt;

public class Novproekt {

	public static void main(String[] args) {
		int x=3, y=5, z=4;
		if (x>z|z>y)
				System.out.println("1");
		else
			System.out.println("2");
		if(Math.abs(x-y)>=z)
			if(x>y)
				System.out.println("3");
			else
				System.out.println("4");
		else
			System.out.println("5");
		
	}

}
