package apna.college;


/* Polymorpism    1.(compile time polymorpism/Function Overloading)
                 2. Runtime Polymorphism/Function Overriding(@Override in another class) */

 class Student2 {
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
	public void printInfo(String name,int age) {
		System.out.println(name+" "+age);
	}
} 
public class PolymorphismByShraddhaDidi {

	public static void main(String[] args) {
	
		Student2 stu1=new Student2();
		stu1.name="Kaleem Ashraf";
		stu1.age=22;
		
	
	
		stu1.printInfo("Kaleem Ashraf",22);

	}

}



