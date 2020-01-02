package basics;

public class Static {
    static int s=50;  //static variable
    
    void print() {   //instance method
    	s=s*2;
    	System.out.println(s); 
    }
    
	public static void main(String[] args) {
		System.out.println(s);  //static variable prints 50
		
		Static obj = new Static();
		obj.print();  //prints 100...
		
		System.out.println(s);   //prints 100
		
		obj.print();   //prints 200

	}

}
