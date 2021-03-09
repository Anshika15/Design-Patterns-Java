package Creational;

public class BuilderPattern {

	    private Long id;
	    private String name;
	    private String address;
	    private Long budget;
	    private Long discountRate;

	    public static class Builder {
	        private Long id;
	        private String name;
	        private String address;
	        private Long budget;
	        private Long discountRate;

	        public Builder(Long id) {
	            this.id = id;
	        }

	        public Builder withName(String name) {
	            this.name = name;

	            return this;
	        }

	        public Builder withAddress(String address) {
	            this.address = address;

	            return this;
	        }

	        public Builder withBudget(Long budget) {
	            this.budget = budget;

	            return this;
	        }

	        public Builder withDiscount(Long discountRate) {
	            this.discountRate = discountRate;

	            return this;
	        }

	        public BuilderPattern build() {
	        	BuilderPattern onlineStoreAccount = new BuilderPattern();
	            onlineStoreAccount.id = this.id;
	            onlineStoreAccount.name = this.name;
	            onlineStoreAccount.address = this.address;
	            onlineStoreAccount.budget = this.budget;
	            onlineStoreAccount.discountRate = this.discountRate;

	            return onlineStoreAccount;
	        }
	    }

	    private BuilderPattern() {
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public Long getBudget() {
	        return budget;
	    }

	    public void setBudget(Long budget) {
	        this.budget = budget;
	    }

	    public Long getDiscountRate() {
	        return discountRate;
	    }

	    public void setDiscountRate(Long discountRate) {
	        this.discountRate = discountRate;
	    }

}
