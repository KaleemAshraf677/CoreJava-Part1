package apna.college;

interface Animal{
	int eye=2;
	 void walk();
}
interface Herbivore{
	
}
class Horse implements Animal,Herbivore{
	public void walk() {
		System.out.println("horse have 4 legs");
	}
}
public class InterfaceOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Horse horse=new Horse();
         horse.walk();
	}

}

