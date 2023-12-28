public class Dog extends Animal {
    public static void main(String[] args) {
        Animal p= new Animal();

       p.printInfo("Dog",12);


        System.out.println("name of the Animal is "+name + "age of the animal is "+age );
        makeSound();


    }
    public static  void makeSound(){
        System.out.println("cat sounds like bow bow " );
    }


}
