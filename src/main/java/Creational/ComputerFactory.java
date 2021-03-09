package Creational;

public class ComputerFactory extends AbstractFactory{
    public Computer getComputer(String computer){
        if(computer.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if(computer.equalsIgnoreCase("Phone")){
            return new Phone();
        }

        return null;
    }
}