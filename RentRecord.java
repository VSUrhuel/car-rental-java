import java.util.*;
public class RentRecord
{
	private ArrayList<Car> cars;
	private ArrayList<Rent> rents;
	private double totalRevenue;

	public RentRecord()
	{
		this.cars = new ArrayList<>();
		this.rents = new ArrayList<>();
		this.totalRevenue = 0;
	}
	public void addCar(Car c)
	{
		cars.add(c);
	}
	public void removeCar(Car c)
	{
		cars.remove(c);
	}
	public boolean addRent(Rent r)
	{
		for(Car car :  cars)
		{
			if(car.name.equals(r.car.name) && !(car.getIsRented()) && r.getPerson().getCashPayment() > car.getPrice(r.getNumOfHours()))
			{
				rents.add(r);
				car.isRented();
				totalRevenue += car.getPrice(r.getNumOfHours());
				cars.remove(car);
				return true;
			}
		}
		return false;
	}
	public boolean removeRent(Rent r)
	{
		for(Rent rent : rents)
		{
			if(rent.rentNumber==r.rentNumber)
			{
				rents.remove(r);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Rent> getRentList()
	{
		return this.rents;
	}
	public ArrayList<Car> getCarList()
	{
		return this.cars;
	}
	@Override
	public String toString()
	{
		String s = "";
		for(Rent rent : rents)
		{
			s += rent.toString();
		}
		return s;
	}
}