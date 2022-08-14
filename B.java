package OOPConceptPart1;

public class B extends A {
	
	public B(){
		super(); 
	}
		public B(int i) {
			super(i);
			
		}
		
		public B(int i, int j) {
			super(i,j);
			
		}
		//super keyword is used to call parent class constructor,if you don't write super keyword bydefault, default constructor will be called.
		//but if we use super keyword it means the parametrized constructor will be call
		//super keyword is the first statement ,it sould be written  inside the child class constructor always.and it should be the first statement ,it can't be the 2nd or last
		//statement.
		
		//System.out.println("child class const");
	

	
	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);
		
		
		}
}  
