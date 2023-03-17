package husseinabdallah.java.composition;

import husseinabdallah.java.composition.laptop.Laptop;
import husseinabdallah.java.composition.laptop.components.GraphicsCard;
import husseinabdallah.java.composition.laptop.components.Processor;

public class Composition {

	public static void main(String[] args) {
		Laptop lappy = new Laptop();
		System.out.println(lappy);
		System.out.println(lappy.getProcessor());
		System.out.println(lappy.getProcessor().getBrand());
		
		Processor processor = new Processor("intel", "7200u", 7,4,4,"6MB", "2.5Ghz","2.5Ghz","3.1Ghz");
		
		GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17f,processor, "DDR4", "2TB",graphicsCard,null,"backlit");
		
		System.out.println("Gaming laptop: " + gamingLaptop);
		
		System.out.println("Gaming laptop processor frequency: " + gamingLaptop.getProcessor().getFrequency());
	}

}
