package class6;

import java.util.ArrayList;
import java.util.Arrays;

class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {
        System.out.println("동물이 음식을 먹습니다.");
    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {

    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 양날개를 쭉 펴고 날아 다닙니다.");
    }
}
public class AnimalTest {

    public static void main(String[] args) {

        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(human);
//        test.moveAnimal(tiger);
//        test.moveAnimal(eagle);

        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(human, tiger, eagle));

        for (Animal animal : animalList) {
            animal.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
        animal.eating();
    }
}
