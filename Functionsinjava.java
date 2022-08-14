package OOPConceptPart1;

public class Functionsinjava {
	
	
    //main method --> starting point of execution
	public static void main(String[] args) {
		
		Functionsinjava obj = new Functionsinjava();
		//one object will be created, obj is the reference variable, reffering to this object
		//after creating the object, the copy of all non static method will be given to this object
	
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30,  10);
		System.out.println(div);
	}
		// TODO Auto-generated method stub

		//non static methods
	     
		//void -- does not return any value
	    //return type = void
		
		public void test(){ //no input, no output
			System.out.println("test method" );
		}
		 
	
	//return type = int		
			public int pqr(){  //no input, some output
			System.out.println("PQR method");
				int a = 10;
				int b = 20;
				int c = a+b;
				
				return c;
				
			}
			 //return type ---> String
            public String qa() { //no input, some output
            	System.out.println("qa method");
            	String s = "Selenium";
            	
            	return s;
            	
            	
}
            //return type ---> int
            //x,y --> input parameters/arguments
            public int division(int x, int y){
            	System.out.println("division method");
            	int d = x/y;
            	
            	return d;
            }
              
	}


