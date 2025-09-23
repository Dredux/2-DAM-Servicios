package AnimalConversation;
public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    String talk() {
        return "Meooow";
    }
}
