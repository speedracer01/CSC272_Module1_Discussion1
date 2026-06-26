public class ClassAndObject 
{
    public static void main(String[] args) 
    {

        /* Below are the objects. They all consist of their own data. */
        Car car1 = new Car("Porsche", "911GT2", "700");
        Car car2 = new Car("Chevrolet", "Corvette", "670");

        car1.rev();
        car2.rev();

        car1.info();
        car2.info();


    }
}

/* Below is the class. This is the template that for the build of the object. */

class Car 
{
        String make;
        String model;
        String hp;

        /* Below is the constructor. the provided object data has to follow the format below.  */        
        Car(String carMake, String carModel, String horsePower) 
        {
        make = carMake;
        model = carModel;
        hp = horsePower;
        }

        /* Below are the methods that can be used only by the Car objects. */
        void rev() 
        {
        System.out.println("The " + make + " " + model + " goes vroom vroooom!");
        }

        void info()
        {
        System.out.println("The " + make + " " + model + " has " + hp + " horsepower!");
        }
}