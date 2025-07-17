import java.util.function.Function;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

//import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

class Myfunction implements Function<String ,Integer>{
    @Override
    public Integer apply(String animalname) {
        return animalname.length();
    }
}

public class Test6 {
    public static void main(String[] args ) {
    Function<String,Integer> fo =  new Myfunction();
    int savelength = fo.apply("Zebra");
    System.out.println("the lenght of zebra name is  ; "+ savelength);
//    System.out.println("the lenght using length function "+ length());
}
}
