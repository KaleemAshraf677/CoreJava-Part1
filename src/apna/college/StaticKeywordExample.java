package apna.college;

class Student1{
	String name;
	static String school;  // (same/common in all objects)

        public static void changeSchool() {    // If we use static method in any class than all the objects of this class is same. 
        	school="newSchool";
        	System.out.println(school);
        }
}
public class StaticKeywordExample {

	public static void main(String[] args) {
		
         Student1.school="Jesus And Mary Inter College";  // we can use static properties in main method with the help of ClassName
        
          Student1 s1=new Student1();
          
          s1.name="Kaleem Ashraf";
          
          System.out.println(s1.name);
          System.out.println(s1.school);
          
          Student1 s2=new Student1();
          
          s2.name="Amman Siddique";
          
          System.out.println(s2.name);
          System.out.println(s2.school);
          
          Student1.changeSchool(); //Resultant will be same for Whole Class objects
          
          s1.changeSchool();
          s2.changeSchool();
          
         
          
           
        
	}

}

