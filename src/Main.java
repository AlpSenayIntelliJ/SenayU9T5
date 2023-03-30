import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Animal animal2 = new Animal("some animal");
        Cow cow2 = new Cow("Mr. Moo Cow");
        Dog dog2 = new Dog("Fido");
        Puppy puppy2 = new Puppy("Lil Rascal");
        Vet amySmith = new Vet("Amy Smith");
        amySmith.addClient(animal2); // not a client yet
        amySmith.addClient(cow2);    // not a client yet
        amySmith.addClient(dog2);    // not a client yet
        amySmith.addClient(puppy2);  // not a client yet
        amySmith.addClient(animal2); // ALREADY A CLIENT
        amySmith.addClient(cow2);    // ALREADY A CLIENT
        amySmith.addClient(dog2);    // ALREADY A CLIENT
        amySmith.addClient(puppy2);  // ALREADY A CLIENT


    }
}
