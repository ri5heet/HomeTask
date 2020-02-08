/*An Object Model that includes all the domains
1. interfaces
2. Classes
3. abstraction
4. inheritance
5. Polymorphism
6. Encapsulation
*/

//1. Creation of an interface thereby abstraction 
interface Pillars{

	String myName = "Hi, This is a Java object model that includes all pillars of java as shown below ";

	Boolean equals(ImplementAllPillars a, ImplementAllPillars b);

	Boolean equals(ImplementAllPillars a);
}

//all the java will import java.lang.* package thereby implementing inheritance 

// implementing Encapsulation  wrapping up all the methods variables in single class 

public class ImplementAllPillars implements Pillars{

	public static void main(String[] args) {

		System.out.println("Hi,This is Main Method");

		ImplementAllPillars a = new ImplementAllPillars();

		ImplementAllPillars b = new ImplementAllPillars();

		System.out.println("This is interface String : "+myName);

		System.out.println(a.equals(a));
		System.out.println(a.equals(a,b));

	}


// implementing polymorphism equals(para1), equals(para1,para2)
	public Boolean equals(ImplementAllPillars a){

		System.out.println("This is equals method with single parameter ");

		return this==a;

	}


	public Boolean equals(ImplementAllPillars a,ImplementAllPillars b){

		if(a.equals(b)){

			System.out.println("Both are equal a==b ");

			return true;

		}else{

			System.out.println("Both are not equal a!=b");

			return false;

		}

	}

}
