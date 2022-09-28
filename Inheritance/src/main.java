
public class main {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		Customer customer=new Customer();
		EmployeeManager employeemanager= new EmployeeManager();
		CustomerManager customermanager= new CustomerManager();
		
		
		employee.salary=1500;
		employee.id=15;
		
		customer.eMail="customer@dvsd.com";
		customer.id=16;
		
		employeemanager.Add();
		employeemanager.BestEmployee();
		
		customermanager.List();
		customermanager.BestCustomer();
		
		
	}

}
