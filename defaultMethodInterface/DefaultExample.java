package java8.defaultMethodInterface;

interface Animal {
	public String getName();

	public default void printMessage() {
		System.out.println("This is the default message");
	}
}

class Dog implements Animal {
	private String name;

	public Dog(String name) {
		System.out.println(this.name = name);

	}

	public String getName() {
		return name;
	}
}

public class DefaultExample {

	public static void main(String[] args) {
		Dog dog = new Dog("appu");
		dog.printMessage();

	}

}
