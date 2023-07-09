# Car Rental Business

This repository contains the necessary Java classes for a car rental business. These classes provide the basic functionality for managing cars, customers, and rentals.

## Classes

1. **Car.java**: This class represents a car and contains information such as the car's make, model, year, and availability status.

2. **CarRent.java**: This class is responsible for managing the car rental operations. It includes methods for renting a car, returning a rented car, and checking the availability of cars.

3. **Person.java**: This class represents a person and contains information such as the person's name, contact details, and driving license information.

4. **Rent.java**: This class represents a rental transaction. It contains information such as the rented car, the renting person, the rental start and end dates, and the rental cost.

5. **RentRecord.java**: This class maintains a record of all the rental transactions. It includes methods for adding a new rental record, retrieving rental records by car or person, and calculating the total revenue generated.

## Usage

To use these classes in your car rental business application, follow these steps:

1. Clone this repository to your local machine or download the source code.

2. Import the Java classes into your project.

3. Create instances of the classes as needed in your application code.

4. Use the methods provided by the classes to perform car rental operations, manage customers, and maintain rental records.

5. Customize the classes according to your specific business requirements if necessary.

## Example

Here's an example of how you can use these classes in your car rental application:

```java
// Create a new car
Car car1 = new Car("Toyota", "Camry", 2019);

// Create a new person
Person person1 = new Person("John Doe", "johndoe@example.com", "ABC123");

// Rent the car to the person
CarRent.rentCar(car1, person1);

// Return the rented car
CarRent.returnCar(car1);

// Retrieve rental records for a specific car
RentRecord.getRentalRecordsByCar(car1);

// Calculate the total revenue generated
double totalRevenue = RentRecord.calculateTotalRevenue();
```

Please refer to the individual class files for more details on their methods and usage.

## Contributing

If you'd like to contribute to this project, feel free to fork the repository and submit a pull request. Contributions such as bug fixes, enhancements, or additional features are welcome.

## Acknowledgements

This project was presented by Sir Jomari Joseph Barera, an instructor at VSU (Visayas State University). We would like to thank him for providing the problem statement and guidance for developing the initial version of these Java classes.
