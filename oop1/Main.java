package oop1;

public class Main {

	public static void main(String[] args) {

		Yarma yarma1 = new Yarma();

		yarma1.name = "patates";
		yarma1.unitPrice = 19.90;
		yarma1.discount = 2.25;
		yarma1.unitsInStock = 46;
		yarma1.imageUrl = "patates.jpg";
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("5519565884");
		individualCustomer.setCustomerNumber("153456");
		individualCustomer.setName("cagfer");
		individualCustomer.setLastname("vurucu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();

		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("23");
		corporateCustomer.setPhone("5354125454");
		corporateCustomer.setCompanyName("SCT");
		corporateCustomer.setTaxNumber("585846");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		
		
		
		

	}

}
