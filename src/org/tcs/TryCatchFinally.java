package org.tcs;

public class TryCatchFinally {

	public static void main(String[] args) {

		System.out.println("1");
		System.out.println("2");
		System.out.println("3");

		try
		{
			System.out.println(4/0);
		}
		catch(Exception e){

			e.printStackTrace();
			System.out.println("Exception");
		}

		finally {

			System.out.println("Succesfull");
		}

		System.out.println("5");
		System.out.println("6");
	}
}
