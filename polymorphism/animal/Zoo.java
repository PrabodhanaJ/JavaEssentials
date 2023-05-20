package polymorphism.animal;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();

        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();// to only for this call, sasha become a instance of Cat

        feed(sasha);


    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your dog food");
        }else if (animal instanceof Cat){
            System.out.println("Here is your cat food");
        }else{
            System.out.println("What do you eat");
        }
    }
}
