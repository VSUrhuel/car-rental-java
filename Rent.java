public class Rent
{
	public Car car;
	private Person person;
	private int numOfHours;
	public int rentNumber;

	public Rent(Car car, Person person, int numOfHours, int rentNumber)
	{
		this.car = car;
		this.person = person;
		this.numOfHours = numOfHours;
		this.rentNumber = rentNumber;
	}
	public Person getPerson()
	{
		return this.person;
	}
	public int getNumOfHours()
	{
		return this.numOfHours;
	}
	public void setPerson(Person p)
	{
		this.person = p;
	}
	public void setNumOfHours(int numOfHours)
	{
		this.numOfHours = numOfHours;
	}
	@Override
	public String toString()
	{
		String s = "";
		s += "Name: " + person.name + " | Rent Number: " + this.numOfHours + "\n";
		s += this.car.toString();
		return s;
	}
}