package apna.college;

/* INHERITANCE-

1. Single level Inheritance           ParentClass  --> ChildClass
2.Multilevel Inheritance              SuperClass -->  SubClass --> SubSubClass --> SubSubSubClass  --> SubSubSubSubClass  
3.Hierarchial Inheritance             BaseClass  --> DerivedClass extends BaseClass  --> SubClass extend BaseClass and so onn it is only extends ParentClass.
4. Hybrid Inheritance                 In hybrid Inheritance we can use whatever we want.We can extends ParentClass as well as DerivedClass as per our convenience.                                             */

class Shape{
	public void area() {
		System.out.println("display area");
	}
 }	
class Triangle extends Shape{               //single level inheritance
	public void area(int b,int h) {
		System.out.println(b*h*1/2);
	}
 }	
/*class EquilateralTrianle extends Triangle{      //multi level inheritance
	public void area(int h,int b) {
		System.out.println(1/2*h*b);
	}
}*/

class Circle extends Shape{                    // heirarchial inheritance
	public void area(int r) {
		System.out.println(3.1415*r*r);
	}
}
public class InheritanceOops {

	public static void main(String[] args) {
	

	}

}

