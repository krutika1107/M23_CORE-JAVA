package com.cg.lambdaexpression;
interface C
{
	void display();
	//void accept();
}
public class IterfaceImpl {

	public static void main(String[] args) {
		//
		C obj=()->
		{
			System.out.println("Functional Interface Implementation without/r"
					+" Lambda Expression");
		};
		obj.display();
	}

}
