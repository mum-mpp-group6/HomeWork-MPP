package Lesson3Labs;

public class PersonWithJob2 {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob2(Person p, double s) {
		person = p;
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob2)) return false;
		PersonWithJob2 p = (PersonWithJob2)aPerson;
		boolean isEqual = this.person.getName().equals(p.person.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p2 = new Person("Joe");
		PersonWithJob2 p1 = new PersonWithJob2(p2, 30000);
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.person.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1.person));
	}


}

// Problem with inheritance object is determined at run time, as a result p1 and p2 become two different objects. to solve this using composition we need to create an instance 
// of Person inside person withobject class and compare there equality on the bases of PersonWithJob2.person instance variable.