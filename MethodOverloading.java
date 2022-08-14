package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		
obj.sum();
obj.sum(10);
obj.sum(10, 5);
	}
	
	public static void main(int p){
	
	}
	
		public static void main(int q, int h){
	}
	
	public void sum(){ //0 input parameter
		System.out.println("SUM method --zero param");
	}
		
		
		public void sum(double d){ //1 input parameter
			System.out.println("Sum method --zero input param");
			
		
	}

	
	public void sum(int i){ //1 input parameter
		System.out.println("Sum method -- 1 input param");
		System.out.println(i);
	}
	public void sum(int k, int l) { //2 input parameter
		System.out.println("sum method -- 2 input param");
		System.out.println(k+l);
	}
}
