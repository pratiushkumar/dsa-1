public class BondeGeneric<T extends Number> {
    T[] array;

    //pass the constructor to an array of type T
    BondeGeneric(T[] t) {
        array = t;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i].doubleValue();
        }
            return sum / array.length;

    }


}
