package inheritance;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private String fur;

    public Dog (String name, int brain, int body, int size, int weight,int eyes,int legs,String fur) {
        super(name, 1, 1, 20, 35);
        this.eyes = eyes;
        this.legs = legs;
        this.fur = fur;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat () {
        System.out.println("Dog.eat() called");
        chew();

    }
}
