package datatypes;

public class Operators1 {

	public static void main(String[] args) {
		//int a=b=c=d=10;
		int a,b,c,d;
		a=b=c=d=10;  //allowed
		
        System.out.println(a);
        c=a+b;  //c is 20
        
        b=a+c; //b is 30
        
        System.out.println(b);
        System.out.println(c);
		
        System.out.println(d);
	}

}
