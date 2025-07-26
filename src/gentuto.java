import java.lang.reflect.GenericArrayType;

public class gentuto<T> {
    private T t;
    public void setT(T to) {
        this.t = to;
    }
    public T getT() {
        return t;
    }
    public static void main(String[] args) {
        gentuto t = new gentuto();
        t.setT(10);
       System.out.println(t.getT());

    }
}
