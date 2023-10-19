package e_Heranca_Polimorfismo.prova;

public class Employee extends Person {

	String emplID = "0000";
	
	public Employee(String id, String name) {
		super (name);
		emplID = id;
	}
	
}
