class Car:

    def __init__(self, brand, model, year):
        self.brand = brand
        self.model = model
        self.year = year
        self.gas_level = 0
        self.mileage = 0


    def getBrand(self):
        return self.brand

    def getModel(self):
        return self.model

    def getYear(self):
        return self.year

    def getFuel(self):
        return self.gas_level

    def getMileage(self):
        return self.mileage

    def drive(self, distance):
        range = self.gas_level-distance
        if(range < 0):
            self.mileage += self.gas_level
            self.gas_level = 0
        else:
            self.mileage += distance
            self.gas_level -= distance

    def addFuel(self, amount):
        self.gas_level += amount

