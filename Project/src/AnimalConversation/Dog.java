package AnimalConversation;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    String talk() {
        return "Wof wof";
    }
}
