package apna.college;

class Stu{
	String name;
	int age;
	
	Stu(Stu s2){
		this.name=s2.name;
		this.age=s2.age;
	}
	Stu(){ //if we use copy constructor we can also define the copy object constructor
	}
}
public class CopyConstructor{
	public static void main(String[] args) {
		
    	Stu s1=new Stu(); 
		 s1.name="Kaleem";
		 s1.age=22;
		 
		 Stu s2=new Stu(s1);    // in copy constructor we can pass the object of previous constructor
		System.out.println(s2.name); 
		System.out.println(s2.age);

	}

}
