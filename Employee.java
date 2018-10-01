//Employee.java - Jimmy Kurian

public class Employee implements Comparable<Employee>
{
	private String ssn;
	private String lastName;
	private String firstName;
	


	public int compareTo(Employee emp)
	{
		int compFirsts = firstName.compareTo(emp.firstName);//sorting by first name
		int compLasts = lastName.compareTo(emp.lastName);		
		int compSSN = ssn.compareTo(emp.ssn);

		if ((compSSN != 0) && (compLasts != 0) && (compFirsts != 0))
		{
			return compLasts;
		}
		else
		{
			return 0;
		}
		
	}


	public Employee (String socialSN, String ln, String fn)
	{
		ssn = socialSN;
		lastName = ln;
		firstName = fn;
	}

	public String toString()
	{
		return "Employee[SSN= " + ssn + ", Last Name= " + lastName + ", First Name= " + firstName + "]";
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getSSN()
	{
		return ssn;
	}

	public void setLastName(String setLN)
	{
		lastName = setLN;
	}

	public void setFirstName(String setFN)
	{
		firstName = setFN;

	}

	public void setSSN(String setSSN)
	{
		ssn = setSSN;
	}
	
}
