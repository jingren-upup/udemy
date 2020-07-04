import inheritance.Animal;
import inheritance.Dog;
import t34.ComplexNumber;


public class main {
    public static void main (String[] args) {
        Animal animal = new Animal("Panda",1,1,5,5);

        Dog dog = new Dog("jiji",1,1,1,1,2,3,"long black");
        dog.eat();



//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.add(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

    }

}
