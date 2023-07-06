public class Person
{
	public String name;
	private String contactNumber;
	private double cashPayment;

	public Person(String name, String contactNumber, double cashPayment)
	{
		this.name = name;
		this.contactNumber = contactNumber;
		this.cashPayment = cashPayment;
	}
	public String getContactNumber()
	{
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	public double getCashPayment()
	{
		return this.cashPayment;
	}
	public void setCashPayment(double cashPayment)
	{
		this.cashPayment = cashPayment;
	}

	@Override
	public String toString()
	{
		return "Person Name: " +this.name+ " | Contact Information: " +this.contactNumber+ " Cash Payment: " +this.cashPayment+ ".\n";
	}
}