import Car

myCar = Car.Car('Toyota', 'Tacoma', 2009)

myCar.addFuel(100)

print('Fuel:', myCar.getFuel())
print('Mileage:', myCar.getMileage())

myCar.drive(35)

print('Fuel:', myCar.getFuel())
print('Mileage:', myCar.getMileage())

