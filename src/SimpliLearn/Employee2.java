package SimpliLearn;

public class Employee2 {
	
	int EmpId;
	String name;
	String dept;
	long salary;
	String address;
	
	

	public Employee2(int empId, String name, String dept, long salary, String address) {
		super();
		EmpId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Employee emp[]= new Employee[5];
		
		emp[0] = new Employee(1,"Aasim","CSP",382000,"Bulandshahr");
		emp[1] = new Employee(2,"Jazah","ERP",402000,"Noida");
		emp[2] = new Employee(3,"Ansari","Fina",502000,"Haidrabad");
		emp[3] = new Employee(4,"Mohd","Payr",600000,"Chennai");
		emp[4] = new Employee(5,"Ishti","syne",450200,"Koimbatore");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(emp[i].EmpId+"\t|"+emp[i].name+"\t|"+emp[i].dept+"\t|"+emp[i].salary+"\t|"+emp[i].address);
		    System.out.println("____________________________________________________________");
		}
		

	}

}
