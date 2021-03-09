package Creational;

public class FactoryApp {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.getComputer("Laptop");
        computer.compute();

        Computer computer2 = computerFactory.getComputer("Phone");
        computer2.compute();


    }
}
