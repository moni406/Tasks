package JavaOopsTask;

class Employee{
	private static int count;
	Employee(){
		count++;
	}
	void getInfo()
	{
		System.out.println("count of employees: "+ count);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		obj.getInfo();
	}

}
