package reviewclass05;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee  out =new Employee ();
		out.ID="123";
		out.name="Elva";
		out.department="IT";
		out.salary=150000;
		
		Employee out1=new Employee();
		out1.ID="123457";
		out1.name="Saleem";
		out1.department="IT";
		out1.salary=2000000;
		
		Employee[] employess=new Employee[2];
		employess[0]=out;
		employess[1]=out1;
		
		  //data type
		for(Employee employee:employess) {
		System.out.println("Employee ID:" +employee.ID);
		System.out.println("Employee name:" +employee.name);
		System.out.println("Employee department:" +employee.department);
		System.out.println("Employee salary:" +employee.salary);
		System.out.println();		
		}
		for(int i=0; i< employess.length; i++) {
			employess[i].work();
			employess[i].drink();
			
		}
		
	}

}
