public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car1 = new Car("red", "BMW", 5);
        Car car2 = new Car("blue", "Audi", 3);
        Car car3 = new Car("blue", "VW", 3);
<<<<<<< HEAD

        Car car4 = new Car("white", "toyota", 3);
        if (car4.getManufacturer() == "toyota");
            factory.buildCar(car4);

        factory.buildCar(car1);
        factory.buildCar(car2);
	    factory.buildCar(car2);	

=======

        factory.buildCar(car1);
        factory.buildCar(car2);
>>>>>>> merge-conflict
    }
}

