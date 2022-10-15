package SimpliLearn;

public class Employee {
	int EmpId;
	String name;
	String dept;
	long salary;
	String address;
	
	

	public Employee(int empId, String name, String dept, long salary, String address) {
		super();
		EmpId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}



	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(1,"Aasim","Cyber Security Practice",382000,"Bulandshahr");
		Employee emp2 = new Employee(2,"Jazah","ERP",402000,"Noida");
		Employee emp3 = new Employee(3,"Ansari","Finance",502000,"Haidrabad");
		Employee emp4 = new Employee(4,"Mohd","Payroll",6000000,"Chennai");
		Employee emp5 = new Employee(5,"Ishtiyaq","synergy",4502000,"Koimbatore");
		
		
		System.out.print(emp1.EmpId+"\t");
		System.out.print(emp1.name+"\t");
		System.out.print(emp1.dept+"\t");
		System.out.print(emp1.salary+"\t");
		System.out.print(emp1.address+"\t");
		
		System.out.println();
		System.out.print(emp2.EmpId+"\t");
		System.out.print(emp2.name+"\t");
		System.out.print(emp2.dept+"\t");
		System.out.print(emp2.salary+"\t");
		System.out.print(emp2.address+"\t");
		
		System.out.println();
		System.out.print(emp3.EmpId+"\t");
		System.out.print(emp3.name+"\t");
		System.out.print(emp3.dept+"\t");
		System.out.print(emp3.salary+"\t");
		System.out.print(emp3.address+"\t");
		
		System.out.println();
		System.out.print(emp4.EmpId+"\t");
		System.out.print(emp4.name+"\t");
		System.out.print(emp4.dept+"\t");
		System.out.print(emp4.salary+"\t");
		System.out.print(emp4.address+"\t");
		
		System.out.println();
		System.out.print(emp5.EmpId+"\t");
		System.out.print(emp5.name+"\t");
		System.out.print(emp5.dept+"\t");
		System.out.print(emp5.salary+"\t");
		System.out.print(emp5.address+"\t");
		
		System.out.println();

	}

}
