package datatypes;

public class Array2 {
    int a[]=new int[3];  //instance array
   /* {
    a[0]=12;
    a[1]=23;
    a[2]=34;
    } */
public static void main(String[] args) {
	Array2 obj = new Array2();
	obj.a[0]=12;
	obj.a[1]=23;
	obj.a[2]=34;
	
	System.out.println(obj.a[1]);  //2nd element in the array

	System.out.println(obj.a.length); //length
	}

}
