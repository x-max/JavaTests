package JavaLearning.basics;



public class ClassesAndObjects {
	
	public static void main(String[] args) {
		
		
		Person John= new Person("John");
		John.setAge(32);		
		Person Bob = new Person("Bob");
		Bob.setAge(25);
		System.out.println(John.getName()+" is "+ John.age + " years old!");
		System.out.println(Bob.getName()+ " is "+ Bob.age + " years old!"); 
		
		John.sayHelloto(Bob);
		Bob.sayHelloto(John);
	}

}
