package basics;

public class Local {
    void print() {  //instance method
    	int l=20;  //local variable
      System.out.println(l);	
    }
	public static void main(String[] args) {
		int l=20;  //local variable
		System.out.println(l); //20
		
		Local obj = new Local();
		obj.print(); //20

	}

}
