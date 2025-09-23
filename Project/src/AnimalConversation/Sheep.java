package AnimalConversation;
public class Sheep extends Animal{
    public Sheep(String name) {
        super(name);
    }

    @Override
    String talk() {
        return "Beee";
    }
}
