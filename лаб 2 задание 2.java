public class lab2 {
    public static void main(String[] args){
        Dog a =new Dog("Мясо","Россия", true);
        Cat b = new Cat("Рыба","Россия", false);
        Horse c = new Horse("Сено","Россия", "Орловская");
        Animal[] animals = {a, b, c};
        Veterinar vet = new Veterinar();
        Veterinar.treatAnimal(animals);
    }
}
public class Animal {
    String food;
    String location;
    String animalType;
    public Animal (String food, String location) {
        this.food=food;
        this.location=location;
        animalType="Животное";
    }
    public String makeNoise(){
        return animalType + "издаёт звуки";
    }
    public String eat(){
        return animalType + "ест";
    }
    public String sleep(){
        return animalType + "спит";
    }
}
public class Cat extends Animal{
    boolean isKnowWhereWc;
    public Cat(String food, String location, boolean isKnowWhereWc) {
        super(food, location);
        this.isKnowWhereWc=isKnowWhereWc;
        animalType="Кошка";
    }
}
public class Dog extends Animal{
    boolean isKnowCommands;
    public Dog(String food, String location, boolean isKnowCommands) {
        super(food, location);
        this.isKnowCommands = isKnowCommands;
        animalType="Собака";
    }
}
public class Horse extends Animal{
    String poroda;
    public Horse(String food, String location, String poroda) {
        super(food, location);
        this.poroda=poroda;
        animalType="Лошадь";
    }
}
class Veterinar {
    public static void treatAnimal(Animal[] animals){
        for (Animal a:animals){
            System.out.println(a.food + " " + a.location);
        }
    }
}

