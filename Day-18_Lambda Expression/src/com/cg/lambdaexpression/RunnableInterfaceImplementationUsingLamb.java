package com.cg.lambdaexpression;

public class RunnableInterfaceImplementationUsingLamb {

	public static void main(String[] args) {
		/*Runnable R1=new Runnable();
		{
			public void run()
			{
				System.out.println("Runnable Interface Implementation");
			}
		};  */
		Runnable R1=()->
		{
			System.out.println("Runnable Interface Implementation");
		};
		Thread t=new Thread(R1);
		t.start();
		
	}

}
