package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{ //we are achieving multiple inheritance
	//Is-a relationship
	
	//if a class is implementing any interface, then its mandatory to define/override all methods of Interface.
	//Overriding from USBank
	public void credit() {
		System.out.println("hsbc--credit");

}

	public void debit() {
		System.out.println("hsbc--debit");
	}
	
	public void transferMoney() {
	     System.out.println("hsbc--transferMoney");
	}
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}
	
	public void carLoan() {
			System.out.println("hsbc--Car loan");
	}
	

 	//brazil bank method:
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
	}
}