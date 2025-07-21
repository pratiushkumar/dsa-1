import java.util.Random;

public class GenPrp<RandomType> {
    RandomType valuestore;

    GenPrp(RandomType valuearg) {
        this.valuestore = valuearg;

    }
    // Generating setters and getters
    public RandomType getValuestore() {
        return valuestore;
    }
    public void setValuestore(RandomType t) {
        this.valuestore= t;
    }
    public void displayContent() {
        System.out.println("this is the value that have been stored lately "+ valuestore);

    }
    public static void main(String[] args) {
        GenPrp<Integer> obj = new GenPrp<>(10);
        obj.setValuestore(20);
        obj.getValuestore();
        int getvalue = obj.getValuestore();
        System.out.println("the value of getvaluestore" + getvalue);
           System.out.println("the value that got entered with "+obj);
        GenPrp<String> Stringobj =  new GenPrp<>("bobs and vagena");
        String object = String.valueOf(Stringobj);
        System.out.println("the new value of String form "+object);
    }
}
