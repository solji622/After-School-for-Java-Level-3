package poly.ex6;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		Chicken chicken = new Chicken();
		
		soundAnimal(dog);
		soundAnimal(bird);
		soundAnimal(chicken);
		
		flyAnimal(bird);
		flyAnimal(chicken);
	}
	
	public static void soundAnimal(AbstractAnimal animal){
		System.out.println("동물 울음 소리");
		animal.sound();
	}
	
	public static void flyAnimal(Fly fly) {
		System.out.println("동물이 날아간다");
		fly.fly();
	}
}
