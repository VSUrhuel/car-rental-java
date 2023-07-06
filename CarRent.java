import java.util.*;
public class RentRecord
{
	private ArrayList<Car> cars;
	private ArrayList<Rent> rents;
	private double totalRevenue;

	public CarRent()
	{
		cars = new ArrayList<>();
		rents = new ArrayList<>();
		totalRevenue = 0;
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
			if(car.name.equals(r.carName) && !(car.getIsRented()))
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
}