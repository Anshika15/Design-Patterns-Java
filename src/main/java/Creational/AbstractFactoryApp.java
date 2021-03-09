package Creational;

public class AbstractFactoryApp {	
	    public static void main(String[] args) {
	        AbstractFactory computerFactory = FactoryProducer.getFactory(false);
	        Computer computer = computerFactory.getComputer("Phone");
	        computer.compute();
	}

}
