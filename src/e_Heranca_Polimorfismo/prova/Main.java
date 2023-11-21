package e_Heranca_Polimorfismo.prova;

public class Main {

	public static void main(String[] args) {

		//Alpha a = new Alpha();
		//Beta b = new Beta();
		//Gama g = new Gama();
		
		
		//TesteA tab = new TesteB();
		//tab.start();
		
		
		//Employee e = new Employee("4321");
		//System.out.println(e.emplID);
		
		//Employee m = new Employee("4321", "ana");
		//System.out.println(m.emplID);
		//System.out.println(m.name);
		
		//Person p = new Person();
		//System.out.println(p.name);
		
		Plant t = new Tree();
		System.out.println(t.getName());
		Plant p = new Plant("Wisteria");
		System.out.println(p.getName());
		System.out.println(new Plant().getName());
		
	}

}
