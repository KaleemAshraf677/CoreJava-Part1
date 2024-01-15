package apna.college;

abstract class Animal1{
	abstract void walk();  // abstract method
	
	Animal1(){
		System.out.println("you are creating a animal");
	}
	 public void eats() {
		 System.out.println("herbivorous animal");
	 }
}
class Horse1 extends Animal1{
	 public void walk() {
		 System.out.println("walks on 4 legs");
	 }
}
class Chicken extends Animal1{
	 public void walk() {
		 System.out.println("walks on 2 legs");
	 }
}
public class AbstractOopsByShraddhaDidi {

	public static void main(String[] args) {
		
		Horse1 h1=new Horse1();
		
	}

}
