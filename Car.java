public class Car
{
	public String name;
	private String plateNumber;
	private double pricePerHour;
	private boolean isRented;

	public Car(String name, String plateNumber, double pricePerHour)
	{
		this.name = name;
		this.plateNumber = plateNumber;
		this.pricePerHour = pricePerHour;
		this.isRented = false;
	}
	public String getPlateNumber()
	{
		return this.plateNumber;
	}
	public boolean getIsRented()
	{
		return this.isRented;
	}
	public void isRented()
	{
		this.isRented = true;
	}
	public double getPrice(int numOfHours)
	{
		return (this.pricePerHour * numOfHours);
	}

	@Override
	public String toString()
	{
		return "Name: " +this.name+ " | Plate Number : " +this.plateNumber+ " | Price Per Hour: " +this.pricePerHour+ " | Rented: " +this.isRented+ ".\n";
	}
}