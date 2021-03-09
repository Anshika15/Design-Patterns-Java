package Creational;

public class BuilderApp {
	
	    public static void main(String[] args) {
	    	BuilderPattern johnSmith = new BuilderPattern.Builder(1L)
	                .withName("JohnSmith")
	                .withAddress("Oxford Lane 35A")
	                .withBudget(100L)
	                .withDiscount(2L)
	                .build();

	        System.out.println(johnSmith.getName());
	    }

}
