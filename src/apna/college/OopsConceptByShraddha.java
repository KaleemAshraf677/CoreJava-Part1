package apna.college;

class Pen{
	String color;
	String type; 
	 
	public void printPenInfo() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
}	
class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(Student s2){
		this.name=s2.name;
		this.age=s2.age;
	}
	Student(){	 
	}
}
public class OopsConceptByShraddha {

	public static void main(String[] args) {
		
      Pen pen1=new Pen();
      pen1.color= "blue";
      pen1.type="ball pen";
      
      Pen pen2=new Pen();
      pen2.color="black";
      pen2.type="Gel Pen";
      
      pen1.printPenInfo();
      pen2.printPenInfo();
       
      
   /*   Student s1=new Student();      (non paramatrize constructor)
      s1.name="Kaleem Ashraf";        
      s1.age=22;
      
      Student s2=new Student();
      s2.name="Amman Siddique";
      s2.age=21;
      
      s1.printInfo();
      s2.printInfo();   */
    
      	/*	Student s1=new Student("Kaleem Ashraf",22);  ( Parametrize constructor)
    	Student s2=new Student("Amman Siddique",21);
    		
    		s1.printInfo();
    		s2.printInfo();   */
      
        Student s1=new Student();
        s1.name="Kaleem";
        s1.age=22;
        Student s2=new Student(s1);
        
        s1.printInfo();
        s2.printInfo();
        
	}

}

