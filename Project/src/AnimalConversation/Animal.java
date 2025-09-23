package AnimalConversation;
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String talk();
}