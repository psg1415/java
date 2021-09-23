package chapter12_1;

public class Ex1 {
	public static void main(String[] args) {
		ThreeDPrinter plasticPrinter = new ThreeDPrinter();
		ThreeDPrinter powderPrinter = new ThreeDPrinter();
		
		plasticPrinter.addMaterial(new Plastic());
		powderPrinter.addMaterial(new Powder());
		
		
		Plastic plastic = (Plastic) plasticPrinter.getMaterial(); 
		plastic.doPrinting();
		
		Powder powder = (Powder) powderPrinter.getMaterial();
		powder.doPrinting();
		
		//System.out.println(plasticPrinter);
		//System.out.println(powderPrinter);
	}
}
