package javaClass.JavaCore;

public class PolymorphynismClass {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();  // Create a Animal object
		Animal myPig = new Pig();  // Create a Pig object
		Animal myDog = new Dog();  // Create a Dog object
		Animal myHorse = new Horse();
		newAnimal newanimal= new newAnimal();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
		myHorse.animalSound();
		newanimal.animalSounds();
		newanimal.sleep();
	}
}
class newAnimal implements JavaInterface{
	@Override
	public void animalSounds() {
		// TODO Auto-generated method stub
		System.out.println("Interface has now animal sounds");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("All the animals are sleeping");
	}

}




